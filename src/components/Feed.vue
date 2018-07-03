<template>
  <div class="feed">
    <b-container fluid>
      <navbar-feed></navbar-feed>
      <b-row id="main-content">
        <sidebar-menu></sidebar-menu>
        <div id="news-section">
          <feed-element v-for="item in news" :element="item" :key="item.id"></feed-element>
        </div>
        <b-button id="addBtn" v-b-modal.modal>+</b-button>
        <b-tooltip target="addBtn" :title="$t('feed_addNews')" delay=1500></b-tooltip>
      </b-row>
      <b-row id="main-content-small">
        <b-col>
          <sidebar-menu small_screen></sidebar-menu>
          <feed-element-vertical v-for="item in news" :element="item" :key="item.id"></feed-element-vertical>
          <b-button id="addBtn" v-b-modal.modal>+</b-button>
          <b-tooltip target="addBtn" :title="$t('feed_addNews')" delay=1500></b-tooltip>
        </b-col>
      </b-row>
    </b-container>
    <b-modal id="modal" :title="$t('feed_modalTitle')"
             ok-only :ok-title="$t('feed_modalSubmit')"
             header-text-variant="white" @ok="publishArticle">
      <b-container fluid id="newsForm">
        <b-row>
          <b-col>
            <b-form-group :label="$t('feed_newsTitle')"
                          label-for="newsTitleModal">
              <b-form-input id="newsTitleModal"
                            v-model="newsTitle"
                            type="text"
                            required
                            @input="no_title=false"
                            :placeholder="$t('feed_newsTitlePlaceholder')">
              </b-form-input>
              <b-form-text v-if="no_title" class="required_alert">
                {{ $t('register_required') }}
              </b-form-text>
            </b-form-group>
            <b-form-group :label="$t('feed_newsContent')"
                          label-for="newsContentModal">
              <b-form-textarea id="newsContentModal"
                   v-model="newsContent"
                   @input="no_content=false"
                   :placeholder="$t('feed_newsContentPlaceholder')"
                   :rows="9">
              </b-form-textarea>
              <b-form-text v-if="no_content" class="required_alert">
                {{ $t('register_required') }}
              </b-form-text>
            </b-form-group>
            <div class="categoriesPlaceholder">
              <p>{{ $t('feed_newsCategory') }}</p>
              <b-form-text v-if="no_categories" class="required_alert">
                {{ $t('register_required') }}
              </b-form-text>
            </div>
            <b-row>
              <b-col sm="4">
                <b-form-group>
                  <b-form-checkbox-group stacked
                                         v-model="newsSelectedTypes"
                                         @change="changeCategories"
                                         :options="types1">
                  </b-form-checkbox-group>
                </b-form-group>
              </b-col>
              <b-col sm="4">
                <b-form-group>
                  <b-form-checkbox-group stacked
                                         v-model="newsSelectedTypes"
                                         @change="changeCategories"
                                         :options="types2">
                  </b-form-checkbox-group>
                </b-form-group>
              </b-col>
              <b-col sm="4">
                <b-form-group>
                  <b-form-checkbox-group stacked
                                         v-model="newsSelectedTypes"
                                         @change="changeCategories"
                                         :options="types3">
                  </b-form-checkbox-group>
                </b-form-group>
              </b-col>
            </b-row>
            <p>{{ $t('feed_newsImage') }}</p>
            <input v-if="!newsImage" type="file" @change="onFileChange">
            <div id="modalImg" v-else>
              <b-img :src="newsImage" fluid alt="Load Image"/>
              <b-button variant=outline-danger @click="removeImage">X</b-button>
            </div>
          </b-col>
        </b-row>
        <b-row v-if="successfullyPublished" style="margin-top: 15px; justify-content: center">
          <b-alert variant="success" show dismissible>{{ $t('feed_publishSuccess') }}</b-alert>
        </b-row>
      </b-container>
    </b-modal>
  </div>
</template>

<script>
import NavbarFeed from './NavbarFeed'
import SidebarMenu from './SidebarMenu'
import FeedElement from './FeedElement'
import FeedElementVertical from './FeedElementVertical'

