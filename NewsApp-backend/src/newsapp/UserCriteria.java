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

public class UserCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression myChannelId;
	public final AssociationExpression myChannel;
	public final StringExpression username;
	public final StringExpression password;
	public final CollectionExpression subscriptions;
	public final CollectionExpression preferences;
	
	public UserCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		myChannelId = new IntegerExpression("myChannel.ID", this);
		myChannel = new AssociationExpression("myChannel", this);
		username = new StringExpression("username", this);
		password = new StringExpression("password", this);
		subscriptions = new CollectionExpression("ORM_subscriptions", this);
		preferences = new CollectionExpression("ORM_preferences", this);
	}
	
	public UserCriteria(PersistentSession session) {
		this(session.createCriteria(User.class));
	}
	
	public UserCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ChannelCriteria createMyChannelCriteria() {
		return new ChannelCriteria(createCriteria("myChannel"));
	}
	
	public ChannelCriteria createSubscriptionsCriteria() {
		return new ChannelCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public CategoryCriteria createPreferencesCriteria() {
		return new CategoryCriteria(createCriteria("ORM_preferences"));
	}
	
	public User uniqueUser() {
		return (User) super.uniqueResult();
	}
	
	public User[] listUser() {
		java.util.List list = super.list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

