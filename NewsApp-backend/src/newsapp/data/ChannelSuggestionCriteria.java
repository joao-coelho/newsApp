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

import newsapp.ChannelSuggestion;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ChannelSuggestionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression authorId;
	public final AssociationExpression author;
	public final StringExpression comment;
	public final DateExpression madeAt;
	public final CollectionExpression receivers;
	public final IntegerExpression targetId;
	public final AssociationExpression target;
	
	public ChannelSuggestionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		authorId = new IntegerExpression("author.ID", this);
		author = new AssociationExpression("author", this);
		comment = new StringExpression("comment", this);
		madeAt = new DateExpression("madeAt", this);
		receivers = new CollectionExpression("ORM_receivers", this);
		targetId = new IntegerExpression("target.ID", this);
		target = new AssociationExpression("target", this);
	}
	
	public ChannelSuggestionCriteria(PersistentSession session) {
		this(session.createCriteria(ChannelSuggestion.class));
	}
	
	public ChannelSuggestionCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ChannelCriteria createTargetCriteria() {
		return new ChannelCriteria(createCriteria("target"));
	}
	
	public UserCriteria createAuthorCriteria() {
		return new UserCriteria(createCriteria("author"));
	}
	
	public UserCriteria createReceiversCriteria() {
		return new UserCriteria(createCriteria("ORM_receivers"));
	}
	
	public ChannelSuggestion uniqueChannelSuggestion() {
		return (ChannelSuggestion) super.uniqueResult();
	}
	
	public ChannelSuggestion[] listChannelSuggestion() {
		java.util.List list = super.list();
		return (ChannelSuggestion[]) list.toArray(new ChannelSuggestion[list.size()]);
	}
}

