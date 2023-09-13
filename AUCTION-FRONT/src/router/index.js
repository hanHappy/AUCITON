import { createRouter, createWebHistory } from 'vue-router'

import Layout from '../components/Layout.vue'
import Home from '../views/Home.vue'
import AuctionList from '../views/auction/List.vue'

import '@/assets/css/reset.css'
import '@/assets/css/style.css'
import '@/assets/css/util.css'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/',
      component: Layout,
      children: [
        { path: '', component: Home },
        { path: '/auction/list', component: AuctionList }
      ]
    },
  ]
})

export default router