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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ArticleSuggestionCriteria extends AbstractORMCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression targetId;
	public final AssociationExpression target;
	public final IntegerExpression ID;
	
	public ArticleSuggestionCriteria(Criteria criteria) {
		super(criteria);
		attribute = new IntegerExpression("attribute", this);
		targetId = new IntegerExpression("target.attribute", this);
		target = new AssociationExpression("target", this);
		ID = new IntegerExpression("ID", this);
	}
	
	public ArticleSuggestionCriteria(PersistentSession session) {
		this(session.createCriteria(ArticleSuggestion.class));
	}
	
	public ArticleSuggestionCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ArticleCriteria createTargetCriteria() {
		return new ArticleCriteria(createCriteria("target"));
	}
	
	public ArticleSuggestion uniqueArticleSuggestion() {
		return (ArticleSuggestion) super.uniqueResult();
	}
	
	public ArticleSuggestion[] listArticleSuggestion() {
		java.util.List list = super.list();
		return (ArticleSuggestion[]) list.toArray(new ArticleSuggestion[list.size()]);
	}
}

