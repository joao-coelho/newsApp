/**
 * Licensee: José Miguel Ribeiro da Silva(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProjectEAData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = newsapp.ProjectEAPersistentManager.instance().getSession().beginTransaction();
		try {
			newsapp.User lnewsappUser = newsapp.UserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : preferences, subscriptions, myChannel
			newsapp.UserDAO.save(lnewsappUser);
			newsapp.Channel lnewsappChannel = newsapp.ChannelDAO.createChannel();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _fields, articles
			newsapp.ChannelDAO.save(lnewsappChannel);
			newsapp.Article lnewsappArticle = newsapp.ArticleDAO.createArticle();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _contentType, categories, comments
			newsapp.ArticleDAO.save(lnewsappArticle);
			newsapp.Comment lnewsappComment = newsapp.CommentDAO.createComment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : author
			newsapp.CommentDAO.save(lnewsappComment);
			newsapp.Category lnewsappCategory = newsapp.CategoryDAO.createCategory();
			// Initialize the properties of the persistent object here
			newsapp.CategoryDAO.save(lnewsappCategory);
			newsapp.Suggestion lnewsappSuggestion = newsapp.SuggestionDAO.createSuggestion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : receivers, author
			newsapp.SuggestionDAO.save(lnewsappSuggestion);
			newsapp.ChannelSuggestion lnewsappChannelSuggestion = newsapp.ChannelSuggestionDAO.createChannelSuggestion();
			// Initialize the properties of the persistent object here
			newsapp.ChannelSuggestionDAO.save(lnewsappChannelSuggestion);
			newsapp.ArticleSuggestion lnewsappArticleSuggestion = newsapp.ArticleSuggestionDAO.createArticleSuggestion();
			// Initialize the properties of the persistent object here
			newsapp.ArticleSuggestionDAO.save(lnewsappArticleSuggestion);
			newsapp.ContentType lnewsappContentType = newsapp.ContentTypeDAO.createContentType();
			// Initialize the properties of the persistent object here
			newsapp.ContentTypeDAO.save(lnewsappContentType);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProjectEAData createProjectEAData = new CreateProjectEAData();
			try {
				createProjectEAData.createTestData();
			}
			finally {
				newsapp.ProjectEAPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
