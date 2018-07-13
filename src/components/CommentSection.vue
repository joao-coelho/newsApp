<template>
  <div id="comment-section">
    <h6> Make a comment here </h6>
    <div id="write-comment">
      <b-form @submit="onSubmit">
        <b-form-textarea id="commentarea"
                   v-model="commentText"
                   placeholder="Type your comment here"
                   :no-resize="true"
                   :rows="3"
                   :max-rows="3"/>
        <b-button id="submit-button" type="submit">Submit</b-button>
      </b-form>
    </div>
    <h5> {{numComments}} comments </h5>
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
  constructor(avatar, author, comment, authorId, addedAt) {
    this.avatar = avatar;
    this.author = author;
    this.comment = comment;
    this.authorId = authorId;
    this.addedAt = addedAt;
  }
}

export default {
  name: 'comment-section',
  data () {
    return {
      numComments: 0,
      comments: [],
      commentText: ''
    }
  },
  methods: {
    onSubmit(event) {
      event.preventDefault();
      alert(this.commentText);
    },
    getComments() {
      this.$axios({url: '/articles/comments',
                  params: {
                    article_id: this.article.id,
                    token: this.$store.getters.getToken
                  },
                  method: 'GET' })
        .then(resp => {
          let comments = JSON.parse(resp);
          let size = comments.length;
          this.numComments = size;
          for(var i = 0; i < size; i++) {
            let comment = comments[i];
            this.comments.push(
              new Comment(comment.avatar,
                comment.author,
                comment.content,
                comment.authorId,
                comment.addedAt
              )
            );
          }
        }).catch(error => {
          console.log(error);
        });
    }
  },
  mounted() {
    getComments();
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
