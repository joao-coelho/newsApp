<template>
  <div class="toggable-menu" v-if="small_screen">
    <div class="sidebar" ref="menu">
      <a href="javascript:void(0)" class="closebtn" @click="closeMenu">&times;</a>
      <ul id="menu-content" class="menu-content">
        <li>
          <router-link to="/"><font-awesome-icon icon="newspaper"/>
            {{ $t('feed_menuNews') }}
          </router-link>
        </li>
        <li @click="changeOpt($event.target)">
          <a href="#"><font-awesome-icon icon="fire"/>
            {{ $t('feed_menuTrending') }}
          </a>
        </li>
        <li>
          <router-link to='/subscriptions'><font-awesome-icon icon="list-ul"/>
            {{ $t('feed_menuSubscriptions') }}
          </router-link>
        </li>
        <li @click="changeOpt($event.target)">
          <a href="#"><font-awesome-icon icon="thumbs-up"/>
            {{ $t('feed_menuLikes') }}
          </a>
        </li>
        <hr/>
        <h4>{{ $t('feed_menuCategories') }}</h4>
        <li @click="changeOpt($event.target)" v-for="category in categories">
          <a v-if="$i18n.locale == 'en'" href="#"><font-awesome-icon :icon="category.icon"/>
            {{ category.en }}
          </a>
          <a v-else href="#"><font-awesome-icon :icon="category.icon"/>
            {{ category.pt }}
          </a>
        </li>
        <hr/>
        <li @click="changeOpt($event.target)">
          <a href="#"><font-awesome-icon icon="heart"/>
            {{ $t('feed_menuPreferences') }}
          </a>
        </li>
        <li @click="changeOpt($event.target)">
          <a href="#"><font-awesome-icon icon="cog"/>
            {{ $t('feed_menuSettings') }}
          </a>
        </li>
        <li @click="changeOpt($event.target)">
          <a href="#"><font-awesome-icon icon="question-circle"/>
            {{ $t('feed_menuHelp') }}
          </a>
        </li>
      </ul>
    </div>
    <b-row class="menu-btn">
      <b-col>
        <a class="toggle-btn" @click="openMenu"><font-awesome-icon icon="bars"/></a>
      </b-col>
    </b-row>
  </div>
  <div v-else class="nav-side-menu">
    <div class="sidebar-menu-list">
      <ul id="menu-content" class="menu-content">
        <li>
          <router-link to="/"><font-awesome-icon icon="newspaper"/>
            {{ $t('feed_menuNews') }}
          </router-link>
        </li>
        <li @click="changeOpt($event.target)">
          <a href="#"><font-awesome-icon icon="fire"/>
            {{ $t('feed_menuTrending') }}
          </a>
        </li>
        <li>
          <router-link to='/subscriptions'><font-awesome-icon icon="list-ul"/>
            {{ $t('feed_menuSubscriptions') }}
          </router-link>
        </li>
        <li @click="changeOpt($event.target)">
          <a href="#"><font-awesome-icon icon="thumbs-up"/>
            {{ $t('feed_menuLikes') }}
          </a>
        </li>
        <hr/>
        <h4>{{ $t('feed_menuCategories') }}</h4>
        <li @click="changeOpt($event.target)" v-for="category in categories">
          <a v-if="$i18n.locale == 'en'" href="#"><font-awesome-icon :icon="category.icon"/>
            {{ category.en }}
          </a>
          <a v-else href="#"><font-awesome-icon :icon="category.icon"/>
            {{ category.pt }}
          </a>
        </li>
        <hr/>
        <li @click="changeOpt($event.target)">
          <a href="#"><font-awesome-icon icon="heart"/>
            {{ $t('feed_menuPreferences') }}
          </a>
        </li>
        <li @click="changeOpt($event.target)">
          <a href="#"><font-awesome-icon icon="cog"/>
            {{ $t('feed_menuSettings') }}
          </a>
        </li>
        <li @click="changeOpt($event.target)">
          <a href="#"><font-awesome-icon icon="question-circle"/>
            {{ $t('feed_menuHelp') }}
          </a>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  name: 'sidebar-menu',
  props: {
    small_screen: {
      type: Boolean
    }
  },
  methods: {
    changeOpt(target) {
      var menu = document.getElementsByClassName("sidebar-menu-list")[0];
      var list = menu.firstChild.childNodes;

      for (var i = 0; i < list.length; i++) {
        var curr_elem = list[i].classList || "";
        var leave = false;
        if (curr_elem != "") {
          if (curr_elem.contains("active")) {
            leave = true;
            curr_elem.remove("active");
          }
        }
        if (leave) break;
      }
      target.classList.add("active");
    },
    openMenu() {
      var sidebar = this.$refs.menu;
      sidebar.style.width = "225px";
    },
    closeMenu() {
      var sidebar = this.$refs.menu;
      sidebar.style.width = "0";
    }
  },
  computed: {
    user: mapState({ user: state => state.user.profile }),
    categories() {
      var list = require('../../static/language/categories.json');
      return list.filter(category => {
        let val = category.value;
        return this.user.categories.includes(val);
      });
    }
  },
  mounted() {
    var menu = document.getElementsByClassName("sidebar-menu-list")[0];
    menu.style.paddingRight = menu.offsetWidth - menu.clientWidth + "px";
  }
}
</script>

<style scoped lang="scss">

@import "styles/global.scss";

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
ul, li {
  list-style: none;
  padding: 0px;
  margin: 0px;
  line-height: 35px;
  cursor: pointer;
}
li {
  padding: 0.3rem 1rem 0.2rem 1.5rem;
  &:hover {
    background-color: #ddd;
    a svg {
      color: $blue;
    }
  }
  &.active {
    background-color: #ddd;
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
.nav-side-menu {
  font-size: 1rem;
  font-weight: 200;
  border-right: 1px solid #29487d;
  position: fixed;
  width: 225px;
  height: calc(100% - 50px);
  margin-top: 50px;
  padding: 0;
  overflow: hidden;
  .sidebar-menu-list {
    padding-top: 1rem;
    padding-bottom: 1rem;
    overflow-y: scroll;
    padding-right: 0;
    box-sizing: content-box;
    width: 100%;
    height: calc(100% - 50px);
    @media (max-width: $break-medium) {
      display: none;
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
    .sidebar-menu-list .menu-content {
      display: block;
    }
  }
}
.toggable-menu {
  .menu-btn {
    margin-bottom: 1rem;
    margin-top: 1rem;
    svg {
      font-size: 1.3rem;
    }
    a:hover {
      cursor: pointer;
    }
  }
  .sidebar {
    height: calc(100% - 80px);
    width: 0;
    position: fixed;
    z-index: 1;
    top: 50px;
    left: 0;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 1rem;
    padding-bottom: 1rem;
    overflow-y: scroll;
    padding-right: 0;
    box-sizing: content-box;
    background-color: $backgr-grey;
    & > a {
      position: absolute;
      top: 0;
      right: 25px;
      font-size: 36px;
      margin-left: 50px;
      color: $blue;
      &:hover {
        cursor: pointer;
        text-decoration: none;
        color: black;
      }
    }
  }
}
</style>
