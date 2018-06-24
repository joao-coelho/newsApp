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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ArticleCriteria extends AbstractORMCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression ID;
	public final StringExpression title;
	public final StringExpression content;
	public final IntegerExpression likes;
	public final CollectionExpression comments;
	public final CollectionExpression categories;
	public final CollectionExpression _contentType;
	
	public ArticleCriteria(Criteria criteria) {
		super(criteria);
		attribute = new IntegerExpression("attribute", this);
		ID = new IntegerExpression("ID", this);
		title = new StringExpression("title", this);
		content = new StringExpression("content", this);
		likes = new IntegerExpression("likes", this);
		comments = new CollectionExpression("ORM_comments", this);
		categories = new CollectionExpression("ORM_categories", this);
		_contentType = new CollectionExpression("ORM__contentType", this);
	}
	
	public ArticleCriteria(PersistentSession session) {
		this(session.createCriteria(Article.class));
	}
	
	public ArticleCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public CommentCriteria createCommentsCriteria() {
		return new CommentCriteria(createCriteria("ORM_comments"));
	}
	
	public CategoryCriteria createCategoriesCriteria() {
		return new CategoryCriteria(createCriteria("ORM_categories"));
	}
	
	public ContentTypeCriteria create_contentTypeCriteria() {
		return new ContentTypeCriteria(createCriteria("ORM__contentType"));
	}
	
	public Article uniqueArticle() {
		return (Article) super.uniqueResult();
	}
	
	public Article[] listArticle() {
		java.util.List list = super.list();
		return (Article[]) list.toArray(new Article[list.size()]);
	}
}

