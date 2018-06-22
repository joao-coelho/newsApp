// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store'
import BootstrapVue from "bootstrap-vue"
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap-vue/dist/bootstrap-vue.css"
import Vuei18n from 'vue-i18n'

Vue.use(BootstrapVue)
Vue.use(Vuei18n)
Vue.config.productionTip = false

const messages_en = require('../static/language/messages_en.json');
const messages_pt = require('../static/language/messages_pt.json');

const messages = {
	en: messages_en,
	pt: messages_pt
}

const i18n = new Vuei18n({
  locale: navigator.language.substring(0, 2),
  messages
})

/* eslint-disable no-new */
new Vue({
  el: '#app',
	i18n,
  router,
  store,
  components: { App },
  template: '<App/>'
})
