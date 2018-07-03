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

public class ChannelSuggestionDAO {
	public static ChannelSuggestion loadChannelSuggestionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelSuggestionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion getChannelSuggestionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getChannelSuggestionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion loadChannelSuggestionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelSuggestionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion getChannelSuggestionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getChannelSuggestionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion loadChannelSuggestionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ChannelSuggestion) session.load(ChannelSuggestion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion getChannelSuggestionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ChannelSuggestion) session.get(ChannelSuggestion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion loadChannelSuggestionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ChannelSuggestion) session.load(ChannelSuggestion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion getChannelSuggestionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ChannelSuggestion) session.get(ChannelSuggestion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChannelSuggestion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return queryChannelSuggestion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChannelSuggestion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return queryChannelSuggestion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion[] listChannelSuggestionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listChannelSuggestionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion[] listChannelSuggestionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listChannelSuggestionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChannelSuggestion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ChannelSuggestion as ChannelSuggestion");
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
	
	public static List queryChannelSuggestion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ChannelSuggestion as ChannelSuggestion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ChannelSuggestion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion[] listChannelSuggestionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryChannelSuggestion(session, condition, orderBy);
			return (ChannelSuggestion[]) list.toArray(new ChannelSuggestion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion[] listChannelSuggestionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryChannelSuggestion(session, condition, orderBy, lockMode);
			return (ChannelSuggestion[]) list.toArray(new ChannelSuggestion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion loadChannelSuggestionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelSuggestionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion loadChannelSuggestionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelSuggestionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion loadChannelSuggestionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ChannelSuggestion[] channelSuggestions = listChannelSuggestionByQuery(session, condition, orderBy);
		if (channelSuggestions != null && channelSuggestions.length > 0)
			return channelSuggestions[0];
		else
			return null;
	}
	
	public static ChannelSuggestion loadChannelSuggestionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ChannelSuggestion[] channelSuggestions = listChannelSuggestionByQuery(session, condition, orderBy, lockMode);
		if (channelSuggestions != null && channelSuggestions.length > 0)
			return channelSuggestions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateChannelSuggestionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateChannelSuggestionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateChannelSuggestionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateChannelSuggestionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateChannelSuggestionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ChannelSuggestion as ChannelSuggestion");
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
	
	public static java.util.Iterator iterateChannelSuggestionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ChannelSuggestion as ChannelSuggestion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ChannelSuggestion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion createChannelSuggestion() {
		return new ChannelSuggestion();
	}
	
	public static boolean save(ChannelSuggestion channelSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().saveObject(channelSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ChannelSuggestion channelSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().deleteObject(channelSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(ChannelSuggestion channelSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().refresh(channelSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ChannelSuggestion channelSuggestion) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().evict(channelSuggestion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelSuggestion loadChannelSuggestionByCriteria(ChannelSuggestionCriteria channelSuggestionCriteria) {
		ChannelSuggestion[] channelSuggestions = listChannelSuggestionByCriteria(channelSuggestionCriteria);
		if(channelSuggestions == null || channelSuggestions.length == 0) {
			return null;
		}
		return channelSuggestions[0];
	}
	
	public static ChannelSuggestion[] listChannelSuggestionByCriteria(ChannelSuggestionCriteria channelSuggestionCriteria) {
		return channelSuggestionCriteria.listChannelSuggestion();
	}
}
