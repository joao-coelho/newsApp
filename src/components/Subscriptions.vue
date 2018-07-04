<template>
  <div class="subscriptions">
    <b-container fluid>
      <navbar-feed></navbar-feed>
      <b-row id="main-content">
        <sidebar-menu></sidebar-menu>
        <div id="subscriptions-section">
          <b-table hover :items="items" :fields="fields"></b-table>
        </div>
      </b-row>
      <b-row id="main-content-small">
        <b-col>
          <sidebar-menu small_screen></sidebar-menu>
          <div id="subscriptions-section">
            <b-table responsive :items="items" :fields="fields"></b-table>
          </div>
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import NavbarFeed from './NavbarFeed'
import SidebarMenu from './SidebarMenu'

export default {
  name: 'Subscriptions',
  components: {
    NavbarFeed,
    SidebarMenu
  },
  data() {
    return {
      items: []
    }
  },
  computed: {
    fields() {
      let labels = [
        this.$t('subscriptions_channelName'),
        this.$t('subscriptions_channelDescription'),
        this.$t('subscriptions_channelCategories'),
        this.$t('subscriptions_channelSubscribers')
      ]

      return {
        channelName: {
          label: labels[0],
          sortable: true
        },
        description: {
          label: labels[1],
          sortable: false
        },
        categories: {
          label: labels[2],
          sortable: true
        },
        subscribers: {
          label: labels[3],
          sortable: true
        }
      }
    },
    nameLabel() {
      return this.$t('subscriptions_channelName');
    },
    descriptionLabel() {
      return this.$t('subscriptions_channelDescription');
    },
    categoriesLabel() {
      return this.$t('subscriptions_channelCategories');
    },
    subscribersLabel() {
      return this.$t('subscriptions_channelSubscribers');
    }
  },
  methods: {

  },
  mounted() {
    var menu = document.getElementsByClassName("sidebar-menu-list")[0];
    if (menu) {
      var $li = menu.firstChild.childNodes;
      $li[4].classList.add("active");
    }
    this.$axios.get("/feed/subscriptions", {
      params: {
        token: this.$store.getters.getToken
      }
    })
    .then( resp => {
      this.items = resp.data;
    })
  }
}
</script>

<style scoped lang="scss">

@import "styles/global.scss";

#main-content {
  @media (max-width: $break-medium) {
    display: none;
  }
  #subscriptions-section {
    padding: 2rem 4rem;
    margin-top: 50px;
    margin-left: 225px;
    width: calc(100% - 225px);
    @media (min-width: $break-large) {
      padding: 2rem 7rem;
    }
    .table {
      background-color: #fff;
    }
  }
}
#main-content-small {
  margin-top: 55px;
  @media (min-width: $break-medium) {
    display: none;
  }
  #subscriptions-section {
    .table-responsive {
      background-color: #fff;
    }
  }
}
</style>
