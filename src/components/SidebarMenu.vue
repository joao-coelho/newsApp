<template>
  <b-col md="4" lg="2" class="nav-side-menu">
    <a class="toggle-btn"><font-awesome-icon icon="bars"/></a>
    <div class="menu-list">
      <ul id="menu-content" class="menu-content">
        <li>
          <a href="#"><font-awesome-icon icon="newspaper"/>
            {{ $t('feed_menuNews') }}
          </a>
        </li>
        <li>
          <a href="#"><font-awesome-icon icon="fire"/>
            {{ $t('feed_menuTrending') }}
          </a>
        </li>
        <li>
          <a href="#"><font-awesome-icon icon="list-ul"/>
            {{ $t('feed_menuSubscriptions') }}
          </a>
        </li>
        <li>
          <a href="#"><font-awesome-icon icon="thumbs-up"/>
            {{ $t('feed_menuLikes') }}
          </a>
        </li>
        <hr/>
        <h4>{{ $t('feed_menuCategories') }}</h4>
        <li v-for="category in categories">
          <a v-if="$i18n.locale == 'en'" href="#"><font-awesome-icon :icon="category.icon"/>
            {{ category.en }}
          </a>
          <a v-else href="#"><font-awesome-icon :icon="category.icon"/>
            {{ category.pt }}
          </a>
        </li>
        <hr/>
        <li>
          <a href="#"><font-awesome-icon icon="heart"/>
            {{ $t('feed_menuPreferences') }}
          </a>
        </li>
        <li>
          <a href="#"><font-awesome-icon icon="cog"/>
            {{ $t('feed_menuSettings') }}
          </a>
        </li>
        <li>
          <a href="#"><font-awesome-icon icon="question-circle"/>
            {{ $t('feed_menuHelp') }}
          </a>
        </li>
      </ul>
    </div>
  </b-col>
</template>

<script>
export default {
  name: 'sidebar-menu',
  props: {
    user_categories: {
      type: Array,
      required: true
    }
  },
  methods: {

  },
  computed: {
    categories() {
      var list = require('../../static/language/categories.json');
      return list.filter(category => {
        let val = category.value;
        return this.user_categories.includes(val);
      });
    }
  }
}
</script>

<style scoped lang="scss">

@import "styles/global.scss";

.nav-side-menu {
  font-size: 1rem;
  font-weight: 200;
  border-right: 1px solid #29487d;
  position: static;
  padding: 0;
  .menu-list {
    padding-top: 1rem;
    padding-bottom: 1rem;
    ul, li {
      list-style: none;
      padding: 0px;
      margin: 0px;
      line-height: 35px;
      cursor: pointer;
      /*&:not(collapsed) .arrow:before {
        font-family: FontAwesome;
        content: "\f078";
        display: inline-block;
        padding-left: 10px;
        padding-right: 10px;
        vertical-align: middle;
        float: right;
      }
      .active {
        border-left: 3px solid #d19b3d;
        background-color: #4f5b69;
      }*/
    }
    li {
      padding: 0.3rem 1rem 0.2rem 1.5rem;
      &:hover {
        background-color: #ddd;
      }
      &:active {
        a svg {
          color: $blue;
          font-weight: bold;
        }
      }
      a {
        text-decoration: none;
        color: #2c3e50;
        svg {
          font-size: 1.2rem;
          margin-right: 1.2rem;
        }
      }
    }
  }
  .toggle-btn {
    display: none;
  }
  @media (max-width: 767px) {
    position: relative;
    width: 100%;
    margin-bottom: 10px;
    .toggle-btn {
      display: block;
      cursor: pointer;
      position: absolute;
      right: 10px;
      top: 10px;
      z-index: 10 !important;
      padding: 3px;
      background-color: #ffffff;
      color: #000;
      width: 40px;
      text-align: center;
    }
    .menu-list .menu-content {
      display: block;
    }
  }
  hr {
    width: 90%;
    border-top: 1px solid #29487d;
    opacity: 0.5;
  }
  h4 {
    color: $blue;
    font-size: 1.3rem;
    padding-left: 1.5rem;
  }
}
</style>
