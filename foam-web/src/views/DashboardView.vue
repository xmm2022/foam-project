<template>
  <v-container fluid>
    <v-row>
      <v-col cols="12">
        <h1 class="text-h4 mb-4">仪表盘</h1>
      </v-col>
    </v-row>

    <v-row>
      <!-- 统计卡片 -->
      <v-col cols="12" md="3">
        <v-card color="primary" dark>
          <v-card-title>用户总数</v-card-title>
          <v-card-text class="text-h3">{{ stats.totalUsers || 0 }}</v-card-text>
        </v-card>
      </v-col>

      <v-col cols="12" md="3">
        <v-card color="success" dark>
          <v-card-title>活跃用户</v-card-title>
          <v-card-text class="text-h3">{{ stats.activeUsers || 0 }}</v-card-text>
        </v-card>
      </v-col>

      <v-col cols="12" md="3">
        <v-card color="info" dark>
          <v-card-title>媒体数量</v-card-title>
          <v-card-text class="text-h3">{{ stats.mediaCount || 0 }}</v-card-text>
        </v-card>
      </v-col>

      <v-col cols="12" md="3">
        <v-card color="warning" dark>
          <v-card-title>今日播放</v-card-title>
          <v-card-text class="text-h3">{{ stats.todayPlays || 0 }}</v-card-text>
        </v-card>
      </v-col>
    </v-row>

    <v-row class="mt-4">
      <!-- 最近活动 -->
      <v-col cols="12" md="6">
        <v-card>
          <v-card-title>最近活动</v-card-title>
          <v-list>
            <v-list-item v-for="activity in recentActivities" :key="activity.id">
              <template v-slot:prepend>
                <v-icon :color="activity.color">{{ activity.icon }}</v-icon>
              </template>
              <v-list-item-title>{{ activity.title }}</v-list-item-title>
              <v-list-item-subtitle>{{ activity.time }}</v-list-item-subtitle>
            </v-list-item>
          </v-list>
        </v-card>
      </v-col>

      <!-- 正在播放 -->
      <v-col cols="12" md="6">
        <v-card>
          <v-card-title>正在播放</v-card-title>
          <v-list>
            <v-list-item v-for="play in nowPlaying" :key="play.id">
              <template v-slot:prepend>
                <v-icon color="red">mdi-play-circle</v-icon>
              </template>
              <v-list-item-title>{{ play.title }}</v-list-item-title>
              <v-list-item-subtitle>{{ play.user }} - {{ play.device }}</v-list-item-subtitle>
            </v-list-item>
          </v-list>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'

const stats = ref({})
const recentActivities = ref([])
const nowPlaying = ref([])

const fetchDashboardData = async () => {
  try {
    const response = await axios.get('/api/dashboard/stats')
    stats.value = response.data
  } catch (error) {
    console.error('获取仪表盘数据失败:', error)
  }
}

const fetchRecentActivities = async () => {
  try {
    const response = await axios.get('/api/dashboard/activities')
    recentActivities.value = response.data
  } catch (error) {
    console.error('获取最近活动失败:', error)
  }
}

const fetchNowPlaying = async () => {
  try {
    const response = await axios.get('/api/emby/now-playing')
    nowPlaying.value = response.data
  } catch (error) {
    console.error('获取正在播放失败:', error)
  }
}

onMounted(() => {
  fetchDashboardData()
  fetchRecentActivities()
  fetchNowPlaying()
})
</script>
