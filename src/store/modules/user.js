import { USER_REQUEST, USER_SUCCESS, USER_ERROR } from '../action_calls/user'
import { AUTH_LOGOUT } from '../action_calls/authentication'

const state = {
  status: '',
  profile: {}
}

const getters = {
  getProfile: state => state.profile,
  isProfileLoaded: state => !!state.profile.name,
}

const actions = {
  [USER_REQUEST]: ({commit, dispatch}, resp) => {
    commit(USER_REQUEST);
    console.log(resp.categories);
    //localStorage.setItem('user-categories', resp.categories);
    commit(USER_SUCCESS);
  }
}

const mutations = {
  [USER_REQUEST]: (state) => {
    state.status = 'loading'
  },
  [USER_SUCCESS]: (state) => {
    state.status = 'success'
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
