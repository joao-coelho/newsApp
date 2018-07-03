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

import newsapp.business.model.Suggestion;
import org.orm.*;
import org.hibernate.Query;

import java.util.List;

public class SuggestionDAO {
	public static Suggestion loadSuggestionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadSuggestionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion getSuggestionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getSuggestionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion loadSuggestionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadSuggestionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion getSuggestionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getSuggestionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion loadSuggestionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Suggestion) session.load(Suggestion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion getSuggestionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Suggestion) session.get(Suggestion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion loadSuggestionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Suggestion) session.load(Suggestion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion getSuggestionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Suggestion) session.get(Suggestion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySuggestion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return querySuggestion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySuggestion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return querySuggestion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion[] listSuggestionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listSuggestionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion[] listSuggestionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listSuggestionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySuggestion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Suggestion as Suggestion");
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
	
	public static List querySuggestion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Suggestion as Suggestion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Suggestion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion[] listSuggestionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySuggestion(session, condition, orderBy);
			return (Suggestion[]) list.toArray(new Suggestion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion[] listSuggestionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySuggestion(session, condition, orderBy, lockMode);
			return (Suggestion[]) list.toArray(new Suggestion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion loadSuggestionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadSuggestionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion loadSuggestionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadSuggestionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion loadSuggestionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Suggestion[] suggestions = listSuggestionByQuery(session, condition, orderBy);
		if (suggestions != null && suggestions.length > 0)
			return suggestions[0];
		else
			return null;
	}
	
	public static Suggestion loadSuggestionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Suggestion[] suggestions = listSuggestionByQuery(session, condition, orderBy, lockMode);
		if (suggestions != null && suggestions.length > 0)
			return suggestions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSuggestionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateSuggestionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSuggestionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateSuggestionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSuggestionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Suggestion as Suggestion");
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
	
	public static java.util.Iterator iterateSuggestionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Suggestion as Suggestion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Suggestion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion createSuggestion() {
		return new Suggestion();
	}
	
	public static boolean save(Suggestion suggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().saveObject(suggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Suggestion suggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().deleteObject(suggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Suggestion suggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().refresh(suggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Suggestion suggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().evict(suggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Suggestion loadSuggestionByCriteria(SuggestionCriteria suggestionCriteria) {
		Suggestion[] suggestions = listSuggestionByCriteria(suggestionCriteria);
		if(suggestions == null || suggestions.length == 0) {
			return null;
		}
		return suggestions[0];
	}
	
	public static Suggestion[] listSuggestionByCriteria(SuggestionCriteria suggestionCriteria) {
		return suggestionCriteria.listSuggestion();
	}
}
