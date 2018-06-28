<template>
  <div class="login">
    <b-container fluid>
      <navbar-login></navbar-login>
      <b-form-row>
        <b-col md="6" id="img-section">
          <b-img src="../assets/images/connections.png" fluid alt="Login Image"/>
        </b-col>
        <b-col cols="12" offset-sm="2" sm="8" offset-md="0" md="6" offset-lg="1" lg="4" id="form-section">
          <b-card>
            <h4 class="card-title">
              {{ $t('login_title') }}
              <img src="../assets/images/logo.png" class="d-inline-block align-center" alt="Brand Logo">
            </h4>
            <b-form @submit="login">
              <b-form-group id="usernameGroup"
                            :label="$t('login_username')"
                            label-for="usernameInput">
                <b-form-input id="usernameInput"
                              type="text"
                              v-model="form.username"
                              required
                              :placeholder="$t('login_userPlaceholder')">
                </b-form-input>
              </b-form-group>
              <b-form-group id="pwdGroup"
                            :label="$t('login_password')"
                            label-for="pwdInput">
                <b-form-input id="pwdInput"
                              type="password"
                              v-model="form.pwd"
                              required
                              :placeholder="$t('login_pwdPlaceholder')">
                </b-form-input>
              </b-form-group>
              <b-form-group id="rememberMeGroup">
                <b-form-checkbox id="rememberMeInput"
                                 v-model="form.checked"
                                 value="yes"
                                 unchecked-value="no">
                                 {{ $t("login_rememberMe") }}
                </b-form-checkbox>
              </b-form-group>
              <b-row id="buttons-section">
                <b-button type="submit">{{ $t('login_login') }}</b-button>
                <router-link to="/register">{{ $t('login_register') }}</router-link>
              </b-row>
            </b-form>
          </b-card>
        </b-col>
      </b-form-row>
      <b-row class="register_sucess">
        <b-col offset-md="2" md="8" offset-lg="3" lg="6">
          <b-alert variant="success"
                   dismissible
                   :show="afterRegister"
                   @dismissed="afterRegister=false">
            {{ $t('login_afterRegister') }}
          </b-alert>
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import {AUTH_REQUEST} from '../store/action_calls/authentication'
import NavbarLogin from './NavbarLogin'

export default {
  name: 'Login',
  components: {
    NavbarLogin
  },
  data () {
    return {
      form: {
        username: '',
        pwd: '',
        checked: 'no'
      },
      afterRegister: Boolean
    }
  },
  methods: {
    login() {
      let user = {
        username: this.form.username,
        password: this.form.pwd
      }
      this.$store.dispatch(AUTH_REQUEST, user)
        .then(() => {
          //this.$router.push('/')
        })
    }
  },
  created() {
    this.afterRegister = this.$route.params.afterRegister ? true : false;
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

@import "styles/global.scss";

.card-title {
  img {
    width: 30px;
    height: 30px;
  }
}
.form-row {
  margin-top: 75px;
}
#form-section {
  @include flex-layout(center, center);
  .card {
    width: 100%;
    border: 0.5px solid #ccc;
  }
  .card-title {
    color: #bdbdbd;
    font-weight: bold;
    text-align: right;
    font-size: 1.3rem;
  }
}
#buttons-section {
  @include flex-layout(space-between, center);
  margin: 0;
  a {
    color: $blue;
  }
  button {
    background-color: $blue;
    border-bottom: 1px solid #29487d;
  }
}
h1, h2 {
  font-weight: normal;
}
#img-section {
  @include flex-layout(center, center);
  img {
    max-height: 80vh;
  }
  @media (max-width: 768px) {
    display: none;
  }
}
.register_sucess {
  margin-top: 20px;
  .alert-success {
    border-color: #37ba55;
  }
  @media (min-width: $break-large) {
    margin-top: 40px;
  }
}
</style>
