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
	public final IntegerExpression attribute;
	public final IntegerExpression targetId;
	public final AssociationExpression target;
	public final IntegerExpression ID;
	
	public ChannelSuggestionCriteria(Criteria criteria) {
		super(criteria);
		attribute = new IntegerExpression("attribute", this);
		targetId = new IntegerExpression("target.attribute", this);
		target = new AssociationExpression("target", this);
		ID = new IntegerExpression("ID", this);
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
	
	public ChannelSuggestion uniqueChannelSuggestion() {
		return (ChannelSuggestion) super.uniqueResult();
	}
	
	public ChannelSuggestion[] listChannelSuggestion() {
		java.util.List list = super.list();
		return (ChannelSuggestion[]) list.toArray(new ChannelSuggestion[list.size()]);
	}
}

