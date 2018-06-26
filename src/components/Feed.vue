<template>
  <div class="feed">
    <b-container fluid>
      <navbar-feed></navbar-feed>
      <sidebar-menu :user_categories="categories"></sidebar-menu>
    </b-container>
  </div>
</template>

<script>
import NavbarFeed from './NavbarFeed'
import SidebarMenu from './SidebarMenu'

export default {
  name: 'Feed',
  components: {
    NavbarFeed,
    SidebarMenu
  },
  data () {
    return {
      categories: [
        "business",
        "sports",
        "health",
        "science",
        "economy",
        "politics"
      ]
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
