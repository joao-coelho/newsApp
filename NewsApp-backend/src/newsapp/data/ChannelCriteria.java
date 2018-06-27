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

import newsapp.Channel;
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
	public final IntegerExpression author_id;
	public final CollectionExpression articles;
	public final CollectionExpression _fields;
	
	public ChannelCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		description = new StringExpression("description", this);
		likes = new IntegerExpression("likes", this);
		subscribers = new IntegerExpression("subscribers", this);
		author_id = new IntegerExpression("author_id", this);
		articles = new CollectionExpression("ORM_articles", this);
		_fields = new CollectionExpression("ORM__fields", this);
	}
	
	public ChannelCriteria(PersistentSession session) {
		this(session.createCriteria(Channel.class));
	}
	
	public ChannelCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ArticleCriteria createArticlesCriteria() {
		return new ArticleCriteria(createCriteria("ORM_articles"));
	}
	
	public ChannelCategoryCriteria create_fieldsCriteria() {
		return new ChannelCategoryCriteria(createCriteria("ORM__fields"));
	}
	
	public Channel uniqueChannel() {
		return (Channel) super.uniqueResult();
	}
	
	public Channel[] listChannel() {
		java.util.List list = super.list();
		return (Channel[]) list.toArray(new Channel[list.size()]);
	}
}

