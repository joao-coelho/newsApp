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

import newsapp.business.model.User;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UserCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression _subscriptions;
	public final StringExpression username;
	public final StringExpression password;
	public final StringExpression name;
	public final ShortExpression age;
	public final StringExpression country;
	public final StringExpression email;
	public final CollectionExpression _preferences;
	public final IntegerExpression _myChannelId;
	public final AssociationExpression _myChannel;
	public final CollectionExpression _likedArticles;
	
	public UserCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		_subscriptions = new CollectionExpression("ORM__subscriptions", this);
		username = new StringExpression("username", this);
		password = new StringExpression("password", this);
		name = new StringExpression("name", this);
		age = new ShortExpression("age", this);
		country = new StringExpression("country", this);
		email = new StringExpression("email", this);
		_preferences = new CollectionExpression("ORM__preferences", this);
		_myChannelId = new IntegerExpression("_myChannel.ID", this);
		_myChannel = new AssociationExpression("_myChannel", this);
		_likedArticles = new CollectionExpression("ORM__likedArticles", this);
	}
	
	public UserCriteria(PersistentSession session) {
		this(session.createCriteria(User.class));
	}
	
	public UserCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ChannelCriteria create_subscriptionsCriteria() {
		return new ChannelCriteria(createCriteria("ORM__subscriptions"));
	}
	
	public CategoryCriteria create_preferencesCriteria() {
		return new CategoryCriteria(createCriteria("ORM__preferences"));
	}
	
	public ChannelCriteria create_myChannelCriteria() {
		return new ChannelCriteria(createCriteria("_myChannel"));
	}
	
	public ArticleCriteria create_likedArticlesCriteria() {
		return new ArticleCriteria(createCriteria("ORM__likedArticles"));
	}
	
	public User uniqueUser() {
		return (User) super.uniqueResult();
	}
	
	public User[] listUser() {
		java.util.List list = super.list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

