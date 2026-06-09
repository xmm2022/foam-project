<template>
  <v-app>
    <!-- 侧边栏 -->
    <v-navigation-drawer v-model="drawer" app>
      <v-list-item>
        <v-list-item-title class="text-h6">Foam</v-list-item-title>
        <v-list-item-subtitle>Emby 管理系统</v-list-item-subtitle>
      </v-list-item>

      <v-divider></v-divider>

      <v-list density="compact" nav>
        <!-- 用户菜单 -->
        <v-list-item prepend-icon="mdi-view-dashboard" title="仪表盘" to="/" />
        <v-list-item prepend-icon="mdi-library" title="媒体库" to="/library" />
        <v-list-item prepend-icon="mdi-hand-pointing-up" title="请求中心" to="/requests" />
        <v-list-item prepend-icon="mdi-ticket" title="工单" to="/tickets" />
        <v-list-item prepend-icon="mdi-account" title="个人资料" to="/profile" />

        <v-divider class="my-2"></v-divider>

        <!-- 管理员菜单 -->
        <template v-if="isAdmin">
          <v-list-subheader>用户管理</v-list-subheader>
          <v-list-item prepend-icon="mdi-account-group" title="用户列表" to="/users" />
          <v-list-item prepend-icon="mdi-card-account-details" title="卡密管理" to="/cards" />
          <v-list-item prepend-icon="mdi-ticket-confirmation" title="邀请码" to="/invitations" />

          <v-list-subheader>数据分析</v-list-subheader>
          <v-list-item prepend-icon="mdi-chart-bar" title="播放记录" to="/playback-records" />
          <v-list-item prepend-icon="mdi-chart-line" title="播放统计" to="/playback-summary" />
          <v-list-item prepend-icon="mdi-monitor" title="同时播放" to="/simultaneous-playback" />
          <v-list-item prepend-icon="mdi-server" title="服务器" to="/servers" />
          <v-list-item prepend-icon="mdi-play-circle" title="正在播放" to="/now-playing" />

          <v-list-subheader>系统设置</v-list-subheader>
          <v-list-item prepend-icon="mdi-bell" title="通知管理" to="/notices" />
          <v-list-item prepend-icon="mdi-message" title="通知渠道" to="/notify-channels" />
          <v-list-item prepend-icon="mdi-file-document" title="通知模板" to="/notify-templates" />
          <v-list-item prepend-icon="mdi-cog" title="系统设置" to="/settings" />
          <v-list-item prepend-icon="mdi-key" title="License" to="/license" />
        </template>
      </v-list>
    </v-navigation-drawer>

    <!-- 顶部栏 -->
    <v-app-bar app>
      <v-app-bar-nav-icon @click="drawer = !drawer" />
      <v-toolbar-title>Foam</v-toolbar-title>
      <v-spacer />

      <v-btn icon @click="toggleTheme">
        <v-icon>{{ theme.global.current.value.dark ? 'mdi-weather-sunny' : 'mdi-weather-night' }}</v-icon>
      </v-btn>

      <v-menu>
        <template v-slot:activator="{ props }">
          <v-btn icon v-bind="props">
            <v-icon>mdi-account-circle</v-icon>
          </v-btn>
        </template>
        <v-list>
          <v-list-item @click="goToProfile">
            <v-list-item-title>个人资料</v-list-item-title>
          </v-list-item>
          <v-list-item @click="logout">
            <v-list-item-title>退出登录</v-list-item-title>
          </v-list-item>
        </v-list>
      </v-menu>
    </v-app-bar>

    <!-- 主内容 -->
    <v-main>
      <router-view />
    </v-main>
  </v-app>
</template>

<script setup>
import { ref, computed } from 'vue'
import { useRouter } from 'vue-router'
import { useTheme } from 'vuetify'

const router = useRouter()
const theme = useTheme()
const drawer = ref(true)

const isAdmin = computed(() => {
  const user = JSON.parse(localStorage.getItem('user') || '{}')
  return user.isAdmin === 1
})

const toggleTheme = () => {
  const newTheme = theme.global.current.value.dark ? 'light' : 'dark'
  theme.global.name.value = newTheme
  localStorage.setItem('theme', newTheme)
}

const goToProfile = () => {
  router.push('/profile')
}

const logout = () => {
  localStorage.removeItem('token')
  localStorage.removeItem('user')
  router.push('/login')
}
</script>
