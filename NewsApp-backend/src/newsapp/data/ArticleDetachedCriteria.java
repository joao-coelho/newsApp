/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: José Miguel Ribeiro da Silva(Universidade do Minho)
 * License Type: Academic
 */
package newsapp.data;

import java.util.List;

import newsapp.Article;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ArticleDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression title;
	public final StringExpression content;
	public final IntegerExpression likes;
	public final CollectionExpression comments;
	public final CollectionExpression _articleCategories;
	
	public ArticleDetachedCriteria() {
		super(newsapp.Article.class, ArticleCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		likes = new IntegerExpression("likes", this.getDetachedCriteria());
		comments = new CollectionExpression("ORM_comments", this.getDetachedCriteria());
		_articleCategories = new CollectionExpression("ORM__articleCategories", this.getDetachedCriteria());
	}
	
	public ArticleDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ArticleCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		likes = new IntegerExpression("likes", this.getDetachedCriteria());
		comments = new CollectionExpression("ORM_comments", this.getDetachedCriteria());
		_articleCategories = new CollectionExpression("ORM__articleCategories", this.getDetachedCriteria());
	}
	
	public CommentDetachedCriteria createCommentsCriteria() {
		return new CommentDetachedCriteria(createCriteria("ORM_comments"));
	}
	
	public ArticleCategoryDetachedCriteria create_articleCategoriesCriteria() {
		return new ArticleCategoryDetachedCriteria(createCriteria("ORM__articleCategories"));
	}
	
	public Article uniqueArticle(PersistentSession session) {
		return (Article) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Article[] listArticle(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Article[]) list.toArray(new Article[list.size()]);
	}
}

