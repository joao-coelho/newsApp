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

import newsapp.data.ArticleSetCollection;
import newsapp.data.ChannelCategorySetCollection;
import newsapp.data.ORMConstants;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Channel")
public class Channel implements Serializable {
	public Channel() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CHANNEL_ARTICLES) {
			return ORM_articles;
		}
		else if (key == ORMConstants.KEY_CHANNEL__FIELDS) {
			return ORM__fields;
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
	
	@Column(name="Likes", nullable=true, length=10)	
	private Integer likes;
	
	@Column(name="Subscribers", nullable=true, length=10)	
	private Integer subscribers;
	
	@Column(name="Author_id", nullable=true, length=10)	
	private Integer author_id;
	
	@OneToMany(targetEntity=newsapp.Article.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ChannelID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_articles = new java.util.HashSet();
	
	@OneToMany(targetEntity=newsapp.ChannelCategory.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ChannelID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__fields = new java.util.HashSet();
	
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
	
	public void setLikes(int value) {
		setLikes(new Integer(value));
	}
	
	public void setLikes(Integer value) {
		this.likes = value;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	public void setSubscribers(int value) {
		setSubscribers(new Integer(value));
	}
	
	public void setSubscribers(Integer value) {
		this.subscribers = value;
	}
	
	public Integer getSubscribers() {
		return subscribers;
	}
	
	public void setAuthor_id(int value) {
		setAuthor_id(new Integer(value));
	}
	
	public void setAuthor_id(Integer value) {
		this.author_id = value;
	}
	
	public Integer getAuthor_id() {
		return author_id;
	}
	
	private void setORM_Articles(java.util.Set value) {
		this.ORM_articles = value;
	}
	
	private java.util.Set getORM_Articles() {
		return ORM_articles;
	}
	
	@Transient	
	public final ArticleSetCollection articles = new ArticleSetCollection(this, _ormAdapter, ORMConstants.KEY_CHANNEL_ARTICLES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__fields(java.util.Set value) {
		this.ORM__fields = value;
	}
	
	private java.util.Set getORM__fields() {
		return ORM__fields;
	}
	
	@Transient	
	public final ChannelCategorySetCollection _fields = new ChannelCategorySetCollection(this, _ormAdapter, ORMConstants.KEY_CHANNEL__FIELDS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
