package backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    IArticleService s;

    @RequestMapping(value = "/addArticle", method = RequestMethod.POST)
    public boolean addArticle(@RequestBody ArticleDetails ad) {
        boolean success = s.addArticle(ad);
        return success;
    }

}
