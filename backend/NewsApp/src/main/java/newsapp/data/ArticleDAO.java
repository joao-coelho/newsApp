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

import newsapp.business.model.Article;
import newsapp.business.model.Comment;
import org.orm.*;
import org.hibernate.Query;

import java.util.List;

public class ArticleDAO {
	public static Article loadArticleByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article getArticleByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getArticleByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article loadArticleByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article getArticleByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getArticleByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article loadArticleByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Article) session.load(Article.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article getArticleByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Article) session.get(Article.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article loadArticleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Article) session.load(Article.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article getArticleByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Article) session.get(Article.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArticle(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return queryArticle(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArticle(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return queryArticle(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article[] listArticleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listArticleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article[] listArticleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listArticleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArticle(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Article as Article");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArticle(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Article as Article");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Article", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article[] listArticleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryArticle(session, condition, orderBy);
			return (Article[]) list.toArray(new Article[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article[] listArticleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryArticle(session, condition, orderBy, lockMode);
			return (Article[]) list.toArray(new Article[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article loadArticleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article loadArticleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article loadArticleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Article[] articles = listArticleByQuery(session, condition, orderBy);
		if (articles != null && articles.length > 0)
			return articles[0];
		else
			return null;
	}
	
	public static Article loadArticleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Article[] articles = listArticleByQuery(session, condition, orderBy, lockMode);
		if (articles != null && articles.length > 0)
			return articles[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateArticleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateArticleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArticleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateArticleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArticleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Article as Article");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArticleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Article as Article");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Article", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article createArticle() {
		return new Article();
	}
	
	public static boolean save(Article article) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().saveObject(article);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Article article) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().deleteObject(article);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Article article)throws PersistentException {
		try {
			if (article.getChannel() != null) {
				article.getChannel()._articles.remove(article);
			}
			
			Comment[] l_commentss = article._comments.toArray();
			for(int i = 0; i < l_commentss.length; i++) {
				l_commentss[i].setArticle(null);
			}
			return delete(article);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Article article, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (article.getChannel() != null) {
				article.getChannel()._articles.remove(article);
			}
			
			Comment[] l_commentss = article._comments.toArray();
			for(int i = 0; i < l_commentss.length; i++) {
				l_commentss[i].setArticle(null);
			}
			try {
				session.delete(article);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Article article) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().refresh(article);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Article article) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().evict(article);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article loadArticleByCriteria(ArticleCriteria articleCriteria) {
		Article[] articles = listArticleByCriteria(articleCriteria);
		if(articles == null || articles.length == 0) {
			return null;
		}
		return articles[0];
	}
	
	public static Article[] listArticleByCriteria(ArticleCriteria articleCriteria) {
		return articleCriteria.listArticle();
	}
}
