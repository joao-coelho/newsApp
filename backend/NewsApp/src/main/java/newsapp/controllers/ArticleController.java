package newsapp.controllers;


import newsapp.services.data.ArticleDetails;
import newsapp.services.IArticleService;
import newsapp.services.data.CommentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    IArticleService s;

    @RequestMapping(value = "/like", method = RequestMethod.POST)
    public ResponseEntity likeArticle(@RequestBody ArticleDetails ad) {
        if(ad.getToken() != 0 && ad.getId() != 0) {
            s.like(ad.getId(), ad.getToken());
            return ResponseEntity.ok(HttpStatus.OK);
        }
        return ResponseEntity.badRequest().body(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/articleLiked", method = RequestMethod.GET)
    public boolean articleIsLiked(@RequestParam int article_id, @RequestParam int user_id) {
        return s.isLiked(article_id, user_id);
    }

    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public ArticleDetails getArticle(@RequestParam int id) {
        ArticleDetails articleDetails = s.getArticle(id);
        return articleDetails;
    }

    @RequestMapping(value = "/addArticle", method = RequestMethod.POST)
    public boolean addArticle(@RequestBody ArticleDetails ad) {
        boolean success = s.addArticle(ad);
        return success;
    }

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public List<CommentDetails> getComments(@RequestParam int article_id, @RequestParam int token) {
        List<CommentDetails> result = s.getArticleComments(article_id);
        return result;
    }
}
