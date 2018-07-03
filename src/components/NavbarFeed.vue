<template>
  <b-row id="navbar-section">
    <b-col cols="12">
      <b-navbar type="dark">
        <b-navbar-brand>
          <img src="../assets/images/logo.png" class="d-inline-block align-center" alt="Brand Logo">
          Brand Name
        </b-navbar-brand>
        <b-nav-form id="searchBar">
          <b-form-input size="sm" type="text" :placeholder="$t('feed_searchbar')"></b-form-input>
          <b-button variant="inform" size="sm" class="my-2 my-sm-0" type="submit">></b-button>
        </b-nav-form>
        <div id="myChannel_btn">
          <img src="../assets/images/logo.png" class="d-inline-block align-center" alt="Channel Logo">
          <span>{{ channelName }}</span>
          <div id="notifications">
            <img src="../assets/images/notifications_icon.png" class="d-inline-block align-center" alt="Channel Logo">
            <div id="square">
              <span>1</span>
            </div>
          </div>
        </div>
      </b-navbar>
    </b-col>
  </b-row>
</template>

<script>

export default {
  name: 'navbar-feed',
  data () {
    return {
      lang: this.$i18n.locale
    }
  },
  computed: {
    channelName() {
      return this.$store.getters.getChannel;
    }
  },
  methods: {
    changeLang(lang) {
      this.$i18n.locale = lang;
      this.lang = lang;
    }
  }
}
</script>

<style scoped lang="scss">

@import "styles/global.scss";

#navbar-section {
  div {
    padding: 0;
  }
  .navbar {
    position: fixed;
    top: 0;
    background-color: $blue;
    border-bottom: 1px solid #29487d;
    height: 50px;
    width: 100%;
    flex-wrap: nowrap;
    z-index: 999;
  }
  .navbar-brand {
    @media (max-width: $break-small) {
      display: none;
    }
    img {
      height: 30px;
      width: 30px;
      margin-right: 10px;
    }
  }
  .dropdown-item {
    color: #2c3e50;
    &:hover {
      background-color: #efefef;
    }
  }
  #myChannel_btn {
    @include flex-layout(center, center);
    img {
      width: 2rem;
      height: 2rem;
      margin: auto 0.5rem;
      &:hover {
        cursor: pointer;
      }
    }
    & > span {
      color: #fff;
      &:hover {
        cursor: pointer;
      }
      @media (max-width: $break-medium) {
        display: none;
      }
    }
    #notifications {
      &:hover {
        cursor: pointer;
      }
      display: flex;
      justify-content: center;
      img {
        width: auto;
        height: auto;
        margin: 0;
      }
      #square {
        @include flex-layout(center, center);
        width: 1rem;
        height: 1rem;
        background-color: red;
        margin: 1rem 0 0 -1.6rem;
        span {
          color: #fff;
          font-size: 0.8rem;
          font-weight: bold;
        }
      }
    }
  }
  #searchBar {
    input {
      margin: 0 2px 0 0;
    }
    @media (max-width: $break-medium) {
      .form-control {
        width: 75%;
      }
    }
    @media (min-width: $break-large) {
      .form-control {
        width: 350px;
      }
    }
  }
}
</style>
