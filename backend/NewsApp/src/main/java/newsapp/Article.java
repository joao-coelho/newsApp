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
@Table(name="Article")
public class Article implements Serializable {
	public Article() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ARTICLE__COMMENTS) {
			return ORM__comments;
		}
		else if (key == ORMConstants.KEY_ARTICLE__CATEGORIES) {
			return ORM__categories;
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
	@GeneratedValue(generator="NEWSAPP_ARTICLE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="NEWSAPP_ARTICLE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Title", nullable=true, length=255)	
	private String title;
	
	@Column(name="Content", nullable=true, length=255)	
	private String content;
	
	@Column(name="Likes", nullable=false, length=10)	
	private int likes;
	
	@Column(name="AddedAt", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date addedAt;
	
	@Column(name="Image_url", nullable=true, length=255)	
	private String image_url;
	
	@OneToMany(targetEntity=newsapp.Comment.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ArticleID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__comments = new java.util.HashSet();
	
	@ManyToMany(targetEntity=newsapp.Category.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Article_Category", joinColumns={ @JoinColumn(name="ArticleID") }, inverseJoinColumns={ @JoinColumn(name="CategoryID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__categories = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setLikes(int value) {
		this.likes = value;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public void setAddedAt(java.util.Date value) {
		this.addedAt = value;
	}
	
	public java.util.Date getAddedAt() {
		return addedAt;
	}
	
	public void setImage_url(String value) {
		this.image_url = value;
	}
	
	public String getImage_url() {
		return image_url;
	}
	
	private void setORM__comments(java.util.Set value) {
		this.ORM__comments = value;
	}
	
	private java.util.Set getORM__comments() {
		return ORM__comments;
	}
	
	@Transient	
	public final newsapp.CommentSetCollection _comments = new newsapp.CommentSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTICLE__COMMENTS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__categories(java.util.Set value) {
		this.ORM__categories = value;
	}
	
	private java.util.Set getORM__categories() {
		return ORM__categories;
	}
	
	@Transient	
	public final newsapp.CategorySetCollection _categories = new newsapp.CategorySetCollection(this, _ormAdapter, ORMConstants.KEY_ARTICLE__CATEGORIES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
