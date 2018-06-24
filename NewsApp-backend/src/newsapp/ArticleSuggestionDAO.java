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

public class ArticleSuggestionDAO {
	public static ArticleSuggestion loadArticleSuggestionByORMID(int attribute) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleSuggestionByORMID(session, attribute);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion getArticleSuggestionByORMID(int attribute) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getArticleSuggestionByORMID(session, attribute);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion loadArticleSuggestionByORMID(int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleSuggestionByORMID(session, attribute, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion getArticleSuggestionByORMID(int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getArticleSuggestionByORMID(session, attribute, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion loadArticleSuggestionByORMID(PersistentSession session, int attribute) throws PersistentException {
		try {
			return (ArticleSuggestion) session.load(newsapp.ArticleSuggestion.class, new Integer(attribute));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion getArticleSuggestionByORMID(PersistentSession session, int attribute) throws PersistentException {
		try {
			return (ArticleSuggestion) session.get(newsapp.ArticleSuggestion.class, new Integer(attribute));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion loadArticleSuggestionByORMID(PersistentSession session, int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ArticleSuggestion) session.load(newsapp.ArticleSuggestion.class, new Integer(attribute), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion getArticleSuggestionByORMID(PersistentSession session, int attribute, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ArticleSuggestion) session.get(newsapp.ArticleSuggestion.class, new Integer(attribute), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArticleSuggestion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return queryArticleSuggestion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArticleSuggestion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return queryArticleSuggestion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion[] listArticleSuggestionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listArticleSuggestionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion[] listArticleSuggestionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listArticleSuggestionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArticleSuggestion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ArticleSuggestion as ArticleSuggestion");
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
	
	public static List queryArticleSuggestion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ArticleSuggestion as ArticleSuggestion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ArticleSuggestion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion[] listArticleSuggestionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryArticleSuggestion(session, condition, orderBy);
			return (ArticleSuggestion[]) list.toArray(new ArticleSuggestion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion[] listArticleSuggestionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryArticleSuggestion(session, condition, orderBy, lockMode);
			return (ArticleSuggestion[]) list.toArray(new ArticleSuggestion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion loadArticleSuggestionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleSuggestionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion loadArticleSuggestionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleSuggestionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion loadArticleSuggestionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ArticleSuggestion[] articleSuggestions = listArticleSuggestionByQuery(session, condition, orderBy);
		if (articleSuggestions != null && articleSuggestions.length > 0)
			return articleSuggestions[0];
		else
			return null;
	}
	
	public static ArticleSuggestion loadArticleSuggestionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ArticleSuggestion[] articleSuggestions = listArticleSuggestionByQuery(session, condition, orderBy, lockMode);
		if (articleSuggestions != null && articleSuggestions.length > 0)
			return articleSuggestions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateArticleSuggestionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateArticleSuggestionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArticleSuggestionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateArticleSuggestionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArticleSuggestionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ArticleSuggestion as ArticleSuggestion");
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
	
	public static java.util.Iterator iterateArticleSuggestionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ArticleSuggestion as ArticleSuggestion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ArticleSuggestion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion createArticleSuggestion() {
		return new newsapp.ArticleSuggestion();
	}
	
	public static boolean save(newsapp.ArticleSuggestion articleSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().saveObject(articleSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(newsapp.ArticleSuggestion articleSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().deleteObject(articleSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(newsapp.ArticleSuggestion articleSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().refresh(articleSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(newsapp.ArticleSuggestion articleSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().evict(articleSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion loadArticleSuggestionByCriteria(ArticleSuggestionCriteria articleSuggestionCriteria) {
		ArticleSuggestion[] articleSuggestions = listArticleSuggestionByCriteria(articleSuggestionCriteria);
		if(articleSuggestions == null || articleSuggestions.length == 0) {
			return null;
		}
		return articleSuggestions[0];
	}
	
	public static ArticleSuggestion[] listArticleSuggestionByCriteria(ArticleSuggestionCriteria articleSuggestionCriteria) {
		return articleSuggestionCriteria.listArticleSuggestion();
	}
}
