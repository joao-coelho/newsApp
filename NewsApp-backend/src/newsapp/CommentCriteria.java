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

public class CommentCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression authorId;
	public final AssociationExpression author;
	public final StringExpression content;
	public final DateExpression addedAt;
	
	public CommentCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		authorId = new IntegerExpression("author.ID", this);
		author = new AssociationExpression("author", this);
		content = new StringExpression("content", this);
		addedAt = new DateExpression("addedAt", this);
	}
	
	public CommentCriteria(PersistentSession session) {
		this(session.createCriteria(Comment.class));
	}
	
	public CommentCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public UserCriteria createAuthorCriteria() {
		return new UserCriteria(createCriteria("author"));
	}
	
	public Comment uniqueComment() {
		return (Comment) super.uniqueResult();
	}
	
	public Comment[] listComment() {
		java.util.List list = super.list();
		return (Comment[]) list.toArray(new Comment[list.size()]);
	}
}

