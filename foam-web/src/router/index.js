import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/login',
    name: 'Login',
    component: () => import('@/views/LoginView.vue'),
    meta: { requiresAuth: false }
  },
  {
    path: '/activation',
    name: 'Activation',
    component: () => import('@/views/ActivationView.vue'),
    meta: { requiresAuth: false }
  },
  {
    path: '/',
    component: () => import('@/components/AppShell.vue'),
    meta: { requiresAuth: true },
    children: [
      {
        path: '',
        name: 'Dashboard',
        component: () => import('@/views/DashboardView.vue')
      },
      {
        path: 'library',
        name: 'Library',
        component: () => import('@/views/LibraryView.vue')
      },
      {
        path: 'requests',
        name: 'Requests',
        component: () => import('@/views/RequestCenterView.vue')
      },
      {
        path: 'tickets',
        name: 'Tickets',
        component: () => import('@/views/TicketCenterView.vue')
      },
      {
        path: 'profile',
        name: 'Profile',
        component: () => import('@/views/ProfileView.vue')
      },
      {
        path: 'request-records',
        name: 'RequestRecords',
        component: () => import('@/views/RequestRecordsView.vue')
      },
      {
        path: 'renew',
        name: 'Renew',
        component: () => import('@/views/RenewView.vue')
      },
      {
        path: 'register-invite',
        name: 'RegisterInvite',
        component: () => import('@/views/RegisterInviteView.vue')
      },
      // Admin routes
      {
        path: 'users',
        name: 'Users',
        component: () => import('@/views/UsersView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'user-renew-records',
        name: 'UserRenewRecords',
        component: () => import('@/views/UserRenewRecordsView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'cards',
        name: 'Cards',
        component: () => import('@/views/CardManagementView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'invitations',
        name: 'Invitations',
        component: () => import('@/views/InvitationManagementView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'user-register-records',
        name: 'UserRegisterRecords',
        component: () => import('@/views/UserRegisterRecordsView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'user-sync',
        name: 'UserSync',
        component: () => import('@/views/UserSyncView.vue'),
        meta: { requiresAdmin: true }
      },
      // Distribution routes
      {
        path: 'distribution',
        name: 'Distribution',
        component: () => import('@/views/DistributionView.vue')
      },
      {
        path: 'distribution/application',
        name: 'DistributionApplication',
        component: () => import('@/views/DistributionView.vue')
      },
      {
        path: 'distribution/products',
        name: 'DistributionProducts',
        component: () => import('@/views/DistributionView.vue')
      },
      // Points Bot routes
      {
        path: 'points-bot/config',
        name: 'PointsBotConfig',
        component: () => import('@/views/PointsBotView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'points-bot/levels',
        name: 'PointsBotLevels',
        component: () => import('@/views/PointsBotView.vue'),
        meta: { requiresAdmin: true }
      },
      // Playback routes
      {
        path: 'playback-records',
        name: 'PlaybackRecords',
        component: () => import('@/views/PlaybackRecordsView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'playback-summary',
        name: 'PlaybackSummary',
        component: () => import('@/views/PlaybackSummaryView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'simultaneous-playback',
        name: 'SimultaneousPlayback',
        component: () => import('@/views/SimultaneousPlaybackView.vue'),
        meta: { requiresAdmin: true }
      },
      // Media routes
      {
        path: 'request-subscribe',
        name: 'RequestSubscribe',
        component: () => import('@/views/RequestSubscribeView.vue')
      },
      {
        path: 'cover-designer',
        name: 'CoverDesigner',
        component: () => import('@/views/CoverDesignerView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'now-playing',
        name: 'NowPlaying',
        component: () => import('@/views/NowPlayingView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'servers',
        name: 'Servers',
        component: () => import('@/views/ServersView.vue'),
        meta: { requiresAdmin: true }
      },
      // System routes
      {
        path: 'notices',
        name: 'Notices',
        component: () => import('@/views/NoticeManagementView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'emby-block-keywords',
        name: 'EmbyBlockKeywords',
        component: () => import('@/views/EmbyBlockKeywordView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'notify-channels',
        name: 'NotifyChannels',
        component: () => import('@/views/NotifyChannelView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'notify-templates',
        name: 'NotifyTemplates',
        component: () => import('@/views/NotifyTemplateView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'realtime-logs',
        name: 'RealtimeLogs',
        component: () => import('@/views/RealtimeLogsView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'migration',
        name: 'Migration',
        component: () => import('@/views/FoamMigrationView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'tasks',
        name: 'Tasks',
        component: () => import('@/views/TaskManagementView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'settings',
        name: 'Settings',
        component: () => import('@/views/SettingsView.vue'),
        meta: { requiresAdmin: true }
      },
      {
        path: 'license',
        name: 'License',
        component: () => import('@/views/LicenseView.vue'),
        meta: { requiresAdmin: true }
      }
    ]
  },
  {
    path: '/:pathMatch(.*)*',
    redirect: '/login'
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

// 路由守卫
router.beforeEach((to, from, next) => {
  const token = localStorage.getItem('token')

  if (to.meta.requiresAuth !== false && !token) {
    next('/login')
  } else if (to.meta.requiresAdmin) {
    // 检查是否是管理员
    const user = JSON.parse(localStorage.getItem('user') || '{}')
    if (user.isAdmin === 1) {
      next()
    } else {
      next('/')
    }
  } else {
    next()
  }
})

export default router
