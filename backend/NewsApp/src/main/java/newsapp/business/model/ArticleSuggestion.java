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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("ArticleSuggestion")
public class ArticleSuggestion extends Suggestion implements Serializable {
	public ArticleSuggestion() {
	}
	
	@ManyToOne(targetEntity=Article.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ArticleID", referencedColumnName="ID") })	
	private Article _target;
	
	public void set_target(Article value) {
		this._target = value;
	}
	
	public Article get_target() {
		return _target;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
