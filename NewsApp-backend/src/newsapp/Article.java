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

import newsapp.data.ArticleCategorySetCollection;
import newsapp.data.CommentSetCollection;
import newsapp.data.ORMConstants;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Article")
public class Article implements Serializable {
	public Article() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ARTICLE_COMMENTS) {
			return ORM_comments;
		}
		else if (key == ORMConstants.KEY_ARTICLE__ARTICLECATEGORIES) {
			return ORM__articleCategories;
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
	
	@Column(name="Likes", nullable=true, length=10)	
	private Integer likes;
	
	@OneToMany(targetEntity=newsapp.Comment.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ArticleID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comments = new java.util.HashSet();
	
	@OneToMany(targetEntity=newsapp.ArticleCategory.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ArticleID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__articleCategories = new java.util.HashSet();
	
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
		setLikes(new Integer(value));
	}
	
	public void setLikes(Integer value) {
		this.likes = value;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	private void setORM_Comments(java.util.Set value) {
		this.ORM_comments = value;
	}
	
	private java.util.Set getORM_Comments() {
		return ORM_comments;
	}
	
	@Transient	
	public final CommentSetCollection comments = new CommentSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTICLE_COMMENTS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM__articleCategories(java.util.Set value) {
		this.ORM__articleCategories = value;
	}
	
	private java.util.Set getORM__articleCategories() {
		return ORM__articleCategories;
	}
	
	@Transient	
	public final ArticleCategorySetCollection _articleCategories = new ArticleCategorySetCollection(this, _ormAdapter, ORMConstants.KEY_ARTICLE__ARTICLECATEGORIES, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
