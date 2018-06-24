<template>
    <div id="autocomplete" v-bind:class="{'open': openSuggestion}">
        <input class="form-control" type="text"
          :id="id"
          :value="value"
          @input="updateValue($event.target.value)"
          v-on:blur="hideDropdown()"
          :placeholder="placeholder"
          @keydown.enter = 'enter'
          @keydown.down = 'down'
          @keydown.up = 'up'
        >
        <ul class="dropdown-menu">
            <li v-for="(suggestion, index) in matches"
                v-bind:class="{'active': isActive(index)}"
                @click="suggestionClick(index)">
              {{ suggestion.country }}
            </li>
        </ul>
    </div>
</template>

<script>
export default {
  props: {
    value: {
      type: String,
      required: true
    },
    suggestions: {
      type: Array,
      required: true
    },
    placeholder: {
      type: String,
      required: true
    },
    id: {
      type: String,
      required: true
    }
  },
  data () {
    return {
      open: false,
      current: 0
    }
  },
  computed: {
    // Filtering the suggestion based on the input
    matches () {
      return this.suggestions.filter((obj) => {
        let country = obj.country.toUpperCase();
        return country.indexOf(this.value.toUpperCase()) >= 0
      })
    },
    openSuggestion () {
      return this.selectedCountry !== '' &&
             this.matches.length !== 0 &&
             this.open === true
    }
  },
  methods: {
    hideDropdown(){
      let elem = document.querySelector("#autocomplete");
      elem.classList.remove("open");
    },
    updateValue (value) {
      if (this.open === false) {
        this.open = true
        this.current = 0
      }
      this.$emit('input', value)
    },
    // When enter pressed on the input
    enter () {
      this.$emit('input', this.matches[this.current].country)
      this.open = false
    },
    // When up pressed while countries are open
    up () {
      if (this.current > 0) {
        this.current--
      }
    },
    // When up pressed while countries are open
    down () {
      if (this.current < this.matches.length - 1) {
        this.current++
      }
    },
    // For highlighting element
    isActive (index) {
      return index === this.current
    },
    // When one of the suggestion is clicked
    suggestionClick (index) {
      this.$emit('input', this.matches[index].country)
      this.open = false
    }
  }
}
</script>

<style scoped lang="scss">
#autocomplete {
  position: relative;
}
.open ul.dropdown-menu {
  display: block;
}
ul.dropdown-menu {
  width: 100%;
  display: none;
  padding: 0;
  li {
    color: #2c3e50;
    padding: 5px;

  }
  li.active {
    background-color: #efefef;
  }
}
</style>
