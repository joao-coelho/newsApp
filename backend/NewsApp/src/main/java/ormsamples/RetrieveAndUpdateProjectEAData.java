/**
 * Licensee: José Miguel Ribeiro da Silva(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProjectEAData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = newsapp.ProjectEAPersistentManager.instance().getSession().beginTransaction();
		try {
			newsapp.User lnewsappUser = newsapp.UserDAO.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			newsapp.UserDAO.save(lnewsappUser);
			newsapp.Category lnewsappCategory = newsapp.CategoryDAO.loadCategoryByQuery(null, null);
			// Update the properties of the persistent object
			newsapp.CategoryDAO.save(lnewsappCategory);
			newsapp.Comment lnewsappComment = newsapp.CommentDAO.loadCommentByQuery(null, null);
			// Update the properties of the persistent object
			newsapp.CommentDAO.save(lnewsappComment);
			newsapp.Article lnewsappArticle = newsapp.ArticleDAO.loadArticleByQuery(null, null);
			// Update the properties of the persistent object
			newsapp.ArticleDAO.save(lnewsappArticle);
			newsapp.Channel lnewsappChannel = newsapp.ChannelDAO.loadChannelByQuery(null, null);
			// Update the properties of the persistent object
			newsapp.ChannelDAO.save(lnewsappChannel);
			newsapp.Suggestion lnewsappSuggestion = newsapp.SuggestionDAO.loadSuggestionByQuery(null, null);
			// Update the properties of the persistent object
			newsapp.SuggestionDAO.save(lnewsappSuggestion);
			newsapp.ChannelSuggestion lnewsappChannelSuggestion = newsapp.ChannelSuggestionDAO.loadChannelSuggestionByQuery(null, null);
			// Update the properties of the persistent object
			newsapp.ChannelSuggestionDAO.save(lnewsappChannelSuggestion);
			newsapp.ArticleSuggestion lnewsappArticleSuggestion = newsapp.ArticleSuggestionDAO.loadArticleSuggestionByQuery(null, null);
			// Update the properties of the persistent object
			newsapp.ArticleSuggestionDAO.save(lnewsappArticleSuggestion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving User by UserCriteria");
		newsapp.UserCriteria lnewsappUserCriteria = new newsapp.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappUserCriteria.ID.eq();
		System.out.println(lnewsappUserCriteria.uniqueUser());
		
		System.out.println("Retrieving Category by CategoryCriteria");
		newsapp.CategoryCriteria lnewsappCategoryCriteria = new newsapp.CategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappCategoryCriteria.ID.eq();
		System.out.println(lnewsappCategoryCriteria.uniqueCategory());
		
		System.out.println("Retrieving Comment by CommentCriteria");
		newsapp.CommentCriteria lnewsappCommentCriteria = new newsapp.CommentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappCommentCriteria.ID.eq();
		System.out.println(lnewsappCommentCriteria.uniqueComment());
		
		System.out.println("Retrieving Article by ArticleCriteria");
		newsapp.ArticleCriteria lnewsappArticleCriteria = new newsapp.ArticleCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappArticleCriteria.ID.eq();
		System.out.println(lnewsappArticleCriteria.uniqueArticle());
		
		System.out.println("Retrieving Channel by ChannelCriteria");
		newsapp.ChannelCriteria lnewsappChannelCriteria = new newsapp.ChannelCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappChannelCriteria.ID.eq();
		System.out.println(lnewsappChannelCriteria.uniqueChannel());
		
		System.out.println("Retrieving Suggestion by SuggestionCriteria");
		newsapp.SuggestionCriteria lnewsappSuggestionCriteria = new newsapp.SuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappSuggestionCriteria.ID.eq();
		System.out.println(lnewsappSuggestionCriteria.uniqueSuggestion());
		
		System.out.println("Retrieving ChannelSuggestion by ChannelSuggestionCriteria");
		newsapp.ChannelSuggestionCriteria lnewsappChannelSuggestionCriteria = new newsapp.ChannelSuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappChannelSuggestionCriteria.ID.eq();
		System.out.println(lnewsappChannelSuggestionCriteria.uniqueChannelSuggestion());
		
		System.out.println("Retrieving ArticleSuggestion by ArticleSuggestionCriteria");
		newsapp.ArticleSuggestionCriteria lnewsappArticleSuggestionCriteria = new newsapp.ArticleSuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappArticleSuggestionCriteria.ID.eq();
		System.out.println(lnewsappArticleSuggestionCriteria.uniqueArticleSuggestion());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProjectEAData retrieveAndUpdateProjectEAData = new RetrieveAndUpdateProjectEAData();
			try {
				retrieveAndUpdateProjectEAData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProjectEAData.retrieveByCriteria();
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
