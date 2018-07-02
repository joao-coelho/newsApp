<template>
  <div>
    <b-card>
      <img class="channel-logo" :src="element.channel.icon" alt="Channel Logo">
      <img class="news-image" v-if="element.image != ''" :src="element.image" left alt="News image"/>
      <div class="news-content">
        <h5 class="news-title">{{ element.title }}</h5>
        <div class="news-secondary">
          <div class="channel-name">
            <span>{{ element.channel.name }}</span>
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
      <div class="news-share">
        <img src="../assets/images/twitter.png"/>
        <img src="../assets/images/facebook.png"/>
      </div>
    </b-card>
  </div>
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
      return this.element.datetime.time;
    }
  }
}
</script>

<style scoped lang="scss">

@import "styles/global.scss";

.card {
  width: 100%;
  height: 150px;
  border: 0.5px solid #ccc;
  margin-top: 2rem;
  .news-image {
    width: 250px;
    height: 99%;
    float: left;
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
    margin-left: 250px;
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
    padding: 0;
  }
}

</style>
