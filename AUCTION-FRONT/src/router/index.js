import { createRouter, createWebHistory } from 'vue-router'

import Layout from '../components/Layout.vue'
import Home from '../views/Home.vue'
import AuctionList from '../views/auction/List.vue'
import AuctionRegistration from '../views/auction/Registration.vue'
import AuctionDetail from '../views/auction/Detail.vue'

// 이하 
import '@/assets/css/reset.css'
import '@/assets/css/style.css'
import '@/assets/css/util.css'

// 라우팅 설정, 경로 및 import 
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/',
      component: Layout,
      children: [
        { path: '', component: Home },
        { path: '/auction/list', component: AuctionList },
        { path: '/auction/register', component: AuctionRegistration },
        { path: '/auction/:id', component: AuctionDetail }
      ]
    },
  ],
})

export default router