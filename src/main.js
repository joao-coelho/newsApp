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
import { library } from '@fortawesome/fontawesome-svg-core'
import { faBars, faNewspaper, faFire, faThumbsUp, faListUl,
 				 faUserTie, faChess, faHeartbeat, faFlask, faFutbol,
				 faDesktop, faGavel, faSun, faHandHoldingUsd, faChartLine,
			 	 faGraduationCap, faChurch, faTree, faBalanceScale, faCog,
				 faPencilAlt, faHeart, faQuestionCircle, faTimesCircle, faClock } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import VModal from 'vue-js-modal'
import axios from './axios.js'

library.add(faBars)
library.add(faNewspaper)
library.add(faFire)
library.add(faThumbsUp)
library.add(faListUl)
library.add(faUserTie)
library.add(faChess)
library.add(faHeartbeat)
library.add(faFlask)
library.add(faFutbol)
library.add(faDesktop)
library.add(faGavel)
library.add(faSun)
library.add(faHandHoldingUsd)
library.add(faChartLine)
library.add(faGraduationCap)
library.add(faChurch)
library.add(faTree)
library.add(faBalanceScale)
library.add(faCog)
library.add(faPencilAlt)
library.add(faHeart)
library.add(faQuestionCircle)
library.add(faTimesCircle)
library.add(faClock)
Vue.component('font-awesome-icon', FontAwesomeIcon)

Vue.use(BootstrapVue)
Vue.use(Vuei18n)
Vue.use(VModal, { dialog: true, dynamic: true })
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

Vue.prototype.$axios = axios
Vue.mixin({
  methods: {
    getMonth(date) {
      let month = '';
      switch(date.getMonth()) {
        case 0:
          month = "months_jan"; break;
        case 1:
          month = "months_feb"; break;
        case 2:
          month = "months_mar"; break;
        case 3:
          month = "months_apr"; break;
        case 4:
          month = "months_may"; break;
        case 5:
          month = "months_jun"; break;
        case 6:
          month = "months_jul"; break;
        case 7:
          month = "months_aug"; break;
        case 8:
          month = "months_sep"; break;
        case 9:
          month = "months_oct"; break;
        case 10:
          month = "months_nov"; break;
        case 11:
          month = "months_dec"; break;
      }
      return month;
    }
  }
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
