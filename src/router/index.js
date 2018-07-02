import Vue from 'vue'
import Router from 'vue-router'
import Feed from '@/components/Feed'
import Login from '@/components/Login'
import Register from '@/components/Register'
import Subscriptions from '@/components/Subscriptions'

Vue.use(Router)

export default new Router({
  mode: 'history', //without extra server configuration, accessing an url directly - like localhost:8080/user - returns 404
  routes: [
    {
      path: '/',
      name: 'Feed',
      component: Feed
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/register',
      name: 'Register',
      component: Register
    },
    {
      path: '/subscriptions',
      name: 'Subscriptions',
      component: Subscriptions
    }
  ]
})
