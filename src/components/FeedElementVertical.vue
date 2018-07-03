<template>
  <b-card img-top
          :img-src="element.image"
          :title="element.title">
    <b-row class="news-secondary">
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
    </b-row>
    <b-row class="news-main">
      {{ element.content }}
    </b-row>
  </b-card>
</template>

<script>
export default {
  name: 'feed-element-vertical',
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
  border: 0.5px solid #ccc;
  margin-bottom: 2rem;
  &:hover {
    cursor: pointer;
  }
  .card-title {
    color: $blue;
    font-size: 1.15rem;
    font-weight: bold;
    text-align: center;
  }
  .news-secondary {
    @include flex-layout(center, center);
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
    display: block;
  }
}
</style>
