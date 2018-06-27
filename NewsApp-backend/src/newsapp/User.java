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
		if (key == ORMConstants.KEY_USER__PREFERENCES) {
			return ORM__preferences;
		}
		else if (key == ORMConstants.KEY_USER__SUBSCRIPTIONS) {
			return ORM__subscriptions;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USER__MYCHANNEL) {
			this._myChannel = (newsapp.Channel) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="NEWSAPP_USER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="NEWSAPP_USER_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToMany(targetEntity=newsapp.Channel.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="User_Channel", joinColumns={ @JoinColumn(name="UserID") }, inverseJoinColumns={ @JoinColumn(name="ChannelID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__subscriptions = new java.util.HashSet();
	
	@Column(name="Username", nullable=true, length=255)	
	private String username;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Age", nullable=true)	
	private Short age;
	
	@Column(name="Country", nullable=true, length=255)	
	private String country;
	
	@OneToMany(targetEntity=newsapp.Category.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__preferences = new java.util.HashSet();
	
	@ManyToOne(targetEntity=newsapp.Channel.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ChannelID", referencedColumnName="ID", nullable=false) })	
	private newsapp.Channel _myChannel;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
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
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(short value) {
		setAge(new Short(value));
	}
	
	public void setAge(Short value) {
		this.age = value;
	}
	
	public Short getAge() {
		return age;
	}
	
	public void setCountry(String value) {
		this.country = value;
	}
	
	public String getCountry() {
		return country;
	}
	
	private void setORM__preferences(java.util.Set value) {
		this.ORM__preferences = value;
	}
	
	private java.util.Set getORM__preferences() {
		return ORM__preferences;
	}
	
	@Transient	
	public final newsapp.CategorySetCollection _preferences = new newsapp.CategorySetCollection(this, _ormAdapter, ORMConstants.KEY_USER__PREFERENCES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__subscriptions(java.util.Set value) {
		this.ORM__subscriptions = value;
	}
	
	private java.util.Set getORM__subscriptions() {
		return ORM__subscriptions;
	}
	
	@Transient	
	public final newsapp.ChannelSetCollection _subscriptions = new newsapp.ChannelSetCollection(this, _ormAdapter, ORMConstants.KEY_USER__SUBSCRIPTIONS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void set_myChannel(newsapp.Channel value) {
		this._myChannel = value;
	}
	
	public newsapp.Channel get_myChannel() {
		return _myChannel;
	}
	
	public void setAge(Short age) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
