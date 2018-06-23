<template>
  <div class="register">
    <b-container fluid>
      <navbar-login></navbar-login>
      <b-form-row>
        <b-col cols="12" offset-sm="2" sm="8" offset-md="0" md="6" offset-lg="0" lg="4" class="registration_form">
          <b-card :title="$t('register_details')">
            <b-form @submit="register">
              <b-form-group id="usernameGroup"
                            :label="$t('login_username')"
                            label-for="usernameInput">
                <b-form-input id="usernameInput"
                              type="text"
                              v-model="form.username"
                              required
                              :placeholder="$t('register_userPlaceholder')">
                </b-form-input>
              </b-form-group>
              <b-form-group id="pwdGroup"
                            :label="$t('register_password')"
                            label-for="pwdInput">
                <b-form-input id="pwdInput"
                              type="password"
                              v-model="form.pwd"
                              required
                              :placeholder="$t('register_pwdPlaceholder')">
                </b-form-input>
              </b-form-group>
              <b-form-group id="pwdRepeatGroup"
                            :label="$t('register_repeatPwd')"
                            label-for="pwdInput">
                <b-form-input id="pwdInput"
                              type="password"
                              v-model="form.pwd"
                              required
                              :placeholder="$t('register_repeatPwdPlaceholder')">
                </b-form-input>
              </b-form-group>
              <b-row id="buttons-section">
                <b-button type="submit">{{ $t('register_setPreferences') }}</b-button>
              </b-row>
            </b-form>
          </b-card>
        </b-col>
        <b-col cols="12" offset-sm="2" sm="8" offset-md="0" md="6" offset-lg="0" lg="4" class="registration_form">
          <b-card :title="$t('register_personal')">
            <b-form @submit="register">
              <b-form-group id="nameGroup"
                            :label="$t('register_name')"
                            label-for="nameInput">
                <b-form-input id="nameInput"
                              type="text"
                              v-model="form.name"
                              required
                              :placeholder="$t('register_namePlaceholder')">
                </b-form-input>
              </b-form-group>
              <b-form-group id="ageGroup"
                            :label="$t('register_age')"
                            label-for="ageInput">
                <b-form-input id="ageInput"
                              type="number"
                              v-model="form.age"
                              required
                              :placeholder="$t('register_agePlaceholder')">
                </b-form-input>
              </b-form-group>
              <b-form-group id="countryGroup"
                            :label="$t('register_country')"
                            label-for="countryInput">
                <autocomplete :id="'countryInput'"
                              :suggestions="countries"
                              v-model="selectedCountry"
                              :placeholder="$t('register_countryPlaceholder')">
                </autocomplete>
              </b-form-group>
              <b-row id="buttons-section">
                <b-button type="submit">{{ $t('login_login') }}</b-button>
              </b-row>
            </b-form>
          </b-card>
        </b-col>
        <b-col cols="12" offset-sm="2" sm="8" offset-md="3" md="6" offset-lg="0" lg="4" class="registration_form">
          <b-card :title="$t('register_channelInfo')">
              <b-form-group :label="$t('register_newsType')">
                <b-form-radio-group id="radio_buttons"
                                    v-model="selectedType"
                                    :options="types"
                                    name="contentTypeRadios">
                </b-form-radio-group>
              </b-form-group>
              <b-row id="buttons-section">
                <b-button type="submit">{{ $t('login_login') }}</b-button>
              </b-row>
            </b-form>
          </b-card>
        </b-col>
      </b-form-row>
    </b-container>
  </div>
</template>

<script>
import Autocomplete from './Autocomplete'
import NavbarLogin from './NavbarLogin'

export default {
  name: 'Register',
  components: {
    Autocomplete,
    NavbarLogin
  },
  data () {
    return {
      form: {
        username: '',
        pwd: ''
      },
      selectedType: '',
      types: [
        { text: 'Business', value: 'business' },
        { text: 'Entertainment', value: 'entertainment' },
        { text: 'Health', value: 'health' },
        { text: 'Science', value: 'science' },
        { text: 'Sports', value: 'sports' },
        { text: 'Technology', value: 'technology' }
      ],
      selectedCountry: ''
    }
  },
  methods: {
    register() {

    },
    loadCountries(lang) {
      if (lang == "en") {
        var list = require('../../static/language/countries_en.json');
      }
      else {
        var list = require('../../static/language/countries_pt.json');
      }
      return list.countries;
    }
  },
  computed: {
    countries() {
      return this.loadCountries(this.$i18n.locale);
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

@import "styles/global.scss";

.form-row {
  margin-top: 5vh;
}
.registration_form {
  @include flex-layout(center, center);
  .card {
    width: 100%;
    border: 0.5px solid #ccc;
    margin-bottom: 10px;
  }
  .card-title {
    color: $blue;
    font-weight: bold;
    text-align: right;
    font-size: 1.3rem;
  }
}
#buttons-section {
  @include flex-layout(center, center);
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
