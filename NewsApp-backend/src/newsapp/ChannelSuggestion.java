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
@Table(name="ChannelSuggestion")
public class ChannelSuggestion extends newsapp.Suggestion implements Serializable {
	public ChannelSuggestion() {
	}
	
	@Column(name="Attribute", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="NEWSAPP_CHANNELSUGGESTION_ATTRIBUTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="NEWSAPP_CHANNELSUGGESTION_ATTRIBUTE_GENERATOR", strategy="native")	
	private int attribute;
	
	@ManyToOne(targetEntity=newsapp.Channel.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ChannelAttribute", referencedColumnName="Attribute") })	
	private newsapp.Channel target;
	
	@Column(name="ID", nullable=false, length=10)	
	private int ID;
	
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
	
	public void setTarget(newsapp.Channel value) {
		this.target = value;
	}
	
	public newsapp.Channel getTarget() {
		return target;
	}
	
	public String toString() {
		return String.valueOf(getAttribute());
	}
	
}
