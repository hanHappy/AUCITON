<script setup>
</script>

<template>
    <header>
        <div class="header-top-container container">
            <nav class="top-menu">
                <router-link to="/admin/dashboard">관리자</router-link>
                <router-link to="/notice" >고객센터</router-link>
                <!-- TODO 로그인 상태   -> /my -->
                <!--      비로그인 상태 -> /login -->
                <router-link to="/my" >마이페이지</router-link>
                <router-link to="/bookmarked" >관심상품</router-link>
                <router-link to="/">알림</router-link>
                <router-link to="/login" >로그인</router-link>
                <!-- TODO 로그인 상태 -> 로그아웃 -->
            </nav>
        </div>
        <div class="header-main-container container">
            <router-link to="/" class="logo"><h1>Gajae</h1></router-link>
            <nav class="main-menu">
                <router-link to="/">HOME</router-link>
                <router-link to="/shop">SHOP</router-link>
                <router-link to="/auction">AUCTION</router-link>
                <i class="fa-solid fa-magnifying-glass"></i>
            </nav>
        </div>
    </header>
</template>

<style scoped>
@import url(@/assets/css/components/header.css);
</style>