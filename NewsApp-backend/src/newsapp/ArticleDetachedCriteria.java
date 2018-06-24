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
	public final IntegerExpression attribute;
	public final IntegerExpression ID;
	public final StringExpression title;
	public final StringExpression content;
	public final IntegerExpression likes;
	public final CollectionExpression comments;
	public final CollectionExpression categories;
	public final CollectionExpression _contentType;
	
	public ArticleDetachedCriteria() {
		super(newsapp.Article.class, newsapp.ArticleCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		likes = new IntegerExpression("likes", this.getDetachedCriteria());
		comments = new CollectionExpression("ORM_comments", this.getDetachedCriteria());
		categories = new CollectionExpression("ORM_categories", this.getDetachedCriteria());
		_contentType = new CollectionExpression("ORM__contentType", this.getDetachedCriteria());
	}
	
	public ArticleDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, newsapp.ArticleCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		likes = new IntegerExpression("likes", this.getDetachedCriteria());
		comments = new CollectionExpression("ORM_comments", this.getDetachedCriteria());
		categories = new CollectionExpression("ORM_categories", this.getDetachedCriteria());
		_contentType = new CollectionExpression("ORM__contentType", this.getDetachedCriteria());
	}
	
	public CommentDetachedCriteria createCommentsCriteria() {
		return new CommentDetachedCriteria(createCriteria("ORM_comments"));
	}
	
	public CategoryDetachedCriteria createCategoriesCriteria() {
		return new CategoryDetachedCriteria(createCriteria("ORM_categories"));
	}
	
	public ContentTypeDetachedCriteria create_contentTypeCriteria() {
		return new ContentTypeDetachedCriteria(createCriteria("ORM__contentType"));
	}
	
	public Article uniqueArticle(PersistentSession session) {
		return (Article) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Article[] listArticle(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Article[]) list.toArray(new Article[list.size()]);
	}
}

