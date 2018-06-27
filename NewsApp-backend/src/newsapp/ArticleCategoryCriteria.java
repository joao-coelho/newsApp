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

public class ArticleCategoryCriteria extends AbstractORMCriteria {
	public final IntegerExpression attribute;
	public final IntegerExpression ID;
	public final StringExpression description;
	
	public ArticleCategoryCriteria(Criteria criteria) {
		super(criteria);
		attribute = new IntegerExpression("attribute", this);
		ID = new IntegerExpression("ID", this);
		description = new StringExpression("description", this);
	}
	
	public ArticleCategoryCriteria(PersistentSession session) {
		this(session.createCriteria(ArticleCategory.class));
	}
	
	public ArticleCategoryCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ArticleCategory uniqueArticleCategory() {
		return (ArticleCategory) super.uniqueResult();
	}
	
	public ArticleCategory[] listArticleCategory() {
		java.util.List list = super.list();
		return (ArticleCategory[]) list.toArray(new ArticleCategory[list.size()]);
	}
}

