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

import newsapp.business.model.Comment;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CommentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression articleId;
	public final AssociationExpression article;
	public final IntegerExpression _authorId;
	public final AssociationExpression _author;
	public final StringExpression content;
	public final DateExpression addedAt;
	
	public CommentDetachedCriteria() {
		super(Comment.class, CommentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		articleId = new IntegerExpression("article.ID", this.getDetachedCriteria());
		article = new AssociationExpression("article", this.getDetachedCriteria());
		_authorId = new IntegerExpression("_author.ID", this.getDetachedCriteria());
		_author = new AssociationExpression("_author", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		addedAt = new DateExpression("addedAt", this.getDetachedCriteria());
	}
	
	public CommentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CommentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		articleId = new IntegerExpression("article.ID", this.getDetachedCriteria());
		article = new AssociationExpression("article", this.getDetachedCriteria());
		_authorId = new IntegerExpression("_author.ID", this.getDetachedCriteria());
		_author = new AssociationExpression("_author", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		addedAt = new DateExpression("addedAt", this.getDetachedCriteria());
	}
	
	public ArticleDetachedCriteria createArticleCriteria() {
		return new ArticleDetachedCriteria(createCriteria("article"));
	}
	
	public UserDetachedCriteria create_authorCriteria() {
		return new UserDetachedCriteria(createCriteria("_author"));
	}
	
	public Comment uniqueComment(PersistentSession session) {
		return (Comment) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comment[] listComment(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comment[]) list.toArray(new Comment[list.size()]);
	}
}

