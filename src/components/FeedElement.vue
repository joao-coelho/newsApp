<template>
  <b-card>
    <b-container fluid>
      <b-row>
        <b-col md="4" class="no-padding">
          <b-img v-if="element.imageUrl"
                 center
                 :src="element.imageUrl"
                 fluid alt="News image"/>
          <b-img v-else
                 center
                 src="../assets/images/default-news.jpg"
                 fluid alt="News image"/>
        </b-col>
        <b-col md="8">
          <div class="news-content">
            <h5 class="news-title">{{ element.title }}</h5>
            <div class="news-secondary">
              <div class="channel-name">
                <span>{{ element.channelName }}</span>
              </div>
              <div class="num-likes">
                <span>{{ element.likes }}</span>
                <font-awesome-icon icon="thumbs-up"/>
              </div>
              <div class="news-time">
                <span>{{ when }}</span>
                <font-awesome-icon icon="clock"/>
              </div>
            </div>
          <!--<div v-line-clamp:20="3" class="news-main">-->
            <div class="news-main">
              {{ element.content }}
            </div>
          </div>
        </b-col>
      </b-row>
    </b-container>
    <b-img class="channel-logo" v-if="element.channelIcon"
           rounded="circle"
           :src="element.channelIcon"
           alt="Channel Logo"/>
    <b-img class="channel-logo" v-else
           rounded="circle"
           src="../assets/images/default-avatar.jpg"
           alt="Channel Logo"/>
    <div class="news-share">
     <img src="../assets/images/twitter.png"/>
     <img src="../assets/images/facebook.png"/>
    </div>
  </b-card>
</template>

<script>
export default {
  name: 'feed-element',
  props: {
    element: {
      type: Object,
      required: true
    }
  },
  methods: {

  },
  computed: {
    when() {
      //TODO: Handle the date format of the databse
      //var date = new Date();
      return this.element.date;
    }
  }
}
</script>

<style scoped lang="scss">

@import "styles/global.scss";

.card {
  width: 100%;

  border: 0.5px solid #ccc;
  margin-top: 2rem;
  &:hover {
    cursor: pointer;
  }

  .no-padding {
    padding: 0;
  }

  .channel-logo {
    position: absolute;
    width: 40px;
    height: 40px;
    top: -10px;
    left: -10px;
  }
  .news-share {
    position: absolute;
    top: -15px;
    right: -10px;
    img {
      margin-left: 10px;
      &:hover {
        cursor: pointer;
      }
    }
  }
  .news-content {
    height: 100%;
    .news-title {
      padding: 1.1rem 1rem 0.25rem 0.5rem;
      color: $blue;
      font-weight: bold;
      @media (max-width: $break-large) {
        font-size: 1.15rem;
      }
      margin-bottom: 0;
    }
    .news-secondary {
      @include flex-layout(flex-start, center);
      flex-wrap: wrap;
      padding: 0 1rem 0 0.5rem;
      .channel-name {
        color: darkgrey;
        font-size: 0.8rem;
        &:hover {
          color: #444;
          cursor: pointer;
          &::after {
            color: darkgrey;
          }
        }
        &::after {
          content: '•';
          margin: 0 10px;
        }
      }
      .num-likes {
        color: darkgrey;
        font-size: 0.8rem;
        &::after {
          content: '•';
          margin: 0 10px;
        }
      }
      .news-time {
        color: darkgrey;
        font-size: 0.8rem;
      }
    }
    .news-main {
      padding: 0.5rem 1rem 0.5rem 0.5rem;
      color: #2c3e50;
      font-size: 0.9rem;
      white-space: nowrap;
      overflow: hidden;
      text-overflow: ellipsis;
      max-height: inherit;
      line-height: 1.1;
    }
  }
  .card-body {
    padding: 0.1em;
  }
}

</style>
