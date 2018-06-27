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

public class ChannelCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression description;
	public final IntegerExpression likes;
	public final IntegerExpression subscribers;
	public final CollectionExpression _articles;
	public final CollectionExpression _categories;
	
	public ChannelCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		description = new StringExpression("description", this);
		likes = new IntegerExpression("likes", this);
		subscribers = new IntegerExpression("subscribers", this);
		_articles = new CollectionExpression("ORM__articles", this);
		_categories = new CollectionExpression("ORM__categories", this);
	}
	
	public ChannelCriteria(PersistentSession session) {
		this(session.createCriteria(Channel.class));
	}
	
	public ChannelCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ArticleCriteria create_articlesCriteria() {
		return new ArticleCriteria(createCriteria("ORM__articles"));
	}
	
	public ChannelCategoryCriteria create_categoriesCriteria() {
		return new ChannelCategoryCriteria(createCriteria("ORM__categories"));
	}
	
	public Channel uniqueChannel() {
		return (Channel) super.uniqueResult();
	}
	
	public Channel[] listChannel() {
		java.util.List list = super.list();
		return (Channel[]) list.toArray(new Channel[list.size()]);
	}
}

