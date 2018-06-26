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

public class CommentDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression authorId;
	public final AssociationExpression author;
	public final StringExpression content;
	public final DateExpression addedAt;
	
	public CommentDetachedCriteria() {
		super(newsapp.Comment.class, newsapp.CommentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		authorId = new IntegerExpression("author.ID", this.getDetachedCriteria());
		author = new AssociationExpression("author", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		addedAt = new DateExpression("addedAt", this.getDetachedCriteria());
	}
	
	public CommentDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, newsapp.CommentCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		authorId = new IntegerExpression("author.ID", this.getDetachedCriteria());
		author = new AssociationExpression("author", this.getDetachedCriteria());
		content = new StringExpression("content", this.getDetachedCriteria());
		addedAt = new DateExpression("addedAt", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria createAuthorCriteria() {
		return new UserDetachedCriteria(createCriteria("author"));
	}
	
	public Comment uniqueComment(PersistentSession session) {
		return (Comment) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comment[] listComment(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comment[]) list.toArray(new Comment[list.size()]);
	}
}

