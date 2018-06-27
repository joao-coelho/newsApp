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

import newsapp.Channel;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ChannelDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final StringExpression description;
	public final IntegerExpression likes;
	public final IntegerExpression subscribers;
	public final IntegerExpression author_id;
	public final CollectionExpression articles;
	public final CollectionExpression _fields;
	
	public ChannelDetachedCriteria() {
		super(newsapp.Channel.class, ChannelCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		likes = new IntegerExpression("likes", this.getDetachedCriteria());
		subscribers = new IntegerExpression("subscribers", this.getDetachedCriteria());
		author_id = new IntegerExpression("author_id", this.getDetachedCriteria());
		articles = new CollectionExpression("ORM_articles", this.getDetachedCriteria());
		_fields = new CollectionExpression("ORM__fields", this.getDetachedCriteria());
	}
	
	public ChannelDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ChannelCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		likes = new IntegerExpression("likes", this.getDetachedCriteria());
		subscribers = new IntegerExpression("subscribers", this.getDetachedCriteria());
		author_id = new IntegerExpression("author_id", this.getDetachedCriteria());
		articles = new CollectionExpression("ORM_articles", this.getDetachedCriteria());
		_fields = new CollectionExpression("ORM__fields", this.getDetachedCriteria());
	}
	
	public ArticleDetachedCriteria createArticlesCriteria() {
		return new ArticleDetachedCriteria(createCriteria("ORM_articles"));
	}
	
	public ChannelCategoryDetachedCriteria create_fieldsCriteria() {
		return new ChannelCategoryDetachedCriteria(createCriteria("ORM__fields"));
	}
	
	public Channel uniqueChannel(PersistentSession session) {
		return (Channel) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Channel[] listChannel(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Channel[]) list.toArray(new Channel[list.size()]);
	}
}

