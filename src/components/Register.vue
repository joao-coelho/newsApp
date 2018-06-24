<template>
  <div class="register">
    <b-container fluid>
      <navbar-login></navbar-login>
      <b-row id="title-section">
        <h3>{{ $t('register_title') }}</h3>
        <div>
          <b-img v-b-modal.infoModal id="info-icon" src="../assets/images/info-icon.png" alt="Info" />
          <span>{{ $t('register_moreInfo') }}</span>
        </div>
      </b-row>
      <hr/>
      <b-form-row class="registration_form">
        <b-card :title="$t('register_account')" cols="12" offset-sm="1" sm="10" offset-md="2" md="8" offset-lg="3" lg="6">
          <b-row>
            <b-col cols="12" md="6">
              <h5>{{ $t('register_accountDetails') }}</h5>
              <hr/>
              <b-form @submit="register">
                <b-form-group id="usernameGroup"
                              :label="$t('login_username')"
                              label-for="usernameInput">
                  <b-form-input id="usernameInput"
                                type="text"
                                v-model="username"
                                required
                                :placeholder="$t('register_userPlaceholder')">
                  </b-form-input>
                </b-form-group>
                <b-form-group id="pwdGroup"
                              :label="$t('register_password')"
                              label-for="pwdInput">
                  <b-form-input id="pwdInput"
                                type="password"
                                v-model="pwd"
                                required
                                :placeholder="$t('register_pwdPlaceholder')">
                  </b-form-input>
                </b-form-group>
                <b-form-group id="pwdRepeatGroup"
                              :label="$t('register_repeatPwd')"
                              label-for="pwdInput">
                  <b-form-input id="pwdInput"
                                type="password"
                                v-model="pwd_rep"
                                required
                                :placeholder="$t('register_repeatPwdPlaceholder')">
                  </b-form-input>
                </b-form-group>
              </b-form>
            </b-col>
            <b-col cols="12" md="6">
              <h5>{{ $t('register_accountPersonal') }}</h5>
              <hr/>
              <b-form @submit="register">
                <b-form-group id="nameGroup"
                              :label="$t('register_name')"
                              label-for="nameInput">
                  <b-form-input id="nameInput"
                                type="text"
                                v-model="name"
                                required
                                :placeholder="$t('register_namePlaceholder')">
                  </b-form-input>
                </b-form-group>
                <b-form-group id="ageGroup"
                              :label="$t('register_age')"
                              label-for="ageInput">
                  <b-form-input id="ageInput"
                                type="number"
                                v-model="age"
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
                <b-form-group id="emailGroup"
                              :label="$t('register_email')"
                              label-for="emailInput">
                  <b-form-input id="emailInput"
                                type="email"
                                v-model="email"
                                required
                                :placeholder="$t('register_emailPlaceholder')">
                  </b-form-input>
                </b-form-group>
              </b-form>
            </b-col>
          </b-row>
          <h4 class="card-title" style="margin-top: 10px;">{{ $t('register_preferencesTitle') }}</h4>
          <b-row>
            <b-col>
              <h5>{{ $t('register_accountPreferences') }}</h5>
              <hr/>
              <p>{{ $t('register_preferences') }}</p>
              <b-form-group class="selectAllBox">
                <b-form-checkbox v-model="allSelected"
                                 @change="selectAll">
                                 {{ $t("register_checkAll") }}
                </b-form-checkbox>
              </b-form-group>
              <b-row>
                <b-col sm="4">
                  <b-form-group>
                    <b-form-checkbox-group stacked
                                           :options="types1"
                                           v-model="selectedTypes">
                    </b-form-checkbox-group>
                  </b-form-group>
                </b-col>
                <b-col sm="4">
                  <b-form-group>
                    <b-form-checkbox-group stacked
                                           :options="types2"
                                           v-model="selectedTypes">
                    </b-form-checkbox-group>
                  </b-form-group>
                </b-col>
                <b-col sm="4">
                  <b-form-group>
                    <b-form-checkbox-group stacked
                                           :options="types3"
                                           v-model="selectedTypes">
                    </b-form-checkbox-group>
                  </b-form-group>
                </b-col>
              </b-row>
            </b-col>
          </b-row>
          <h4 class="card-title" style="margin-top: 10px;">{{ $t('register_channelTitle') }}</h4>
          <b-row>
            <b-col>
              <h5>{{ $t('register_createChannel') }}</h5>
              <hr/>
              <p>{{ $t('register_channel') }}</p>
              <b-form-group>
                <b-form-radio-group v-model="createChannel" @change="changeCreateChannel">
                  <b-form-radio value=true>{{ $t('register_yesChannel') }}</b-form-radio>
                  <b-form-radio value=false>{{ $t('register_noChannel') }}</b-form-radio>
                </b-form-radio-group>
              </b-form-group>
            </b-col>
          </b-row>
          <b-row v-if="createChannel">
            <b-col>
              <h5>{{ $t('register_channelNews') }}</h5>
              <hr/>
              <p>{{ $t('register_channelTypes') }}</p>
              <b-form-group class="selectAllBox">
                <b-form-checkbox v-model="channelAllSelected"
                                 @change="channelSelectAll">
                                 {{ $t("register_checkAll") }}
                </b-form-checkbox>
              </b-form-group>
              <b-row>
                <b-col sm="4">
                  <b-form-group>
                    <b-form-checkbox-group stacked
                                           :options="types1"
                                           v-model="channelSelectedTypes">
                    </b-form-checkbox-group>
                  </b-form-group>
                </b-col>
                <b-col sm="4">
                  <b-form-group>
                    <b-form-checkbox-group stacked
                                           :options="types2"
                                           v-model="channelSelectedTypes">
                    </b-form-checkbox-group>
                  </b-form-group>
                </b-col>
                <b-col sm="4">
                  <b-form-group>
                    <b-form-checkbox-group stacked
                                           :options="types3"
                                           v-model="channelSelectedTypes">
                    </b-form-checkbox-group>
                  </b-form-group>
                </b-col>
              </b-row>
            </b-col>
          </b-row>
          <b-row id="buttons-section">
            <b-button type="submit">{{ $t('register_register') }}</b-button>
          </b-row>
        </b-card>
      </b-form-row>
    </b-container>
    <b-modal ok-only id="infoModal" title="You want some info, nigga?">
      <p class="my-4">Yo mama is so fat even this modal would scroll out of the screen.</p>
    </b-modal>
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
      username: '',
      pwd: '',
      pwd_rep: '',
      email: '',
      name: '',
      age: '',
      selectedTypes: [],
      types1: [
        { text: 'Business', value: 'business' },
        { text: 'Entertainment', value: 'entertainment' },
        { text: 'Health', value: 'health' },
        { text: 'Science', value: 'science' },
        { text: 'Sports', value: 'sports' }
      ],
      types2: [
        { text: 'Technology', value: 'technology' },
        { text: 'Politics', value: 'politics' },
        { text: 'Weather', value: 'weather' },
        { text: 'Finance', value: 'finance' },
        { text: 'Economy', value: 'economy' }
      ],
      types3: [
        { text: 'Education', value: 'education' },
        { text: 'Religion', value: 'religion' },
        { text: 'Environment', value: 'environment' },
        { text: 'Government', value: 'government' },
        { text: 'Arts', value: 'arts' }
      ],
      allSelected: false,
      selectedCountry: '',
      createChannel: false,
      channelSelectedTypes: [],
      channelAllSelected: false
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
    },
    selectAll() {
      this.selectedTypes = this.allSelected ? [] : this.allTypes;
    },
    channelSelectAll() {
      this.channelSelectedTypes = this.channelAllSelected ? [] : this.allTypes;
    },
    changeCreateChannel() {
      this.createChannel = !this.createChannel;
    }
  },
  computed: {
    countries() {
      return this.loadCountries(this.$i18n.locale);
    },
    allTypes() {
      var list = [];
      for(var i = 0; i < 5; i++){
        list.push(this.types1[i].value);
        list.push(this.types2[i].value);
        list.push(this.types3[i].value);
      }
      return list;
    }
  },
  watch: {
    selectedTypes(newVal, oldVal) {
      if (newVal.length == this.allTypes.length){
        this.allSelected = true;
      }
      else {
        this.allSelected = false;
      }
    },
    channelSelectedTypes(newVal, oldVal) {
      if (newVal.length == this.allTypes.length){
        this.channelAllSelected = true;
      }
      else {
        this.channelAllSelected = false;
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

@import "styles/global.scss";

#title-section {
  h3 {
    color: $blue;
  }
  @include flex-layout(space-between, center);
  margin: 20px 20px 0 20px;
  div {
    display: flex;
    flex-direction: column;
    justify-content: center;
    img:hover {
      cursor: pointer;
      background-color: $blue;
      border-radius: 12px;
    }
  }
}
hr {
  border-top: 1px solid #29487d;
  opacity: 0.5;
}
#info-icon {
  width: 30px;
  height: 30px;
  margin: auto;
}
.form-row {
  margin-top: 5vh;
}
.registration_form {
  @include flex-layout(center, center);
  .card {
    width: 80%;
    border: 0.5px solid #ccc;
    margin-bottom: 10px;
    @media (max-width: 768px) {
      width: 100%;
    }
  }
  .card-title {
    color: #bdbdbd;
    font-weight: bold;
    text-align: right;
    font-size: 1.3rem;
  }
  hr {
    margin-top: 0;
  }
  h5 {
    margin-top: 0.5rem;
    font-size: 1.15rem;
    font-style: italic;
    color: $blue;
  }
  .selectAllBox {
    margin-bottom: 10px;
  }
  @media (max-width: 768px) {
    .form-group {
      margin-bottom: 0;
    }
  }
  #channelTypes {
    display: none;
  }
}
#buttons-section {
  @include flex-layout(center, center);
  margin-top: 1.5rem;
  button {
    background-color: $blue;
    border-bottom: 1px solid #29487d;
  }
}
</style>