export default {
  name: 'Feed',
  components: {
    NavbarFeed,
    SidebarMenu,
    FeedElement,
    FeedElementVertical
  },
  data () {
    return {
      newsTitle: "",
      newsContent: "",
      newsSelectedTypes: [],
      newsImage: '',
      categories: Array,
      channelName: String,
      news: [],
      fromLogin: false,
      no_title: false,
      no_content: false,
      no_categories: false,
      successfullyPublished: false
    }
  },
  computed: {
    allCategories() {
      var list = require('../../static/language/categories.json');
      return list;
    },
    types1() {
      return this.typesBuilder(0, 5, this.allCategories);
    },
    types2() {
      return this.typesBuilder(5, 10, this.allCategories);
    },
    types3() {
      return this.typesBuilder(10, 15, this.allCategories);
    }
  },
  methods: {
    typesBuilder(min, max, list) {
      var res = [];
      if (this.$i18n.locale == 'en') {
        for(var i = min; i < max; i++){
          let obj = {
            "text": list[i].en,
            "value": list[i].value
          }
          res.push(obj);
        }
      }
      else {
        for(var i = min; i < max; i++){
          let obj = {
            "text": list[i].pt,
            "value": list[i].value
          }
          res.push(obj);
        }
      }
      return res;
    },
    onFileChange(e) {
      var files = e.target.files || e.dataTransfer.files;
      if (!files.length)
        return;
      this.createImage(files[0]);
    },
    createImage(file) {
      var image = new Image();
      var reader = new FileReader();
      var vm = this;

      reader.onload = (e) => {
        vm.newsImage = e.target.result;
      };
      reader.readAsDataURL(file);
    },
    removeImage: function (e) {
      this.newsImage = '';
    },
    changeCategories() {
      this.no_categories = false;
    },
    publishArticle(event) {
      event.preventDefault();
      if (this.newsTitle == "")
        this.no_title = true;
      if (this.newsContent == "")
        this.no_content = true;
      if (this.newsSelectedTypes.length == 0)
        this.no_categories = true;

      let article = {
        title: this.newsTitle,
        content: this.newsContent,
        categories: this.newsSelectedTypes,
        image_url: '',
        channel_id: this.$store.getters.getChannelId,
        token: this.$store.getters.getToken
      }
      console.log(article);

      this.$axios({url: '/articles/addArticle', data: article, method: 'POST' })
        .then(resp => {
          var sucess = resp.data;
          if(sucess == 1) {
            this.successfullyPublished = true;
          }
        })
    }
  },
  mounted() {
    var menu = document.getElementsByClassName("sidebar-menu-list")[0];
    if (menu) {
      var $li = menu.firstChild.childNodes;
      $li[0].classList.add("active");
    }
    if (!this.fromLogin) {
      this.$axios.get("/feed/newFeed", {
        params: {
          token: this.$store.getters.getToken
        }
      })
      .then( resp => {
        this.news = resp.data
      })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

@import "styles/global.scss";

#main-content {
  @media (max-width: $break-medium) {
    display: none;
  }
}
#main-content-small {
  margin-top: 55px;
  @media (min-width: $break-medium) {
    display: none;
  }
  #addBtn {
    bottom: 1.5rem;
    right: 1.5rem;
  }
}
#news-section {
  padding: 2rem 4rem;
  margin-top: 50px;
  margin-left: 225px;
  width: calc(100% - 225px);
  @media (min-width: $break-large) {
    padding: 2rem 7rem;
  }
  @media (max-width: $break-medium) {
    display: flex;
    flex-direction: column;
    justify-content: center;
    margin-left: 0;
    margin-top: 0;
    width: 100%;
    padding: 2rem 0.5rem;
  }
}
#addBtn {
  position: fixed;
  bottom: 3rem;
  right: 3rem;
  border-radius: 30px;
  padding: 4px 14px;
  font-size: 25px;
  border-color: #39487d;
  &:hover {
    background-color: #29487d;
  }
  color: white;
  background-color: $blue;
}
#modal {
  #modalImg {
    display: flex;
    button {
      padding: 0;
      height: 30px;
      width: 30px;
    }
    img {
      width: 250px;
      height: 150px;
    }
  }
  .categoriesPlaceholder {
    display: flex;
    @media (max-width: $break-small) {
      flex-direction: column;
      p {
        margin-bottom: 0;
      }
    }
  }
  .required_alert.form-text {
    margin-bottom: 0.5rem;
    margin-left: 1rem;
    &.text-muted {
      color: rgba(255, 0, 0, 0.75) !important;
    }
  }
}
</style>
