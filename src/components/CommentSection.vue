<template>
  <div id="comment-section">
    <h6> Make a comment here </h6>
    <div id="write-comment">
      <b-form @submit="onSubmit">
        <b-form-textarea id="commentarea"
                   v-model="comment_text"
                   placeholder="Type your comment here"
                   :no-resize="true"
                   :rows="3"
                   :max-rows="3"/>
        <b-button id="submit-button" type="submit">Submit</b-button>
      </b-form>
    </div>
    <h5> {{num_comments}} comments </h5>
    <b-container fluid>
      <b-row v-for="comment in comments" class="com-row">
        <b-col md="2">
          <b-img class="avatar" v-if="comment.avatar" :src="comment.avatar" fluid alt="avatar"/>
          <b-img class="avatar" v-else src="../assets/images/default-avatar.jpg" fluid alt="avatar"/>
        </b-col>
        <b-col md="10">
          <p class="com-author">{{ comment.author }}</p>
          <p class="com-content">{{ comment.comment }}</p>
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
class Comment {
  constructor() {
    this.avatar = null;
    this.author = "Ze";
    this.comment = "Comentario do Ze a falar de coisas do ze. \
    O ze tem opiniao. A opiniao do Ze conta. Viva o Ze. \
    Chupa Carlos Queiroz"
  }
}

export default {
  name: 'comment-section',
  data () {
    return {
      num_comments: 2,
      comments: [new Comment(), new Comment()],
      comment_text: ''
    }
  },
  methods: {
    onSubmit(event) {
      event.preventDefault();
      alert(this.comment_text);
    }
  }
}
</script>

<style scoped lang="scss">

@import "styles/global.scss";

#comment-section {
  h5 {
    color: #999999;
    font-weight: bold;
  }
}

#write-comment {
  margin-bottom: 3em;
}

#submit-button {
    margin-top: 1em;
    float: right;
}

.avatar {
  max-height: 100px;
}

.com-row {
  margin-bottom: 1em;
}
.com-author {
  font-weight: bold;
}
.com-content {
  text-align: justify;
}

</style>
