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
package newsapp.data;

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
		if (key == ORMConstants.KEY_SUGGESTION__RECEIVERS) {
			return ORM__receivers;
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
	
	@ManyToMany(targetEntity=User.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Suggestion_User", joinColumns={ @JoinColumn(name="SuggestionID") }, inverseJoinColumns={ @JoinColumn(name="UserID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM__receivers = new java.util.HashSet();
	
	@Column(name="Comment", nullable=true, length=255)	
	private String comment;
	
	@Column(name="AddedAt", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date addedAt;
	
	@ManyToOne(targetEntity=User.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="UserID", referencedColumnName="ID", nullable=false) })	
	private User _author;
	
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
	
	public void setAddedAt(java.util.Date value) {
		this.addedAt = value;
	}
	
	public java.util.Date getAddedAt() {
		return addedAt;
	}
	
	private void setORM__receivers(java.util.Set value) {
		this.ORM__receivers = value;
	}
	
	private java.util.Set getORM__receivers() {
		return ORM__receivers;
	}
	
	@Transient	
	public final UserSetCollection _receivers = new UserSetCollection(this, _ormAdapter, ORMConstants.KEY_SUGGESTION__RECEIVERS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
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
