/**
 * Licensee: José Miguel Ribeiro da Silva(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import newsapp.data.*;
import org.orm.*;
public class DeleteProjectEAData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ProjectEAPersistentManager.instance().getSession().beginTransaction();
		try {
			User lnewsappUser = UserDAO.loadUserByQuery(null, null);
			// Delete the persistent object
			UserDAO.delete(lnewsappUser);
			Category lnewsappCategory = CategoryDAO.loadCategoryByQuery(null, null);
			// Delete the persistent object
			CategoryDAO.delete(lnewsappCategory);
			Comment lnewsappComment = CommentDAO.loadCommentByQuery(null, null);
			// Delete the persistent object
			CommentDAO.delete(lnewsappComment);
			Article lnewsappArticle = ArticleDAO.loadArticleByQuery(null, null);
			// Delete the persistent object
			ArticleDAO.delete(lnewsappArticle);
			Channel lnewsappChannel = ChannelDAO.loadChannelByQuery(null, null);
			// Delete the persistent object
			ChannelDAO.delete(lnewsappChannel);
			Suggestion lnewsappSuggestion = SuggestionDAO.loadSuggestionByQuery(null, null);
			// Delete the persistent object
			SuggestionDAO.delete(lnewsappSuggestion);
			ChannelSuggestion lnewsappChannelSuggestion = ChannelSuggestionDAO.loadChannelSuggestionByQuery(null, null);
			// Delete the persistent object
			ChannelSuggestionDAO.delete(lnewsappChannelSuggestion);
			ArticleSuggestion lnewsappArticleSuggestion = ArticleSuggestionDAO.loadArticleSuggestionByQuery(null, null);
			// Delete the persistent object
			ArticleSuggestionDAO.delete(lnewsappArticleSuggestion);
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
				ProjectEAPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
