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
              <b-form>
                <b-form-group id="usernameGroup"
                              :label="$t('register_username')"
                              label-for="usernameInput">
                  <b-form-input id="usernameInput"
                                type="text"
                                v-model="username"
                                @keyup.native="verifyUsername()"
                                :state="userState"
                                required
                                :placeholder="$t('register_userPlaceholder')">
                  </b-form-input>
                  <b-form-invalid-feedback id="inputLiveFeedback">
                    {{ $t( 'register_usernameError' ) }}
                  </b-form-invalid-feedback>
                  <b-form-text class="required_alert">
                    {{ $t('register_required') }}
                  </b-form-text>
                </b-form-group>
                <b-form-group id="pwdGroup"
                              :label="$t('register_password')"
                              label-for="pwdInput">
                  <b-form-input id="pwdInput"
                                type="password"
                                v-model="pwd"
                                :state="lengthState"
                                required
                                :placeholder="$t('register_pwdPlaceholder')">
                  </b-form-input>
                  <b-form-invalid-feedback id="lengthFeedback">
                    {{ $t( 'register_lengthError' ) }}
                  </b-form-invalid-feedback>
                  <b-form-text class="required_alert">
                    {{ $t('register_required') }}
                  </b-form-text>
                </b-form-group>
                <b-form-group id="pwdRepeatGroup"
                              :label="$t('register_repeatPwd')"
                              label-for="pwdInput">
                  <b-form-input id="pwdInput_rep"
                                type="password"
                                v-model="pwd_rep"
                                @keyup.native="verifyPass()"
                                :state="passState"
                                required
                                :placeholder="$t('register_repeatPwdPlaceholder')">
                  </b-form-input>
                  <b-form-invalid-feedback id="passFeedback">
                    {{ $t( 'register_passError' ) }}
                  </b-form-invalid-feedback>
                  <b-form-text class="required_alert">
                    {{ $t('register_required') }}
                  </b-form-text>
                </b-form-group>
              </b-form>
            </b-col>
            <b-col cols="12" md="6">
              <h5>{{ $t('register_accountPersonal') }}</h5>
              <hr/>
              <b-form>
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
                                @keyup.native="verifyEmail()"
                                :state="emailState"
                                required
                                :placeholder="$t('register_emailPlaceholder')">
                  </b-form-input>
                  <b-form-invalid-feedback id="emailFeedback">
                    {{ $t( 'register_emailError' ) }}
                  </b-form-invalid-feedback>
                  <b-form-text class="required_alert">
                    {{ $t('register_required') }}
                  </b-form-text>
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
            <b-row>
              <b-col md='6'>
                <b-form-group id="channelNameGroup"
                              :label="$t('register_channelName')"
                              label-for="channelNameInput">
                  <b-form-input id="channelNameInput"
                              type="text"
                              v-model="channelName"
                              @keyup.native="verifyChannelName()"
                              :state="channelState"
                              required
                              :placeholder="$t('register_channelNamePlaceholder')">
                  </b-form-input>
                  <b-form-invalid-feedback id="channelFeedback">
                    {{ $t( 'register_channelError' ) }}
                  </b-form-invalid-feedback>
                  <b-form-text class="required_alert">
                    {{ $t('register_required') }}
                  </b-form-text>
                </b-form-group>
              </b-col>
            </b-row>
          <b-row>
            <b-col>
              <b-form-group id="channelDescriptionGroup"
                            :label="$t('register_channelDescription')"
                            label-for="channelDescriptionInput">
                <b-form-input id="channelDescriptionInput"
                              type="text"
                              v-model="channelDescription"
                              :placeholder="$t('register_channelDescriptionPlaceholder')">
                </b-form-input>
              </b-form-group>
            </b-col>
          </b-row>
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
                                           v-model="channelSelectedTypes"
                                           :options="types1">
                    </b-form-checkbox-group>
                  </b-form-group>
                </b-col>
                <b-col sm="4">
                  <b-form-group>
                    <b-form-checkbox-group stacked
                                           v-model="channelSelectedTypes"
                                           :options="types2">
                    </b-form-checkbox-group>
                  </b-form-group>
                </b-col>
                <b-col sm="4">
                  <b-form-group>
                    <b-form-checkbox-group stacked
                                           v-model="channelSelectedTypes"
                                           :options="types3">
                    </b-form-checkbox-group>
                  </b-form-group>
                </b-col>
              </b-row>
            </b-col>
          </b-row>
          <b-row id="buttons-section">
            <b-button @click="register">{{ $t('register_register') }}</b-button>
          </b-row>
          <b-row class="register_unsuccess">
            <b-col offset-md="2" md="8" offset-lg="3" lg="6">
              <b-alert variant="danger"
                       dismissible
                       :show="unsuccess"
                       @dismissed="unsuccess=false">
              {{ $t('register_unsuccess') }}
              </b-alert>
            </b-col>
          </b-row>
        </b-card>
      </b-form-row>
    </b-container>
    <b-modal ok-only id="infoModal" title="Informações adicionais">
      <p class="my-4">Information displayed here./Informação exibida aqui</p>
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
      userAvailable: -1,
      emailAvailable: -1,
      samePass: -1,
      unsuccess: false,
      channelAvailable: -1,
      validLength: -1,
      selectedTypes: [],
      allSelected: false,
      selectedCountry: '',
      createChannel: false,
      channelAllSelected: false,
      channelName: '',
      channelDescription: '',
      channelSelectedTypes: []
    }
  },
  methods: {
    register() {
      if(this.userAvailable == 1 && this.emailAvailable == 1 &&
         this.samePass == 1 && this.validLength == 1) {
           let details = {
             username: this.username,
             password: this.pwd,
             name: this.name,
             age: this.age,
             email: this.email,
             country: this.selectedCountry,
             types: this.selectedTypes,
             createChannel: this.createChannel,
             channelName: this.channelName,
             channelDescription: this.channelDescription,
             channelTypes: this.channelSelectedTypes
           }
           this.$axios({url: '/register/submit', data: details, method: 'POST' })
           .then(resp => {
             var sucess = resp.data;
             if(sucess == 1) {
               this.$router.push({name: 'Login', params: { afterRegister: true }});
             }
           })
      } else {
        this.unsuccess = true
      }
    },
    verifyUsername() {
      if(this.username.length != 0) {
        this.$axios.get('/register/verifyUser', {
          params: {
            username: this.username
          }
        })
        .then(resp => {
          this.userAvailable = resp.data;
        })
        .catch(function (error) {
          console.log(error);
        });
      }
      else {
        this.userAvailable = -1;
      }
    },
    verifyEmail() {
      if(this.email.length != 0) {
        this.$axios.get('/register/verifyEmail', {
          params: {
            email: this.email
          }
        })
        .then(resp => {
          this.emailAvailable = resp.data;
        })
        .catch(function (error) {
          console.log(error);
        });
      }
      else {
        this.emailAvailable = -1;
      }
    },
    verifyChannelName() {
      if(this.channelName != 0) {
        this.$axios.get('/register/verifyChannelName', {
          params: {
            channelName: this.channelName
          }
        })
        .then(resp => {
          this.channelAvailable = resp.data;
        })
        .catch(function (error) {
          console.log(error);
        });
      }
      else {
        this.channelAvailable = -1;
      }
    },
    verifyPass() {
      if(this.pwd.length != 0) {
        if(this.pwd_rep.length != 0) {
          if (this.pwd == this.pwd_rep) this.samePass = 1;
          else this.samePass = 0;
        }
        else {
          this.samePass = -1;
        }
      }
      else {
        this.samepass = -1;
      }
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
      console.log(this.selectedTypes);
    },
    channelSelectAll() {
      this.channelSelectedTypes = this.channelAllSelected ? [] : this.allTypes;
    },
    changeCreateChannel() {
      this.createChannel = !this.createChannel;
    },
    typesBuilder(min, max, list) {
      var res = [];
      if (this.$i18n.locale == 'en') {
        for(var i = min; i < max; i++){
          let obj = {
            "text": list[i].en,
            "value": list[i].value
          }
          res.push(obj);
        }
      }
      else {
        for(var i = min; i < max; i++){
          let obj = {
            "text": list[i].pt,
            "value": list[i].value
          }
          res.push(obj);
        }
      }
      return res;
    }
  },
  computed: {
    userState() {
      if(this.userAvailable == 1) {
        return true;
      }
      if(this.userAvailable == 0) {
        return false;
      }
      return null;
    },
    passState() {
      if(this.samePass == 1) {
        return true;
      }
      if(this.samePass == 0) {
        return false;
      }
      return null;
    },
    emailState() {
      if(this.emailAvailable == 1) {
        return true;
      }
      if(this.emailAvailable == 0) {
        return false;
      }
      return null;
    },
    channelState() {
      if(this.channelAvailable == 1) {
        return true;
      }
      if(this.channelAvailable == 0) {
        return false;
      }
      return null;
    },
    lengthState() {
      var length = this.pwd.length;
      if(length == 0) {
        return null;
      }
      if(length < 6) {
        return false;
      }
      this.validLength = 1;
      return true;
    },
    allFill() {
      if(this.userAvailable == 1 && this.emailAvailable == 1 &&
         this.samePass == 1 && this.validLength == 1) return true;
      else return false;
    },
    countries() {
      return this.loadCountries(this.$i18n.locale);
    },
    categories() {
      var list = require('../../static/language/categories.json');
      return list;
    },
    types1() {
      return this.typesBuilder(0, 5, this.categories);
    },
    types2() {
      return this.typesBuilder(5, 10, this.categories);
    },
    types3() {
      return this.typesBuilder(10, 15, this.categories);
    },
    allTypes() {
      var all = [];
      for (var i = 0; i < 5; i++) {
        all.push(this.types1[i].value);
        all.push(this.types2[i].value);
        all.push(this.types3[i].value);
      }
      return all;
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
  margin: 75px 20px 0 20px;
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
      margin-bottom: 10px;
    }
  }
  #channelTypes {
    display: none;
  }
  .required_alert.form-text {
    float: right;
    margin-top: 0.1rem;
    &.text-muted {
      color: rgba(255, 0, 0, 0.75) !important;
    }
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
.register_unsuccess {
  margin-top: 20px;
  .alert-danger {
    border-color: #ba3636;
  }
  @media (min-width: $break-large) {
    text-align: center;
    margin-top: 20px;
  }
}
</style>
