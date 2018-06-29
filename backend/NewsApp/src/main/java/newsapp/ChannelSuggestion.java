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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("ChannelSuggestion")
public class ChannelSuggestion extends newsapp.Suggestion implements Serializable {
	public ChannelSuggestion() {
	}
	
	@ManyToOne(targetEntity=newsapp.Channel.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ChannelID", referencedColumnName="ID") })	
	private newsapp.Channel _target;
	
	public void set_target(newsapp.Channel value) {
		this._target = value;
	}
	
	public newsapp.Channel get_target() {
		return _target;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
