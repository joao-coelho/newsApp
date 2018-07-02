import Vue from 'vue'
import Router from 'vue-router'
import Feed from '@/components/Feed'
import Login from '@/components/Login'
import Register from '@/components/Register'
import Article from '@/components/Article'
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
<<<<<<< HEAD
      path: '/article',
      name: 'Article',
      component: Article
=======
      path: '/subscriptions',
      name: 'Subscriptions',
      component: Subscriptions
>>>>>>> 03fd5510d01fe53df2143456622bff3166e21011
    }
  ]
})
