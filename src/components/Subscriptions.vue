<template>
  <div class="subscriptions">
    <b-container fluid>
      <navbar-feed></navbar-feed>
      <b-row id="main-content">
        <sidebar-menu :user_categories="categories"></sidebar-menu>
        <div id="subscriptions-section">
          <b-table hover :items="items" :fields="fields"></b-table>
        </div>
      </b-row>
      <b-row id="main-content-small">
        <b-col>
          <sidebar-menu :user_categories="categories" small_screen></sidebar-menu>
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
      categories: [
        "business",
        "sports",
        "health",
        "science",
        "economy",
        "politics"
      ],
      fields: {
        name: {
          label: this.nameLabel,
          sortable: true
        },
        description: {
          label: this.descriptionLabel,
          sortable: false
        },
        categories: {
          label: this.categoriesLabel,
          sortable: true
        }
      },
      items: [
        {
          name: "Channel Name",
          description: "Channel Description, a long one, reaaaaally long, like huge, yap that big biiiiiiiiiiiiitx",
          categories: "Sports, Business"
        },
        {
           name: "Channel Name",
           description: "Channel Description, a long one, reaaaaally long, like huge, yap that big biiiiiiiiiiiiitx",
           categories: "Sports, Business"
         }
      ]
    }
  },
  computed: {
    nameLabel() {
      return this.$t('subscriptions_nameIcon');
    },
    descriptionLabel() {
      return this.$t('subscriptions_channelDescription');
    },
    categoriesLabel() {
      return this.$t('subscriptions_channelCategories');
    }
  },
  methods: {

  },
  mounted() {
    var menu = document.getElementsByClassName("sidebar-menu-list")[0];
    var $li = menu.firstChild.childNodes;
    $li[4].classList.add("active");
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
