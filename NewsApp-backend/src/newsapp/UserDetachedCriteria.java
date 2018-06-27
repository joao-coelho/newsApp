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
	public final IntegerExpression _myChannelId;
	public final AssociationExpression _myChannel;
	public final StringExpression username;
	public final StringExpression password;
	public final StringExpression name;
	public final ShortExpression age;
	public final StringExpression country;
	public final CollectionExpression _preferences;
	public final CollectionExpression _subscriptions;
	
	public UserDetachedCriteria() {
		super(newsapp.User.class, newsapp.UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_myChannelId = new IntegerExpression("_myChannel.ID", this.getDetachedCriteria());
		_myChannel = new AssociationExpression("_myChannel", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		age = new ShortExpression("age", this.getDetachedCriteria());
		country = new StringExpression("country", this.getDetachedCriteria());
		_preferences = new CollectionExpression("ORM__preferences", this.getDetachedCriteria());
		_subscriptions = new CollectionExpression("ORM__subscriptions", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, newsapp.UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_myChannelId = new IntegerExpression("_myChannel.ID", this.getDetachedCriteria());
		_myChannel = new AssociationExpression("_myChannel", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		age = new ShortExpression("age", this.getDetachedCriteria());
		country = new StringExpression("country", this.getDetachedCriteria());
		_preferences = new CollectionExpression("ORM__preferences", this.getDetachedCriteria());
		_subscriptions = new CollectionExpression("ORM__subscriptions", this.getDetachedCriteria());
	}
	
	public ChannelDetachedCriteria create_myChannelCriteria() {
		return new ChannelDetachedCriteria(createCriteria("_myChannel"));
	}
	
	public CategoryDetachedCriteria create_preferencesCriteria() {
		return new CategoryDetachedCriteria(createCriteria("ORM__preferences"));
	}
	
	public ChannelDetachedCriteria create_subscriptionsCriteria() {
		return new ChannelDetachedCriteria(createCriteria("ORM__subscriptions"));
	}
	
	public User uniqueUser(PersistentSession session) {
		return (User) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User[] listUser(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

