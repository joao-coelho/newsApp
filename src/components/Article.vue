<template>
  <div id="article">
    <b-button @click="openArticle()">Abrir</b-button>
    <!-- Find a way to change width for mobile -->
    <v-dialog/>
    <modal name="article-modal" height="auto" width="60%" :scrollable="true">
      <div id="article-content">
        <b-button id="close-button" @click="hide()"
          variant="link">
          <font-awesome-icon icon="times-circle" size="lg"
          color="#ee0000"/>
        </b-button>
        <b-container fluid>
          <b-row>
            <b-col md="10">
              <h3> {{title}} </h3>
            </b-col>
            <b-col md="2">
              <b-button id="like-button" @click="like()"
                variant="link">
                <i id="heart-icon" ref="heart" class="fa-2x far fa-heart"></i>
              </b-button>
            </b-col>
          </b-row>
          <b-row>
            <b-col md="2" id="col-left">
              <h4> Source </h4>
              <b-img :src="source_image" fluid alt="Channel img"/>
              <a href="#"> <p>Send me to the original</p> </a>
              <a href="#"> <p>Open channel</p> </a>
              <h4> Share </h4>
              <a href="#"><i class="fa-3x fab fa-twitter"></i></a>
              <a href="#">
                <i class="fa-3x fab fa-facebook"></i>
              </a>
              <a href="#"> <p>Share with a subscriber</p> </a>
            </b-col>
            <b-col md="10" id="col-right">
              <h5> {{subtitle}} </h5>
              <p> {{author}} |
                  {{date.toUTCString()}}
              </p>
              <p> {{content}} </p>
              <b-img :src="image" fluid alt="News img"/>
              <comment-section></comment-section>
              <a href="#article-content" id="go-top"> <p>Take me to the top</p> </a>
            </b-col>
          </b-row>
        </b-container>
      </div>
    </modal>
  </div>
</template>


<script>
import CommentSection from './CommentSection'
import axios from 'axios'

export default {
  name: 'Article',
  components: {
    CommentSection
  },
  data() {
    return {
      id: 1,
      title: "Some random titlaaaaaaaa aaaaaa aaaaaa aaaaa aaaaae",
      subtitle: "Some subtitle Some subtitleSome ",
      source: "source",
      source_image: "https://cdn.freebiesupply.com/logos/large/2x/cnn-1-logo-png-transparent.png",
      date: new Date(),
      author: "Some author",
      content: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, \
      sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \
      Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris \
      nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in \
      reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla \
      pariatur. Excepteur sint occaecat cupidatat non proident, sunt in \
      culpa qui officia deserunt mollit anim id est laborum. \
      Lorem ipsum dolor sit amet, consectetur adipiscing elit, \
      sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \
      Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris \
      nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in \
      reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla \
      pariatur. Excepteur sint occaecat cupidatat non proident, sunt in \
      culpa qui officia deserunt mollit anim id est laborum.",
      image: "http://excitronpartners.com/wp-content/uploads/2016/11/deg-deg-1.jpg",
      heart: "far", // it will be necessary to check if the user likes this post (not possible right now)
      next: "fas"
    }
  },
  props: {
    element: {
      type: Number,
      required: false
    }
  },
  methods: {
    openArticle() {
      //cuidado - a porta nao esta 8888
      axios.get('http://localhost:8888/articles/article', {
        params: {
          id: 2610
        }
      })
      .then(resp => {
        if(resp.data["content"] != undefined) {
          this.content = resp.data["content"];
          this.title = resp.data["title"];
          this.subtitle = resp.data["subtitle"];
          this.show();
        } else {
          this.$modal.show('dialog', {
            title: 'Alert!',
            text: 'This article is not available!',
            buttons: [
              {
                title: 'Close'
              }
            ]
          });
        }
      }).catch(function (error) {
        console.log(error);
      });
    },
    show () {
      this.$modal.show('article-modal');
    },
    hide () {
      this.$modal.hide('article-modal');
    },
    like () {
      // send like to server first
      axios.post
      let icon = this.$refs.heart;
      let current = this.heart;
      let str = icon.className.replace(this.heart, this.next);
      icon.className = str;
      this.heart = this.next;
      this.next = current;
    }
  },
  created: function () {
    this.openArticle();
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

@import "styles/global.scss";
h2, h5 {
  text-align: center;
}


#article-content {
  h5, h3 {
    color: #000;
  }
  h4 {
    color: #555555;
    font-weight: bold;
  }

  margin: 1em;
}


#close-button {
  float: right;
}

#col-left, #col-right {
  margin-top: 3em;
  position: relative;
}

#col-left {
  text-align: center;
  font-size: 0.8em;
  p, img {
    margin-bottom: 1em;
  }
  img {
    max-height: 100px;
  }
}

#heart-icon {
  color: #dd0000;
}

#col-right {
  text-align: justify;
  img {
    margin-bottom: 2em;
  }
}

#go-top {
  text-align: center;
}

</style>
