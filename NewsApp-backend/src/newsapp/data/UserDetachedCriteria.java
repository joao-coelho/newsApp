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

import newsapp.User;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UserDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression myChannelId;
	public final AssociationExpression myChannel;
	public final StringExpression username;
	public final StringExpression password;
	public final StringExpression nome;
	public final ShortExpression idade;
	public final StringExpression nacionalidade;
	public final CollectionExpression subscriptions;
	public final CollectionExpression _preferences;
	
	public UserDetachedCriteria() {
		super(newsapp.User.class, UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		myChannelId = new IntegerExpression("myChannel.ID", this.getDetachedCriteria());
		myChannel = new AssociationExpression("myChannel", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		idade = new ShortExpression("idade", this.getDetachedCriteria());
		nacionalidade = new StringExpression("nacionalidade", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		_preferences = new CollectionExpression("ORM__preferences", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		myChannelId = new IntegerExpression("myChannel.ID", this.getDetachedCriteria());
		myChannel = new AssociationExpression("myChannel", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		idade = new ShortExpression("idade", this.getDetachedCriteria());
		nacionalidade = new StringExpression("nacionalidade", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_subscriptions", this.getDetachedCriteria());
		_preferences = new CollectionExpression("ORM__preferences", this.getDetachedCriteria());
	}
	
	public ChannelDetachedCriteria createMyChannelCriteria() {
		return new ChannelDetachedCriteria(createCriteria("myChannel"));
	}
	
	public ChannelDetachedCriteria createSubscriptionsCriteria() {
		return new ChannelDetachedCriteria(createCriteria("ORM_subscriptions"));
	}
	
	public CategoryDetachedCriteria create_preferencesCriteria() {
		return new CategoryDetachedCriteria(createCriteria("ORM__preferences"));
	}
	
	public User uniqueUser(PersistentSession session) {
		return (User) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User[] listUser(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

