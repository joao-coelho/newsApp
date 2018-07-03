import { USER_REQUEST, USER_SUCCESS, USER_ERROR } from '../action_calls/user'
import { AUTH_LOGOUT } from '../action_calls/authentication'

const state = {
  status: '',
  profile: {
    channelName: '',
    categories: []
  }
}

const getters = {
  getProfile: state => state.profile,
  isProfileLoaded: state => !!state.profile.channelName,
}

const actions = {
  [USER_REQUEST]: ({commit, dispatch}, user) => {
    commit(USER_REQUEST);
    localStorage.setItem('user-categories', user.categories);
    localStorage.setItem('user-channel', user.channelName);
    commit(USER_SUCCESS, user);
  }
}

const mutations = {
  [USER_REQUEST]: (state) => {
    state.status = 'loading'
  },
  [USER_SUCCESS]: (state, user) => {
    state.status = 'success'
    state.profile.channelName = user.channelName
    state.profile.categories = user.categories
  },
  [USER_ERROR]: (state) => {
    state.status = 'error'
  },
  [AUTH_LOGOUT]: (state) => {
    state.profile = {}
  }
}

export default {
  state,
  getters,
  actions,
  mutations,
}
