/**
 * Licensee: José Miguel Ribeiro da Silva(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProjectEAData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = newsapp.ProjectEAPersistentManager.instance().getSession().beginTransaction();
		try {
			newsapp.User lnewsappUser = newsapp.UserDAO.loadUserByQuery(null, null);
			// Delete the persistent object
			newsapp.UserDAO.delete(lnewsappUser);
			newsapp.Category lnewsappCategory = newsapp.CategoryDAO.loadCategoryByQuery(null, null);
			// Delete the persistent object
			newsapp.CategoryDAO.delete(lnewsappCategory);
			newsapp.Comment lnewsappComment = newsapp.CommentDAO.loadCommentByQuery(null, null);
			// Delete the persistent object
			newsapp.CommentDAO.delete(lnewsappComment);
			newsapp.Article lnewsappArticle = newsapp.ArticleDAO.loadArticleByQuery(null, null);
			// Delete the persistent object
			newsapp.ArticleDAO.delete(lnewsappArticle);
			newsapp.Channel lnewsappChannel = newsapp.ChannelDAO.loadChannelByQuery(null, null);
			// Delete the persistent object
			newsapp.ChannelDAO.delete(lnewsappChannel);
			newsapp.Suggestion lnewsappSuggestion = newsapp.SuggestionDAO.loadSuggestionByQuery(null, null);
			// Delete the persistent object
			newsapp.SuggestionDAO.delete(lnewsappSuggestion);
			newsapp.ChannelSuggestion lnewsappChannelSuggestion = newsapp.ChannelSuggestionDAO.loadChannelSuggestionByQuery(null, null);
			// Delete the persistent object
			newsapp.ChannelSuggestionDAO.delete(lnewsappChannelSuggestion);
			newsapp.ArticleSuggestion lnewsappArticleSuggestion = newsapp.ArticleSuggestionDAO.loadArticleSuggestionByQuery(null, null);
			// Delete the persistent object
			newsapp.ArticleSuggestionDAO.delete(lnewsappArticleSuggestion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProjectEAData deleteProjectEAData = new DeleteProjectEAData();
			try {
				deleteProjectEAData.deleteTestData();
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
