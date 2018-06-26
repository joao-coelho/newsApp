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
	public final IntegerExpression authorId;
	public final AssociationExpression author;
	public final StringExpression comment;
	public final DateExpression madeAt;
	public final CollectionExpression receivers;
	
	public SuggestionDetachedCriteria() {
		super(newsapp.Suggestion.class, newsapp.SuggestionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		authorId = new IntegerExpression("author.ID", this.getDetachedCriteria());
		author = new AssociationExpression("author", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		madeAt = new DateExpression("madeAt", this.getDetachedCriteria());
		receivers = new CollectionExpression("ORM_receivers", this.getDetachedCriteria());
	}
	
	public SuggestionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, newsapp.SuggestionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		authorId = new IntegerExpression("author.ID", this.getDetachedCriteria());
		author = new AssociationExpression("author", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		madeAt = new DateExpression("madeAt", this.getDetachedCriteria());
		receivers = new CollectionExpression("ORM_receivers", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria createAuthorCriteria() {
		return new UserDetachedCriteria(createCriteria("author"));
	}
	
	public UserDetachedCriteria createReceiversCriteria() {
		return new UserDetachedCriteria(createCriteria("ORM_receivers"));
	}
	
	public Suggestion uniqueSuggestion(PersistentSession session) {
		return (Suggestion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Suggestion[] listSuggestion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Suggestion[]) list.toArray(new Suggestion[list.size()]);
	}
}

