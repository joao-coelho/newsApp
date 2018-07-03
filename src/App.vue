 <template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App',
  created: function () {
    if (!this.$store.getters.isAuthenticated) {
      this.$router.push('/login')
      //this.$router.push('/')
      //this.$router.push('/article')
    }
  }
}
</script>

<style lang="scss">

@import "styles/global.scss";

#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  background: $backgr_grey;
  min-height: 100vh;
  margin: 0;
  padding: 0;
}
@include checkboxes-colors($blue, #fff);
@include radio-btns-colors($blue);
@include modal-header-colors($blue);
</style>
