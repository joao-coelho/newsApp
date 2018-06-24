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

public class ChannelSuggestionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression targetId;
	public final AssociationExpression target;
	public final IntegerExpression ID;
	
	public ChannelSuggestionDetachedCriteria() {
		super(newsapp.ChannelSuggestion.class, newsapp.ChannelSuggestionCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		targetId = new IntegerExpression("target.attribute", this.getDetachedCriteria());
		target = new AssociationExpression("target", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public ChannelSuggestionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, newsapp.ChannelSuggestionCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		targetId = new IntegerExpression("target.attribute", this.getDetachedCriteria());
		target = new AssociationExpression("target", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public ChannelDetachedCriteria createTargetCriteria() {
		return new ChannelDetachedCriteria(createCriteria("target"));
	}
	
	public ChannelSuggestion uniqueChannelSuggestion(PersistentSession session) {
		return (ChannelSuggestion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ChannelSuggestion[] listChannelSuggestion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ChannelSuggestion[]) list.toArray(new ChannelSuggestion[list.size()]);
	}
}

