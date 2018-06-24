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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="`User`")
public class User implements Serializable {
	public User() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USER_SUBSCRIPTIONS) {
			return ORM_subscriptions;
		}
		else if (key == ORMConstants.KEY_USER_PREFERENCES) {
			return ORM_preferences;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Attribute", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="NEWSAPP_USER_ATTRIBUTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="NEWSAPP_USER_ATTRIBUTE_GENERATOR", strategy="native")	
	private int attribute;
	
	@ManyToOne(targetEntity=newsapp.Channel.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ChannelAttribute", referencedColumnName="Attribute", nullable=false) })	
	private newsapp.Channel myChannel;
	
	@Column(name="ID", nullable=false, length=10)	
	private int ID;
	
	@Column(name="Username", nullable=true, length=255)	
	private String username;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@OneToMany(targetEntity=newsapp.Channel.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserAttribute", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_subscriptions = new java.util.HashSet();
	
	@OneToMany(targetEntity=newsapp.Category.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserAttribute", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_preferences = new java.util.HashSet();
	
	private void setAttribute(int value) {
		this.attribute = value;
	}
	
	public int getAttribute() {
		return attribute;
	}
	
	public int getORMID() {
		return getAttribute();
	}
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	private void setORM_Subscriptions(java.util.Set value) {
		this.ORM_subscriptions = value;
	}
	
	private java.util.Set getORM_Subscriptions() {
		return ORM_subscriptions;
	}
	
	@Transient	
	public final newsapp.ChannelSetCollection subscriptions = new newsapp.ChannelSetCollection(this, _ormAdapter, ORMConstants.KEY_USER_SUBSCRIPTIONS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setMyChannel(newsapp.Channel value) {
		this.myChannel = value;
	}
	
	public newsapp.Channel getMyChannel() {
		return myChannel;
	}
	
	private void setORM_Preferences(java.util.Set value) {
		this.ORM_preferences = value;
	}
	
	private java.util.Set getORM_Preferences() {
		return ORM_preferences;
	}
	
	@Transient	
	public final newsapp.CategorySetCollection preferences = new newsapp.CategorySetCollection(this, _ormAdapter, ORMConstants.KEY_USER_PREFERENCES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getAttribute());
	}
	
}
