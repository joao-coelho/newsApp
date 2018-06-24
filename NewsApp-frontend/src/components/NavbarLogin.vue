<template>
  <b-row id="navbar-section">
    <b-col cols="12">
      <b-navbar type="dark">
        <b-navbar-brand>
          <img src="../assets/images/logo.png" class="d-inline-block align-center" alt="Brand Logo">
          Brand Name
        </b-navbar-brand>
        <b-navbar-nav>
          <b-nav-item-dropdown :text="lang.toUpperCase()">
            <b-dropdown-item @click='changeLang("en")'>EN</b-dropdown-item>
            <b-dropdown-item @click='changeLang("pt")'>PT</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>
      </b-navbar>
    </b-col>
  </b-row>
</template>

<script>
export default {
  name: 'navbar-login',
  data () {
    return {
      lang: this.$i18n.locale
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
    background-color: $blue;
    border-bottom: 1px solid #29487d;
    height: 50px;
    flex-wrap: nowrap;
  }
  .navbar-brand img {
    height: 30px;
    width: 30px;
    margin-right: 10px;
  }
  .dropdown-item {
    color: #2c3e50;
    &:hover {
      background-color: #efefef;
    }
  }
}
</style>
