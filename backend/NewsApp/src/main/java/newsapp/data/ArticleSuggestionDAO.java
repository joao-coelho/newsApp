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

import org.orm.*;
import org.hibernate.Query;

import java.util.List;

public class ArticleSuggestionDAO {
	public static ArticleSuggestion loadArticleSuggestionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleSuggestionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion getArticleSuggestionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getArticleSuggestionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion loadArticleSuggestionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadArticleSuggestionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion getArticleSuggestionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getArticleSuggestionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion loadArticleSuggestionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ArticleSuggestion) session.load(ArticleSuggestion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion getArticleSuggestionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ArticleSuggestion) session.get(ArticleSuggestion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion loadArticleSuggestionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ArticleSuggestion) session.load(ArticleSuggestion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ArticleSuggestion getArticleSuggestionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ArticleSuggestion) session.get(ArticleSuggestion.class, new Integer(ID), lockMode);
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
		StringBuffer sb = new StringBuffer("From ArticleSuggestion as ArticleSuggestion");
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
		StringBuffer sb = new StringBuffer("From ArticleSuggestion as ArticleSuggestion");
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
		StringBuffer sb = new StringBuffer("From ArticleSuggestion as ArticleSuggestion");
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
		StringBuffer sb = new StringBuffer("From ArticleSuggestion as ArticleSuggestion");
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
		return new ArticleSuggestion();
	}
	
	public static boolean save(ArticleSuggestion articleSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().saveObject(articleSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ArticleSuggestion articleSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().deleteObject(articleSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(ArticleSuggestion articleSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().refresh(articleSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ArticleSuggestion articleSuggestion) throws PersistentException {
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
