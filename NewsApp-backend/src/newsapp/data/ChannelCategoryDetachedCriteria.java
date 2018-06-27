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

import newsapp.ChannelCategory;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ChannelCategoryDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression description;
	
	public ChannelCategoryDetachedCriteria() {
		super(newsapp.ChannelCategory.class, ChannelCategoryCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
	}
	
	public ChannelCategoryDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ChannelCategoryCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
	}
	
	public ChannelCategory uniqueChannelCategory(PersistentSession session) {
		return (ChannelCategory) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ChannelCategory[] listChannelCategory(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ChannelCategory[]) list.toArray(new ChannelCategory[list.size()]);
	}
}

