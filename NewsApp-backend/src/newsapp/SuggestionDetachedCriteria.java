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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class SuggestionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression _receivers;
	public final StringExpression comment;
	public final DateExpression addedAt;
	public final IntegerExpression _authorId;
	public final AssociationExpression _author;
	
	public SuggestionDetachedCriteria() {
		super(newsapp.Suggestion.class, newsapp.SuggestionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_receivers = new CollectionExpression("ORM__receivers", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		addedAt = new DateExpression("addedAt", this.getDetachedCriteria());
		_authorId = new IntegerExpression("_author.ID", this.getDetachedCriteria());
		_author = new AssociationExpression("_author", this.getDetachedCriteria());
	}
	
	public SuggestionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, newsapp.SuggestionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		_receivers = new CollectionExpression("ORM__receivers", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		addedAt = new DateExpression("addedAt", this.getDetachedCriteria());
		_authorId = new IntegerExpression("_author.ID", this.getDetachedCriteria());
		_author = new AssociationExpression("_author", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria create_receiversCriteria() {
		return new UserDetachedCriteria(createCriteria("ORM__receivers"));
	}
	
	public UserDetachedCriteria create_authorCriteria() {
		return new UserDetachedCriteria(createCriteria("_author"));
	}
	
	public Suggestion uniqueSuggestion(PersistentSession session) {
		return (Suggestion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Suggestion[] listSuggestion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Suggestion[]) list.toArray(new Suggestion[list.size()]);
	}
}

