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

import newsapp.ChannelCategory;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ChannelCategoryCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression description;
	
	public ChannelCategoryCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		description = new StringExpression("description", this);
	}
	
	public ChannelCategoryCriteria(PersistentSession session) {
		this(session.createCriteria(ChannelCategory.class));
	}
	
	public ChannelCategoryCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ChannelCategory uniqueChannelCategory() {
		return (ChannelCategory) super.uniqueResult();
	}
	
	public ChannelCategory[] listChannelCategory() {
		java.util.List list = super.list();
		return (ChannelCategory[]) list.toArray(new ChannelCategory[list.size()]);
	}
}

