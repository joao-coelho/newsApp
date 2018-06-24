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

public class ArticleSuggestionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression targetId;
	public final AssociationExpression target;
	public final IntegerExpression ID;
	
	public ArticleSuggestionDetachedCriteria() {
		super(newsapp.ArticleSuggestion.class, newsapp.ArticleSuggestionCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		targetId = new IntegerExpression("target.attribute", this.getDetachedCriteria());
		target = new AssociationExpression("target", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public ArticleSuggestionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, newsapp.ArticleSuggestionCriteria.class);
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		targetId = new IntegerExpression("target.attribute", this.getDetachedCriteria());
		target = new AssociationExpression("target", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}
	
	public ArticleDetachedCriteria createTargetCriteria() {
		return new ArticleDetachedCriteria(createCriteria("target"));
	}
	
	public ArticleSuggestion uniqueArticleSuggestion(PersistentSession session) {
		return (ArticleSuggestion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ArticleSuggestion[] listArticleSuggestion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ArticleSuggestion[]) list.toArray(new ArticleSuggestion[list.size()]);
	}
}

