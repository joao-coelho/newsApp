/**
 * Licensee: José Miguel Ribeiro da Silva(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import newsapp.business.model.*;
import newsapp.data.*;
import org.orm.*;
public class ListProjectEAData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing User...");
		User[] newsappUsers = UserDAO.listUserByQuery(null, null);
		int length = Math.min(newsappUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Category...");
		Category[] newsappCategorys = CategoryDAO.listCategoryByQuery(null, null);
		length = Math.min(newsappCategorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappCategorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comment...");
		Comment[] newsappComments = CommentDAO.listCommentByQuery(null, null);
		length = Math.min(newsappComments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappComments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Article...");
		Article[] newsappArticles = ArticleDAO.listArticleByQuery(null, null);
		length = Math.min(newsappArticles.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappArticles[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Channel...");
		Channel[] newsappChannels = ChannelDAO.listChannelByQuery(null, null);
		length = Math.min(newsappChannels.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappChannels[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Suggestion...");
		Suggestion[] newsappSuggestions = SuggestionDAO.listSuggestionByQuery(null, null);
		length = Math.min(newsappSuggestions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappSuggestions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ChannelSuggestion...");
		ChannelSuggestion[] newsappChannelSuggestions = ChannelSuggestionDAO.listChannelSuggestionByQuery(null, null);
		length = Math.min(newsappChannelSuggestions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappChannelSuggestions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ArticleSuggestion...");
		ArticleSuggestion[] newsappArticleSuggestions = ArticleSuggestionDAO.listArticleSuggestionByQuery(null, null);
		length = Math.min(newsappArticleSuggestions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappArticleSuggestions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing User by Criteria...");
		UserCriteria lnewsappUserCriteria = new UserCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappUserCriteria.ID.eq();
		lnewsappUserCriteria.setMaxResults(ROW_COUNT);
		User[] newsappUsers = lnewsappUserCriteria.listUser();
		int length =newsappUsers== null ? 0 : Math.min(newsappUsers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappUsers[i]);
		}
		System.out.println(length + " User record(s) retrieved."); 
		
		System.out.println("Listing Category by Criteria...");
		CategoryCriteria lnewsappCategoryCriteria = new CategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappCategoryCriteria.ID.eq();
		lnewsappCategoryCriteria.setMaxResults(ROW_COUNT);
		Category[] newsappCategorys = lnewsappCategoryCriteria.listCategory();
		length =newsappCategorys== null ? 0 : Math.min(newsappCategorys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappCategorys[i]);
		}
		System.out.println(length + " Category record(s) retrieved."); 
		
		System.out.println("Listing Comment by Criteria...");
		CommentCriteria lnewsappCommentCriteria = new CommentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappCommentCriteria.ID.eq();
		lnewsappCommentCriteria.setMaxResults(ROW_COUNT);
		Comment[] newsappComments = lnewsappCommentCriteria.listComment();
		length =newsappComments== null ? 0 : Math.min(newsappComments.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappComments[i]);
		}
		System.out.println(length + " Comment record(s) retrieved."); 
		
		System.out.println("Listing Article by Criteria...");
		ArticleCriteria lnewsappArticleCriteria = new ArticleCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappArticleCriteria.ID.eq();
		lnewsappArticleCriteria.setMaxResults(ROW_COUNT);
		Article[] newsappArticles = lnewsappArticleCriteria.listArticle();
		length =newsappArticles== null ? 0 : Math.min(newsappArticles.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappArticles[i]);
		}
		System.out.println(length + " Article record(s) retrieved."); 
		
		System.out.println("Listing Channel by Criteria...");
		ChannelCriteria lnewsappChannelCriteria = new ChannelCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappChannelCriteria.ID.eq();
		lnewsappChannelCriteria.setMaxResults(ROW_COUNT);
		Channel[] newsappChannels = lnewsappChannelCriteria.listChannel();
		length =newsappChannels== null ? 0 : Math.min(newsappChannels.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappChannels[i]);
		}
		System.out.println(length + " Channel record(s) retrieved."); 
		
		System.out.println("Listing Suggestion by Criteria...");
		SuggestionCriteria lnewsappSuggestionCriteria = new SuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappSuggestionCriteria.ID.eq();
		lnewsappSuggestionCriteria.setMaxResults(ROW_COUNT);
		Suggestion[] newsappSuggestions = lnewsappSuggestionCriteria.listSuggestion();
		length =newsappSuggestions== null ? 0 : Math.min(newsappSuggestions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappSuggestions[i]);
		}
		System.out.println(length + " Suggestion record(s) retrieved."); 
		
		System.out.println("Listing ChannelSuggestion by Criteria...");
		ChannelSuggestionCriteria lnewsappChannelSuggestionCriteria = new ChannelSuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappChannelSuggestionCriteria.ID.eq();
		lnewsappChannelSuggestionCriteria.setMaxResults(ROW_COUNT);
		ChannelSuggestion[] newsappChannelSuggestions = lnewsappChannelSuggestionCriteria.listChannelSuggestion();
		length =newsappChannelSuggestions== null ? 0 : Math.min(newsappChannelSuggestions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappChannelSuggestions[i]);
		}
		System.out.println(length + " ChannelSuggestion record(s) retrieved."); 
		
		System.out.println("Listing ArticleSuggestion by Criteria...");
		ArticleSuggestionCriteria lnewsappArticleSuggestionCriteria = new ArticleSuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappArticleSuggestionCriteria.ID.eq();
		lnewsappArticleSuggestionCriteria.setMaxResults(ROW_COUNT);
		ArticleSuggestion[] newsappArticleSuggestions = lnewsappArticleSuggestionCriteria.listArticleSuggestion();
		length =newsappArticleSuggestions== null ? 0 : Math.min(newsappArticleSuggestions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappArticleSuggestions[i]);
		}
		System.out.println(length + " ArticleSuggestion record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProjectEAData listProjectEAData = new ListProjectEAData();
			try {
				listProjectEAData.listTestData();
				//listProjectEAData.listByCriteria();
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
