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

public class ContentTypeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression description;
	
	public ContentTypeCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		description = new StringExpression("description", this);
	}
	
	public ContentTypeCriteria(PersistentSession session) {
		this(session.createCriteria(ContentType.class));
	}
	
	public ContentTypeCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ContentType uniqueContentType() {
		return (ContentType) super.uniqueResult();
	}
	
	public ContentType[] listContentType() {
		java.util.List list = super.list();
		return (ContentType[]) list.toArray(new ContentType[list.size()]);
	}
}

