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
@Table(name="Channel")
public class Channel implements Serializable {
	public Channel() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CHANNEL__ARTICLES) {
			return ORM__articles;
		}
		else if (key == ORMConstants.KEY_CHANNEL_CATEGORIES) {
			return ORM_categories;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="NEWSAPP_CHANNEL_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="NEWSAPP_CHANNEL_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@Column(name="Subscribers", nullable=false, length=10)	
	private int subscribers;
	
	@Column(name="Image_url", nullable=true, length=255)	
	private String image_url;
	
	@OneToMany(targetEntity=newsapp.Article.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ChannelID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__articles = new java.util.HashSet();
	
	@ManyToMany(targetEntity=newsapp.Category.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Channel_Category", joinColumns={ @JoinColumn(name="ChannelID") }, inverseJoinColumns={ @JoinColumn(name="CategoryID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_categories = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setSubscribers(int value) {
		this.subscribers = value;
	}
	
	public int getSubscribers() {
		return subscribers;
	}
	
	public void setImage_url(String value) {
		this.image_url = value;
	}
	
	public String getImage_url() {
		return image_url;
	}
	
	private void setORM__articles(java.util.Set value) {
		this.ORM__articles = value;
	}
	
	private java.util.Set getORM__articles() {
		return ORM__articles;
	}
	
	@Transient	
	public final newsapp.ArticleSetCollection _articles = new newsapp.ArticleSetCollection(this, _ormAdapter, ORMConstants.KEY_CHANNEL__ARTICLES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Categories(java.util.Set value) {
		this.ORM_categories = value;
	}
	
	private java.util.Set getORM_Categories() {
		return ORM_categories;
	}
	
	@Transient	
	public final newsapp.CategorySetCollection categories = new newsapp.CategorySetCollection(this, _ormAdapter, ORMConstants.KEY_CHANNEL_CATEGORIES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public int getLikes() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void setLikes(int likes) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
