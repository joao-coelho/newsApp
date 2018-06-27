/**
 * Licensee: José Miguel Ribeiro da Silva(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import newsapp.data.*;
import org.orm.*;
public class CreateProjectEAData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ProjectEAPersistentManager.instance().getSession().beginTransaction();
		try {
			newsapp.Channel lnewsappChannel = ChannelDAO.createChannel();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _fields, articles
			ChannelDAO.save(lnewsappChannel);
			newsapp.Article lnewsappArticle = ArticleDAO.createArticle();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _articleCategories, comments
			ArticleDAO.save(lnewsappArticle);
			newsapp.Comment lnewsappComment = CommentDAO.createComment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : author
			CommentDAO.save(lnewsappComment);
			newsapp.Suggestion lnewsappSuggestion = SuggestionDAO.createSuggestion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : receivers, author
			SuggestionDAO.save(lnewsappSuggestion);
			newsapp.ChannelSuggestion lnewsappChannelSuggestion = ChannelSuggestionDAO.createChannelSuggestion();
			// Initialize the properties of the persistent object here
			ChannelSuggestionDAO.save(lnewsappChannelSuggestion);
			newsapp.ArticleSuggestion lnewsappArticleSuggestion = ArticleSuggestionDAO.createArticleSuggestion();
			// Initialize the properties of the persistent object here
			ArticleSuggestionDAO.save(lnewsappArticleSuggestion);
			newsapp.User lnewsappUser = UserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _preferences, subscriptions, idade, myChannel
			UserDAO.save(lnewsappUser);
			newsapp.ChannelCategory lnewsappChannelCategory = ChannelCategoryDAO.createChannelCategory();
			// Initialize the properties of the persistent object here
			ChannelCategoryDAO.save(lnewsappChannelCategory);
			newsapp.Category lnewsappCategory = CategoryDAO.createCategory();
			// Initialize the properties of the persistent object here
			CategoryDAO.save(lnewsappCategory);
			newsapp.ArticleCategory lnewsappArticleCategory = ArticleCategoryDAO.createArticleCategory();
			// Initialize the properties of the persistent object here
			ArticleCategoryDAO.save(lnewsappArticleCategory);
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
				ProjectEAPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
