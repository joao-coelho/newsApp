<template>
  <div>
    <b-card>
      <img class="channel-logo" :src="element.channel.icon" alt="Channel Logo">
      <img class="news-image" v-if="element.image != ''" :src="element.image" left alt="News image"/>
      <div class="news-content">
        <h4 class="news-title">{{ element.title }}</h4>
        <div class="news-secondary">
          <span>{{ element.channel.name }}</span>
          <span>{{ element.likes }}</span>
          <span>{{ when }}</span>
        </div>
        <div class="news-main">
          <span>{{ element.content }}</span>
        </div>
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
      var date = new Date();
      return date;
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
  .news-image {
    width: 250px;
    height: 100%;
    float: left;
  }
  .channel-logo {
    position: absolute;
    width: 40px;
    height: 40px;
    top: -10px;
    left: -10px;
  }
  .news-content {
    height: 100%;
    margin-left: 250px;
    .news-title {
      padding: 1rem 1rem 0.5rem 0.5rem;
      color: $blue;
      font-weight: bold;
      margin-bottom: 0;
    }
    .news-secondary {
      @include flex-layout(flex-start, center);
      padding: 0 1rem 0.5rem 0.5rem;
      span {
        color: darkgrey;
        margin-right: 30px;
      }
    }
    .news-main {
      padding: 0 1rem 0.5rem 0.5rem;
      color: darkgrey;
    }
  }
  .card-body {
    padding: 0;
  }
}

</style>
