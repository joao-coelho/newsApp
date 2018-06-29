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

public class CategoryCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression description;
	
	public CategoryCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		description = new StringExpression("description", this);
	}
	
	public CategoryCriteria(PersistentSession session) {
		this(session.createCriteria(Category.class));
	}
	
	public CategoryCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public Category uniqueCategory() {
		return (Category) super.uniqueResult();
	}
	
	public Category[] listCategory() {
		java.util.List list = super.list();
		return (Category[]) list.toArray(new Category[list.size()]);
	}
}

