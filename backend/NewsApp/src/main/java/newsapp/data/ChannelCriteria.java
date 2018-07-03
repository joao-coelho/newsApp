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

import newsapp.business.model.Channel;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ChannelCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression description;
	public final IntegerExpression subscribers;
	public final StringExpression image_url;
	public final CollectionExpression _articles;
	public final CollectionExpression categories;
	
	public ChannelCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		description = new StringExpression("description", this);
		subscribers = new IntegerExpression("subscribers", this);
		image_url = new StringExpression("image_url", this);
		_articles = new CollectionExpression("ORM__articles", this);
		categories = new CollectionExpression("ORM_categories", this);
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
	
	public CategoryCriteria createCategoriesCriteria() {
		return new CategoryCriteria(createCriteria("ORM_categories"));
	}
	
	public Channel uniqueChannel() {
		return (Channel) super.uniqueResult();
	}
	
	public Channel[] listChannel() {
		java.util.List list = super.list();
		return (Channel[]) list.toArray(new Channel[list.size()]);
	}
}

