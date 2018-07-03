/**
 * Licensee: José Miguel Ribeiro da Silva(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import newsapp.business.model.*;
import newsapp.data.*;
import org.orm.*;
public class RetrieveAndUpdateProjectEAData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ProjectEAPersistentManager.instance().getSession().beginTransaction();
		try {
			User lnewsappUser = UserDAO.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			UserDAO.save(lnewsappUser);
			Category lnewsappCategory = CategoryDAO.loadCategoryByQuery(null, null);
			// Update the properties of the persistent object
			CategoryDAO.save(lnewsappCategory);
			Comment lnewsappComment = CommentDAO.loadCommentByQuery(null, null);
			// Update the properties of the persistent object
			CommentDAO.save(lnewsappComment);
			Article lnewsappArticle = ArticleDAO.loadArticleByQuery(null, null);
			// Update the properties of the persistent object
			ArticleDAO.save(lnewsappArticle);
			Channel lnewsappChannel = ChannelDAO.loadChannelByQuery(null, null);
			// Update the properties of the persistent object
			ChannelDAO.save(lnewsappChannel);
			Suggestion lnewsappSuggestion = SuggestionDAO.loadSuggestionByQuery(null, null);
			// Update the properties of the persistent object
			SuggestionDAO.save(lnewsappSuggestion);
			ChannelSuggestion lnewsappChannelSuggestion = ChannelSuggestionDAO.loadChannelSuggestionByQuery(null, null);
			// Update the properties of the persistent object
			ChannelSuggestionDAO.save(lnewsappChannelSuggestion);
			ArticleSuggestion lnewsappArticleSuggestion = ArticleSuggestionDAO.loadArticleSuggestionByQuery(null, null);
			// Update the properties of the persistent object
			ArticleSuggestionDAO.save(lnewsappArticleSuggestion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving User by UserCriteria");
		UserCriteria lnewsappUserCriteria = new UserCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappUserCriteria.ID.eq();
		System.out.println(lnewsappUserCriteria.uniqueUser());
		
		System.out.println("Retrieving Category by CategoryCriteria");
		CategoryCriteria lnewsappCategoryCriteria = new CategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappCategoryCriteria.ID.eq();
		System.out.println(lnewsappCategoryCriteria.uniqueCategory());
		
		System.out.println("Retrieving Comment by CommentCriteria");
		CommentCriteria lnewsappCommentCriteria = new CommentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappCommentCriteria.ID.eq();
		System.out.println(lnewsappCommentCriteria.uniqueComment());
		
		System.out.println("Retrieving Article by ArticleCriteria");
		ArticleCriteria lnewsappArticleCriteria = new ArticleCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappArticleCriteria.ID.eq();
		System.out.println(lnewsappArticleCriteria.uniqueArticle());
		
		System.out.println("Retrieving Channel by ChannelCriteria");
		ChannelCriteria lnewsappChannelCriteria = new ChannelCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappChannelCriteria.ID.eq();
		System.out.println(lnewsappChannelCriteria.uniqueChannel());
		
		System.out.println("Retrieving Suggestion by SuggestionCriteria");
		SuggestionCriteria lnewsappSuggestionCriteria = new SuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappSuggestionCriteria.ID.eq();
		System.out.println(lnewsappSuggestionCriteria.uniqueSuggestion());
		
		System.out.println("Retrieving ChannelSuggestion by ChannelSuggestionCriteria");
		ChannelSuggestionCriteria lnewsappChannelSuggestionCriteria = new ChannelSuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lnewsappChannelSuggestionCriteria.ID.eq();
		System.out.println(lnewsappChannelSuggestionCriteria.uniqueChannelSuggestion());
		
		System.out.println("Retrieving ArticleSuggestion by ArticleSuggestionCriteria");
		ArticleSuggestionCriteria lnewsappArticleSuggestionCriteria = new ArticleSuggestionCriteria();
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
				ProjectEAPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
