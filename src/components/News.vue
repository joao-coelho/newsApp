<template>
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
            <h3> {{element.title}} </h3>
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
            <h5> Source </h5>
            <b-img :src="element.channelIcon" fluid alt="Channel img" style="margin-bottom: 25px;"/>
             <a href="#"> <p>Open channel</p> </a>
            <h5> Share </h5>
            <a href="#"><i class="fa-3x fab fa-twitter"></i></a>
            <a href="#">
              <i class="fa-3x fab fa-facebook"></i>
            </a>
            <a href="#"> <p>Share with a subscriber</p> </a>
          </b-col>
          <b-col md="10" id="col-right">
            <p> {{element.channelName}} |
                {{element.date}}
            </p>
            <p> {{element.content}} </p>
            <b-img :src="element.imageUrl" fluid alt="News img"/>
            <comment-section></comment-section>
            <a href="#article-content" id="go-top"> <p>Take me to the top</p> </a>
          </b-col>
        </b-row>
      </b-container>
    </div>
  </modal>
</template>


<script>
import CommentSection from './CommentSection'
import axios from 'axios'

export default {
  name: 'News',
  components: {
    CommentSection
  },
  data() {
    return {
      heart: "far", // it will be necessary to check if the user likes this post (not possible right now)
      next: "fas"
    }
  },
  props: {
    element: {
      type: Object,
      required: false
    }
  },
  methods: {
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
