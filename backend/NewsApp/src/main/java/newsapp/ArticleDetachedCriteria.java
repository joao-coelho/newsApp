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
package newsapp;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ArticleDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression title;
	public final StringExpression content;
	public final IntegerExpression likes;
	public final DateExpression addedAt;
	public final StringExpression image_url;
	public final CollectionExpression _comments;
	public final CollectionExpression _categories;
	
	public ArticleDetachedCriteria() {
		super(newsapp.Article.class, newsapp.ArticleCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		likes = new IntegerExpression("likes", this.getDetachedCriteria());
		addedAt = new DateExpression("addedAt", this.getDetachedCriteria());
		image_url = new StringExpression("image_url", this.getDetachedCriteria());
		_comments = new CollectionExpression("ORM__comments", this.getDetachedCriteria());
		_categories = new CollectionExpression("ORM__categories", this.getDetachedCriteria());
	}
	
	public ArticleDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, newsapp.ArticleCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		likes = new IntegerExpression("likes", this.getDetachedCriteria());
		addedAt = new DateExpression("addedAt", this.getDetachedCriteria());
		image_url = new StringExpression("image_url", this.getDetachedCriteria());
		_comments = new CollectionExpression("ORM__comments", this.getDetachedCriteria());
		_categories = new CollectionExpression("ORM__categories", this.getDetachedCriteria());
	}
	
	public CommentDetachedCriteria create_commentsCriteria() {
		return new CommentDetachedCriteria(createCriteria("ORM__comments"));
	}
	
	public CategoryDetachedCriteria create_categoriesCriteria() {
		return new CategoryDetachedCriteria(createCriteria("ORM__categories"));
	}
	
	public Article uniqueArticle(PersistentSession session) {
		return (Article) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Article[] listArticle(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Article[]) list.toArray(new Article[list.size()]);
	}
}

