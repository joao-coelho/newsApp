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
package newsapp.business.model;

import newsapp.data.ORMConstants;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Comment")
public class Comment implements Serializable {
	public Comment() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMMENT_ARTICLE) {
			this.article = (Article) owner;
		}
		
		else if (key == ORMConstants.KEY_COMMENT__AUTHOR) {
			this._author = (User) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="NEWSAPP_COMMENT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="NEWSAPP_COMMENT_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Article.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ArticleID", referencedColumnName="ID", nullable=false) })	
	private Article article;
	
	@ManyToOne(targetEntity=User.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserID", referencedColumnName="ID", nullable=false) })	
	private User _author;
	
	@Column(name="Content", nullable=true, length=255)	
	private String content;
	
	@Column(name="AddedAt", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date addedAt;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setAddedAt(java.util.Date value) {
		this.addedAt = value;
	}
	
	public java.util.Date getAddedAt() {
		return addedAt;
	}
	
	public void setArticle(Article value) {
		if (article != null) {
			article._comments.remove(this);
		}
		if (value != null) {
			value._comments.add(this);
		}
	}
	
	public Article getArticle() {
		return article;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Article(Article value) {
		this.article = value;
	}
	
	private Article getORM_Article() {
		return article;
	}
	
	public void set_author(User value) {
		this._author = value;
	}
	
	public User get_author() {
		return _author;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
