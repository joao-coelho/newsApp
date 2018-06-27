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

import newsapp.data.CategorySetCollection;
import newsapp.data.ChannelSetCollection;
import newsapp.data.ORMConstants;

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
		else if (key == ORMConstants.KEY_USER__PREFERENCES) {
			return ORM__preferences;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USER_MYCHANNEL) {
			this.myChannel = (newsapp.Channel) owner;
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
	
	@ManyToOne(targetEntity=newsapp.Channel.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ChannelID", referencedColumnName="ID", nullable=false) })	
	private newsapp.Channel myChannel;
	
	@Column(name="Username", nullable=true, length=255)	
	private String username;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="Idade", nullable=false)	
	private short idade;
	
	@Column(name="Nacionalidade", nullable=true, length=255)	
	private String nacionalidade;
	
	@OneToMany(targetEntity=newsapp.Channel.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_subscriptions = new java.util.HashSet();
	
	@OneToMany(targetEntity=newsapp.Category.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__preferences = new java.util.HashSet();
	
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
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(short value) {
		this.idade = value;
	}
	
	public short getIdade() {
		return idade;
	}
	
	public void setNacionalidade(String value) {
		this.nacionalidade = value;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setMyChannel(newsapp.Channel value) {
		this.myChannel = value;
	}
	
	public newsapp.Channel getMyChannel() {
		return myChannel;
	}
	
	private void setORM_Subscriptions(java.util.Set value) {
		this.ORM_subscriptions = value;
	}
	
	private java.util.Set getORM_Subscriptions() {
		return ORM_subscriptions;
	}
	
	@Transient	
	public final ChannelSetCollection subscriptions = new ChannelSetCollection(this, _ormAdapter, ORMConstants.KEY_USER_SUBSCRIPTIONS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__preferences(java.util.Set value) {
		this.ORM__preferences = value;
	}
	
	private java.util.Set getORM__preferences() {
		return ORM__preferences;
	}
	
	@Transient	
	public final CategorySetCollection _preferences = new CategorySetCollection(this, _ormAdapter, ORMConstants.KEY_USER__PREFERENCES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
