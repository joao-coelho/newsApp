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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ArticleCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression channelId;
	public final AssociationExpression channel;
	public final StringExpression title;
	public final StringExpression content;
	public final IntegerExpression likes;
	public final DateExpression addedAt;
	public final StringExpression image_url;
	public final CollectionExpression _comments;
	public final CollectionExpression _categories;
	
	public ArticleCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		channelId = new IntegerExpression("channel.ID", this);
		channel = new AssociationExpression("channel", this);
		title = new StringExpression("title", this);
		content = new StringExpression("content", this);
		likes = new IntegerExpression("likes", this);
		addedAt = new DateExpression("addedAt", this);
		image_url = new StringExpression("image_url", this);
		_comments = new CollectionExpression("ORM__comments", this);
		_categories = new CollectionExpression("ORM__categories", this);
	}
	
	public ArticleCriteria(PersistentSession session) {
		this(session.createCriteria(Article.class));
	}
	
	public ArticleCriteria() throws PersistentException {
		this(ProjectEAPersistentManager.instance().getSession());
	}
	
	public ChannelCriteria createChannelCriteria() {
		return new ChannelCriteria(createCriteria("channel"));
	}
	
	public CommentCriteria create_commentsCriteria() {
		return new CommentCriteria(createCriteria("ORM__comments"));
	}
	
	public CategoryCriteria create_categoriesCriteria() {
		return new CategoryCriteria(createCriteria("ORM__categories"));
	}
	
	public Article uniqueArticle() {
		return (Article) super.uniqueResult();
	}
	
	public Article[] listArticle() {
		java.util.List list = super.list();
		return (Article[]) list.toArray(new Article[list.size()]);
	}
}

