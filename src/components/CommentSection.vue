<template>
  <div id="comment-section">
    <h6> {{ $t("comments_makeComment") }} </h6>
    <div id="write-comment">
      <b-alert variant="success"
               dismissible
               :show="success"
               @dismissed="success=false">
      {{ $t('comments_success') }}
      </b-alert>
      <b-alert variant="danger"
               dismissible
               :show="unsuccess"
               @dismissed="unsuccess=false">
      {{ $t('comments_unsuccess') }}
      </b-alert>
      <b-form @submit="onSubmit">
        <b-form-textarea id="commentarea"
                   v-model="commentText"
                   :placeholder="$t('comments_typeComment')"
                   :no-resize="true"
                   :rows="3"
                   :max-rows="3"/>
        <b-button id="submit-button" type="submit">Submit</b-button>
      </b-form>
    </div>
    <h5 v-if="numComments === 1"> {{numComments}} {{$t("comments_comment")}} </h5>
    <h5 v-else> {{numComments}} {{$t("comments_comments")}} </h5>
    <b-container fluid>
      <b-row v-for="(value, key) in comments"
             :key="key"
             class="com-row">
        <b-col md="2">

          <b-img class="avatar" v-if="value.avatar" :src="value.avatar" fluid alt="avatar"/>
          <b-img class="avatar" v-else src="../assets/images/default-avatar.jpg" fluid alt="avatar"/>
        </b-col>
        <b-col md="10">
          <p class="com-author">
            {{ value.author }}
            <span class="com-date">
              {{ value.addedAt.getDate() }},
              {{ $t(getMonth(value.addedAt)) }}
              {{ value.addedAt.getFullYear() }}
            </span>
          </p>
          <p class="com-content">{{ value.comment }}</p>
        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
class Comment {
  constructor(avatar, author, comment, authorId, addedAt) {
    this.avatar   = avatar;
    this.author   = author;
    this.comment  = comment;
    this.authorId = authorId;
    this.addedAt  = new Date(addedAt);
  }
}

export default {
  name: 'comment-section',
  data () {
    return {
      numComments: 0,
      comments: {},
      commentText: '',
      success: false,
      unsuccess: false
    }
  },
  props: {
    articleId: {
      type: Number,
      required: true
    }
  },
  methods: {
    onSubmit(event) {
      event.preventDefault();
      let comment = {
                      content: this.commentText,
                      idAuthor: this.$store.getters.getToken,
                      articleId: this.articleId,
                      addedAt: new Date()
                    }
      this.$axios({url: '/articles/addComment', data: comment, method: 'POST' })
        .then(resp => {
          this.commentText = '';
          this.getComments();
          this.success = true;
        }).catch(error => {
          console.log(error);
          this.unsuccess = true;
        });
    },
    getComments() {
      this.$axios({url: '/articles/comments',
                  params: {
                    article_id: this.articleId,
                    token: this.$store.getters.getToken
                  },
                  method: 'GET' })
        .then(resp => {
          let comments = resp.data;
          let size = comments.length;
          this.numComments = size;
          for(var i = 0; i < size; i++) {
            let comment = comments[i];
            this.comments[String(comment.id)] =
              new Comment(comment.avatar,
                comment.author,
                comment.content,
                comment.idAuthor,
                comment.addedAt
              );
          }
        }).catch(error => {
          console.log(error);
        });
    }
  },
  mounted() {
    this.getComments();
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
  margin-bottom: 0.75em;
  background-color: #eeeeee;
  padding: 0.2em;
  border: 1px solid grey;
  border-radius: 0.5em;
}
.com-author {
  font-weight: bold;
}
.com-content {
  text-align: justify;
}
.com-date {
  font-size: 0.8em;
  font-weight: normal;
  float: right;
}

</style>
