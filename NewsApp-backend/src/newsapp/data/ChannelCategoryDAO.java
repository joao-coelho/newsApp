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

import newsapp.ChannelCategory;
import org.orm.*;
import org.hibernate.Query;

import java.util.List;

public class ChannelCategoryDAO {
	public static ChannelCategory loadChannelCategoryByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelCategoryByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory getChannelCategoryByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getChannelCategoryByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory loadChannelCategoryByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelCategoryByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory getChannelCategoryByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getChannelCategoryByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory loadChannelCategoryByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ChannelCategory) session.load(newsapp.ChannelCategory.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory getChannelCategoryByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ChannelCategory) session.get(newsapp.ChannelCategory.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory loadChannelCategoryByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ChannelCategory) session.load(newsapp.ChannelCategory.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory getChannelCategoryByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ChannelCategory) session.get(newsapp.ChannelCategory.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChannelCategory(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return queryChannelCategory(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChannelCategory(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return queryChannelCategory(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory[] listChannelCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listChannelCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory[] listChannelCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listChannelCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChannelCategory(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ChannelCategory as ChannelCategory");
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
	
	public static List queryChannelCategory(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ChannelCategory as ChannelCategory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ChannelCategory", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory[] listChannelCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryChannelCategory(session, condition, orderBy);
			return (ChannelCategory[]) list.toArray(new ChannelCategory[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory[] listChannelCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryChannelCategory(session, condition, orderBy, lockMode);
			return (ChannelCategory[]) list.toArray(new ChannelCategory[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory loadChannelCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory loadChannelCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory loadChannelCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ChannelCategory[] channelCategorys = listChannelCategoryByQuery(session, condition, orderBy);
		if (channelCategorys != null && channelCategorys.length > 0)
			return channelCategorys[0];
		else
			return null;
	}
	
	public static ChannelCategory loadChannelCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ChannelCategory[] channelCategorys = listChannelCategoryByQuery(session, condition, orderBy, lockMode);
		if (channelCategorys != null && channelCategorys.length > 0)
			return channelCategorys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateChannelCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateChannelCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateChannelCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateChannelCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateChannelCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ChannelCategory as ChannelCategory");
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
	
	public static java.util.Iterator iterateChannelCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.ChannelCategory as ChannelCategory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ChannelCategory", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory createChannelCategory() {
		return new newsapp.ChannelCategory();
	}
	
	public static boolean save(newsapp.ChannelCategory channelCategory) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().saveObject(channelCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(newsapp.ChannelCategory channelCategory) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().deleteObject(channelCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(newsapp.ChannelCategory channelCategory) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().refresh(channelCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(newsapp.ChannelCategory channelCategory) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().evict(channelCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ChannelCategory loadChannelCategoryByCriteria(ChannelCategoryCriteria channelCategoryCriteria) {
		ChannelCategory[] channelCategorys = listChannelCategoryByCriteria(channelCategoryCriteria);
		if(channelCategorys == null || channelCategorys.length == 0) {
			return null;
		}
		return channelCategorys[0];
	}
	
	public static ChannelCategory[] listChannelCategoryByCriteria(ChannelCategoryCriteria channelCategoryCriteria) {
		return channelCategoryCriteria.listChannelCategory();
	}
}
