<template>
  <div class="login">
    <b-container fluid>
      <b-row id="navbar-section">
        <b-col cols="12">
          <b-navbar type="dark">
            <b-navbar-brand>
              <img src="../assets/images/logo.png" class="d-inline-block align-center" alt="Brand Logo">
              Brand Name
            </b-navbar-brand>
            <b-navbar-nav>
              <b-nav-item-dropdown :text="lang.toUpperCase()">
                <b-dropdown-item @click='changeLang("en")'>EN</b-dropdown-item>
                <b-dropdown-item @click='changeLang("pt")'>PT</b-dropdown-item>
              </b-nav-item-dropdown>
            </b-navbar-nav>
          </b-navbar>
        </b-col>
      </b-row>
      <b-form-row>
        <b-col md="6" id="img-section">
          <b-img src="../assets/images/connections.png" fluid alt="Login Image"/>
        </b-col>
        <b-col cols="12" offset-sm="2" sm="8" offset-md="0" md="6" offset-lg="1" lg="4" id="form-section">
          <b-card>
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
    </b-container>
  </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
    return {
      form: {
        username: '',
        pwd: '',
        checked: 'no'
      },
      lang: this.$i18n.locale
    }
  },
  methods: {
    login() {
      const { username, password } = this
      this.$store.dispatch(AUTH_REQUEST, { username, password }).then(() => {
        this.$router.push('/')
      })
    },
    changeLang(lang) {
      this.$i18n.locale = lang;
      this.lang = lang;
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

@import "styles/global.scss";

#navbar-section {
  div {
    padding: 0;
  }
  .navbar {
    background-color: $blue;
    border-bottom: 1px solid #29487d;
    height: 50px;
  }
  .navbar-brand img {
    height: 30px;
    width: 30px;
    margin-right: 10px;
  }
  .navbar-nav .dropdown-menu {
    position: sticky;
    min-width: 6rem;
  }
}
.form-row {
  margin-top: 5vh;
}
#form-section {
  @include flex-layout(center, center);
  .card {
    width: 100%;
    border: 0.5px solid #ccc;
  }
}
#buttons-section {
  @include flex-layout(space-between, center);
  margin: 0;
  a {
    color: #2c3e50;
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
</style>
