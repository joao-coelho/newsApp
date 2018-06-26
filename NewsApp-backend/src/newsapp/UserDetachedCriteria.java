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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UserDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression myChannelId;
	public final AssociationExpression myChannel;
	public final StringExpression username;
	public final StringExpression password;
	public final CollectionExpression subscriptions;
	public final CollectionExpression preferences;
	
	public UserDetachedCriteria() {
		super(newsapp.User.class, newsapp.UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		myChannelId = new IntegerExpression("myChannel.ID", this.getDetachedCriteria());
		myChannel = new AssociationExpression("myChannel", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		preferences = new CollectionExpression("ORM_preferences", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, newsapp.UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		myChannelId = new IntegerExpression("myChannel.ID", this.getDetachedCriteria());
		myChannel = new AssociationExpression("myChannel", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		preferences = new CollectionExpression("ORM_preferences", this.getDetachedCriteria());
	}
	
	public ChannelDetachedCriteria createMyChannelCriteria() {
		return new ChannelDetachedCriteria(createCriteria("myChannel"));
	}
	
	public ChannelDetachedCriteria createSubscriptionsCriteria() {
		return new ChannelDetachedCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public CategoryDetachedCriteria createPreferencesCriteria() {
		return new CategoryDetachedCriteria(createCriteria("ORM_preferences"));
	}
	
	public User uniqueUser(PersistentSession session) {
		return (User) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User[] listUser(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

