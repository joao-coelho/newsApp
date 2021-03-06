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

import newsapp.business.model.Channel;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ChannelDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression description;
	public final IntegerExpression subscribers;
	public final StringExpression image_url;
	public final CollectionExpression _articles;
	public final CollectionExpression categories;
	
	public ChannelDetachedCriteria() {
		super(Channel.class, ChannelCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		subscribers = new IntegerExpression("subscribers", this.getDetachedCriteria());
		image_url = new StringExpression("image_url", this.getDetachedCriteria());
		_articles = new CollectionExpression("ORM__articles", this.getDetachedCriteria());
		categories = new CollectionExpression("ORM_categories", this.getDetachedCriteria());
	}
	
	public ChannelDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ChannelCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		subscribers = new IntegerExpression("subscribers", this.getDetachedCriteria());
		image_url = new StringExpression("image_url", this.getDetachedCriteria());
		_articles = new CollectionExpression("ORM__articles", this.getDetachedCriteria());
		categories = new CollectionExpression("ORM_categories", this.getDetachedCriteria());
	}
	
	public ArticleDetachedCriteria create_articlesCriteria() {
		return new ArticleDetachedCriteria(createCriteria("ORM__articles"));
	}
	
	public CategoryDetachedCriteria createCategoriesCriteria() {
		return new CategoryDetachedCriteria(createCriteria("ORM_categories"));
	}
	
	public Channel uniqueChannel(PersistentSession session) {
		return (Channel) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Channel[] listChannel(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Channel[]) list.toArray(new Channel[list.size()]);
	}
}

