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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ArticleDAO {
	public static Article loadArticleByORMID(int attribute) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleByORMID(session, attribute);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article getArticleByORMID(int attribute) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getArticleByORMID(session, attribute);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article loadArticleByORMID(int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleByORMID(session, attribute, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article getArticleByORMID(int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getArticleByORMID(session, attribute, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article loadArticleByORMID(PersistentSession session, int attribute) throws PersistentException {
		try {
			return (Article) session.load(newsapp.Article.class, new Integer(attribute));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article getArticleByORMID(PersistentSession session, int attribute) throws PersistentException {
		try {
			return (Article) session.get(newsapp.Article.class, new Integer(attribute));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article loadArticleByORMID(PersistentSession session, int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Article) session.load(newsapp.Article.class, new Integer(attribute), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Article getArticleByORMID(PersistentSession session, int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Article) session.get(newsapp.Article.class, new Integer(attribute), lockMode);
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
		StringBuffer sb = new StringBuffer("From newsapp.Article as Article");
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
		StringBuffer sb = new StringBuffer("From newsapp.Article as Article");
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
		StringBuffer sb = new StringBuffer("From newsapp.Article as Article");
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
		StringBuffer sb = new StringBuffer("From newsapp.Article as Article");
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
		return new newsapp.Article();
	}
	
	public static boolean save(newsapp.Article article) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().saveObject(article);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(newsapp.Article article) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().deleteObject(article);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(newsapp.Article article) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().refresh(article);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(newsapp.Article article) throws PersistentException {
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
