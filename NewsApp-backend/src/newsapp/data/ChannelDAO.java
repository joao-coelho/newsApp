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

import newsapp.Channel;
import org.orm.*;
import org.hibernate.Query;

import java.util.List;

public class ChannelDAO {
	public static Channel loadChannelByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel getChannelByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getChannelByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel loadChannelByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel getChannelByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return getChannelByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel loadChannelByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Channel) session.load(newsapp.Channel.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel getChannelByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Channel) session.get(newsapp.Channel.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel loadChannelByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Channel) session.load(newsapp.Channel.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel getChannelByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Channel) session.get(newsapp.Channel.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChannel(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return queryChannel(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChannel(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return queryChannel(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel[] listChannelByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listChannelByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel[] listChannelByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return listChannelByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryChannel(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.Channel as Channel");
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
	
	public static List queryChannel(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.Channel as Channel");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Channel", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel[] listChannelByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryChannel(session, condition, orderBy);
			return (Channel[]) list.toArray(new Channel[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel[] listChannelByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryChannel(session, condition, orderBy, lockMode);
			return (Channel[]) list.toArray(new Channel[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel loadChannelByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel loadChannelByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return loadChannelByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel loadChannelByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Channel[] channels = listChannelByQuery(session, condition, orderBy);
		if (channels != null && channels.length > 0)
			return channels[0];
		else
			return null;
	}
	
	public static Channel loadChannelByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Channel[] channels = listChannelByQuery(session, condition, orderBy, lockMode);
		if (channels != null && channels.length > 0)
			return channels[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateChannelByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateChannelByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateChannelByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectEAPersistentManager.instance().getSession();
			return iterateChannelByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateChannelByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.Channel as Channel");
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
	
	public static java.util.Iterator iterateChannelByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From newsapp.Channel as Channel");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Channel", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel createChannel() {
		return new newsapp.Channel();
	}
	
	public static boolean save(newsapp.Channel channel) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().saveObject(channel);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(newsapp.Channel channel) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().deleteObject(channel);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(newsapp.Channel channel) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().refresh(channel);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(newsapp.Channel channel) throws PersistentException {
		try {
			ProjectEAPersistentManager.instance().getSession().evict(channel);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Channel loadChannelByCriteria(ChannelCriteria channelCriteria) {
		Channel[] channels = listChannelByCriteria(channelCriteria);
		if(channels == null || channels.length == 0) {
			return null;
		}
		return channels[0];
	}
	
	public static Channel[] listChannelByCriteria(ChannelCriteria channelCriteria) {
		return channelCriteria.listChannel();
	}
}
