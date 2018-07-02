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

public class ChannelSuggestionCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression _receivers;
	public final StringExpression comment;
	public final DateExpression addedAt;
	public final IntegerExpression _authorId;
	public final AssociationExpression _author;
	public final IntegerExpression _targetId;
	public final AssociationExpression _target;
	
	public ChannelSuggestionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_receivers = new CollectionExpression("ORM__receivers", this);
		comment = new StringExpression("comment", this);
		addedAt = new DateExpression("addedAt", this);
		_authorId = new IntegerExpression("_author.ID", this);
		_author = new AssociationExpression("_author", this);
		_targetId = new IntegerExpression("_target.ID", this);
		_target = new AssociationExpression("_target", this);
	}
	
	public ChannelSuggestionCriteria(PersistentSession session) {
		this(session.createCriteria(ChannelSuggestion.class));
	}
	
	public ChannelSuggestionCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ChannelCriteria create_targetCriteria() {
		return new ChannelCriteria(createCriteria("_target"));
	}
	
	public UserCriteria create_receiversCriteria() {
		return new UserCriteria(createCriteria("ORM__receivers"));
	}
	
	public UserCriteria create_authorCriteria() {
		return new UserCriteria(createCriteria("_author"));
	}
	
	public ChannelSuggestion uniqueChannelSuggestion() {
		return (ChannelSuggestion) super.uniqueResult();
	}
	
	public ChannelSuggestion[] listChannelSuggestion() {
		java.util.List list = super.list();
		return (ChannelSuggestion[]) list.toArray(new ChannelSuggestion[list.size()]);
	}
}

