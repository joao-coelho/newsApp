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
			User lnewsappUser = UserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _likedArticles, _myChannel, _preferences, _subscriptions
			UserDAO.save(lnewsappUser);
			Category lnewsappCategory = CategoryDAO.createCategory();
			// Initialize the properties of the persistent object here
			CategoryDAO.save(lnewsappCategory);
			Comment lnewsappComment = CommentDAO.createComment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _author, article
			CommentDAO.save(lnewsappComment);
			Article lnewsappArticle = ArticleDAO.createArticle();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _categories, _comments, likes, channel
			ArticleDAO.save(lnewsappArticle);
			Channel lnewsappChannel = ChannelDAO.createChannel();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : categories, _articles, subscribers
			ChannelDAO.save(lnewsappChannel);
			Suggestion lnewsappSuggestion = SuggestionDAO.createSuggestion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _author, _receivers
			SuggestionDAO.save(lnewsappSuggestion);
			ChannelSuggestion lnewsappChannelSuggestion = ChannelSuggestionDAO.createChannelSuggestion();
			// Initialize the properties of the persistent object here
			ChannelSuggestionDAO.save(lnewsappChannelSuggestion);
			ArticleSuggestion lnewsappArticleSuggestion = ArticleSuggestionDAO.createArticleSuggestion();
			// Initialize the properties of the persistent object here
			ArticleSuggestionDAO.save(lnewsappArticleSuggestion);
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
