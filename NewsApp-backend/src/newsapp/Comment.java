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
@Table(name="Comment")
public class Comment implements Serializable {
	public Comment() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMMENT_AUTHOR) {
			this.author = (newsapp.User) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Attribute", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="NEWSAPP_COMMENT_ATTRIBUTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="NEWSAPP_COMMENT_ATTRIBUTE_GENERATOR", strategy="native")	
	private int attribute;
	
	@ManyToOne(targetEntity=newsapp.User.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserAttribute", referencedColumnName="Attribute", nullable=false) })	
	private newsapp.User author;
	
	@Column(name="ID", nullable=false, length=10)	
	private int ID;
	
	@Column(name="Content", nullable=true, length=255)	
	private String content;
	
	@Column(name="AddedAt", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date addedAt;
	
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
	
	public void setAuthor(newsapp.User value) {
		this.author = value;
	}
	
	public newsapp.User getAuthor() {
		return author;
	}
	
	public String toString() {
		return String.valueOf(getAttribute());
	}
	
}
