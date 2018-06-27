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

import newsapp.data.ORMConstants;
import newsapp.data.UserSetCollection;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Suggestion")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Suggestion")
public class Suggestion implements Serializable {
	public Suggestion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SUGGESTION_RECEIVERS) {
			return ORM_receivers;
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
	@GeneratedValue(generator="NEWSAPP_SUGGESTION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="NEWSAPP_SUGGESTION_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=newsapp.User.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserID", referencedColumnName="ID", nullable=false) })	
	private newsapp.User author;
	
	@Column(name="Comment", nullable=true, length=255)	
	private String comment;
	
	@Column(name="MadeAt", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date madeAt;
	
	@OneToMany(targetEntity=newsapp.User.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="SuggestionID", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_receivers = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setComment(String value) {
		this.comment = value;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setMadeAt(java.util.Date value) {
		this.madeAt = value;
	}
	
	public java.util.Date getMadeAt() {
		return madeAt;
	}
	
	private void setORM_Receivers(java.util.Set value) {
		this.ORM_receivers = value;
	}
	
	private java.util.Set getORM_Receivers() {
		return ORM_receivers;
	}
	
	@Transient	
	public final UserSetCollection receivers = new UserSetCollection(this, _ormAdapter, ORMConstants.KEY_SUGGESTION_RECEIVERS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setAuthor(newsapp.User value) {
		this.author = value;
	}
	
	public newsapp.User getAuthor() {
		return author;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
