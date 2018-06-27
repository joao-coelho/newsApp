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
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _myChannel, _preferences, _subscriptions
			newsapp.UserDAO.save(lnewsappUser);
			newsapp.Category lnewsappCategory = newsapp.CategoryDAO.createCategory();
			// Initialize the properties of the persistent object here
			newsapp.CategoryDAO.save(lnewsappCategory);
			newsapp.Comment lnewsappComment = newsapp.CommentDAO.createComment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _author
			newsapp.CommentDAO.save(lnewsappComment);
			newsapp.Article lnewsappArticle = newsapp.ArticleDAO.createArticle();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _categories, _comments, likes
			newsapp.ArticleDAO.save(lnewsappArticle);
			newsapp.Channel lnewsappChannel = newsapp.ChannelDAO.createChannel();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _categories, _articles, subscribers, likes
			newsapp.ChannelDAO.save(lnewsappChannel);
			newsapp.Suggestion lnewsappSuggestion = newsapp.SuggestionDAO.createSuggestion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _author, _receivers
			newsapp.SuggestionDAO.save(lnewsappSuggestion);
			newsapp.ArticleSuggestion lnewsappArticleSuggestion = newsapp.ArticleSuggestionDAO.createArticleSuggestion();
			// Initialize the properties of the persistent object here
			newsapp.ArticleSuggestionDAO.save(lnewsappArticleSuggestion);
			newsapp.ChannelSuggestion lnewsappChannelSuggestion = newsapp.ChannelSuggestionDAO.createChannelSuggestion();
			// Initialize the properties of the persistent object here
			newsapp.ChannelSuggestionDAO.save(lnewsappChannelSuggestion);
			newsapp.ChannelCategory lnewsappChannelCategory = newsapp.ChannelCategoryDAO.createChannelCategory();
			// Initialize the properties of the persistent object here
			newsapp.ChannelCategoryDAO.save(lnewsappChannelCategory);
			newsapp.ArticleCategory lnewsappArticleCategory = newsapp.ArticleCategoryDAO.createArticleCategory();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ID
			newsapp.ArticleCategoryDAO.save(lnewsappArticleCategory);
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
