/**
 * Licensee: José Miguel Ribeiro da Silva(Universidade do Minho)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProjectEAData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing User...");
		newsapp.User[] newsappUsers = newsapp.UserDAO.listUserByQuery(null, null);
		int length = Math.min(newsappUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Category...");
		newsapp.Category[] newsappCategorys = newsapp.CategoryDAO.listCategoryByQuery(null, null);
		length = Math.min(newsappCategorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappCategorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comment...");
		newsapp.Comment[] newsappComments = newsapp.CommentDAO.listCommentByQuery(null, null);
		length = Math.min(newsappComments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappComments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Article...");
		newsapp.Article[] newsappArticles = newsapp.ArticleDAO.listArticleByQuery(null, null);
		length = Math.min(newsappArticles.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappArticles[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Channel...");
		newsapp.Channel[] newsappChannels = newsapp.ChannelDAO.listChannelByQuery(null, null);
		length = Math.min(newsappChannels.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappChannels[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Suggestion...");
		newsapp.Suggestion[] newsappSuggestions = newsapp.SuggestionDAO.listSuggestionByQuery(null, null);
		length = Math.min(newsappSuggestions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappSuggestions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ArticleSuggestion...");
		newsapp.ArticleSuggestion[] newsappArticleSuggestions = newsapp.ArticleSuggestionDAO.listArticleSuggestionByQuery(null, null);
		length = Math.min(newsappArticleSuggestions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappArticleSuggestions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ChannelSuggestion...");
		newsapp.ChannelSuggestion[] newsappChannelSuggestions = newsapp.ChannelSuggestionDAO.listChannelSuggestionByQuery(null, null);
		length = Math.min(newsappChannelSuggestions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappChannelSuggestions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ChannelCategory...");
		newsapp.ChannelCategory[] newsappChannelCategorys = newsapp.ChannelCategoryDAO.listChannelCategoryByQuery(null, null);
		length = Math.min(newsappChannelCategorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappChannelCategorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing ArticleCategory...");
		newsapp.ArticleCategory[] newsappArticleCategorys = newsapp.ArticleCategoryDAO.listArticleCategoryByQuery(null, null);
		length = Math.min(newsappArticleCategorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(newsappArticleCategorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing User by Criteria...");
		newsapp.UserCriteria lnewsappUserCriteria = new newsapp.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappUserCriteria.ID.eq();
		lnewsappUserCriteria.setMaxResults(ROW_COUNT);
		newsapp.User[] newsappUsers = lnewsappUserCriteria.listUser();
		int length =newsappUsers== null ? 0 : Math.min(newsappUsers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappUsers[i]);
		}
		System.out.println(length + " User record(s) retrieved."); 
		
		System.out.println("Listing Category by Criteria...");
		newsapp.CategoryCriteria lnewsappCategoryCriteria = new newsapp.CategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappCategoryCriteria.ID.eq();
		lnewsappCategoryCriteria.setMaxResults(ROW_COUNT);
		newsapp.Category[] newsappCategorys = lnewsappCategoryCriteria.listCategory();
		length =newsappCategorys== null ? 0 : Math.min(newsappCategorys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappCategorys[i]);
		}
		System.out.println(length + " Category record(s) retrieved."); 
		
		System.out.println("Listing Comment by Criteria...");
		newsapp.CommentCriteria lnewsappCommentCriteria = new newsapp.CommentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappCommentCriteria.ID.eq();
		lnewsappCommentCriteria.setMaxResults(ROW_COUNT);
		newsapp.Comment[] newsappComments = lnewsappCommentCriteria.listComment();
		length =newsappComments== null ? 0 : Math.min(newsappComments.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappComments[i]);
		}
		System.out.println(length + " Comment record(s) retrieved."); 
		
		System.out.println("Listing Article by Criteria...");
		newsapp.ArticleCriteria lnewsappArticleCriteria = new newsapp.ArticleCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappArticleCriteria.ID.eq();
		lnewsappArticleCriteria.setMaxResults(ROW_COUNT);
		newsapp.Article[] newsappArticles = lnewsappArticleCriteria.listArticle();
		length =newsappArticles== null ? 0 : Math.min(newsappArticles.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappArticles[i]);
		}
		System.out.println(length + " Article record(s) retrieved."); 
		
		System.out.println("Listing Channel by Criteria...");
		newsapp.ChannelCriteria lnewsappChannelCriteria = new newsapp.ChannelCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappChannelCriteria.ID.eq();
		lnewsappChannelCriteria.setMaxResults(ROW_COUNT);
		newsapp.Channel[] newsappChannels = lnewsappChannelCriteria.listChannel();
		length =newsappChannels== null ? 0 : Math.min(newsappChannels.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappChannels[i]);
		}
		System.out.println(length + " Channel record(s) retrieved."); 
		
		System.out.println("Listing Suggestion by Criteria...");
		newsapp.SuggestionCriteria lnewsappSuggestionCriteria = new newsapp.SuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappSuggestionCriteria.ID.eq();
		lnewsappSuggestionCriteria.setMaxResults(ROW_COUNT);
		newsapp.Suggestion[] newsappSuggestions = lnewsappSuggestionCriteria.listSuggestion();
		length =newsappSuggestions== null ? 0 : Math.min(newsappSuggestions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappSuggestions[i]);
		}
		System.out.println(length + " Suggestion record(s) retrieved."); 
		
		System.out.println("Listing ArticleSuggestion by Criteria...");
		newsapp.ArticleSuggestionCriteria lnewsappArticleSuggestionCriteria = new newsapp.ArticleSuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappArticleSuggestionCriteria.ID.eq();
		lnewsappArticleSuggestionCriteria.setMaxResults(ROW_COUNT);
		newsapp.ArticleSuggestion[] newsappArticleSuggestions = lnewsappArticleSuggestionCriteria.listArticleSuggestion();
		length =newsappArticleSuggestions== null ? 0 : Math.min(newsappArticleSuggestions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappArticleSuggestions[i]);
		}
		System.out.println(length + " ArticleSuggestion record(s) retrieved."); 
		
		System.out.println("Listing ChannelSuggestion by Criteria...");
		newsapp.ChannelSuggestionCriteria lnewsappChannelSuggestionCriteria = new newsapp.ChannelSuggestionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappChannelSuggestionCriteria.ID.eq();
		lnewsappChannelSuggestionCriteria.setMaxResults(ROW_COUNT);
		newsapp.ChannelSuggestion[] newsappChannelSuggestions = lnewsappChannelSuggestionCriteria.listChannelSuggestion();
		length =newsappChannelSuggestions== null ? 0 : Math.min(newsappChannelSuggestions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappChannelSuggestions[i]);
		}
		System.out.println(length + " ChannelSuggestion record(s) retrieved."); 
		
		System.out.println("Listing ChannelCategory by Criteria...");
		newsapp.ChannelCategoryCriteria lnewsappChannelCategoryCriteria = new newsapp.ChannelCategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappChannelCategoryCriteria.ID.eq();
		lnewsappChannelCategoryCriteria.setMaxResults(ROW_COUNT);
		newsapp.ChannelCategory[] newsappChannelCategorys = lnewsappChannelCategoryCriteria.listChannelCategory();
		length =newsappChannelCategorys== null ? 0 : Math.min(newsappChannelCategorys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappChannelCategorys[i]);
		}
		System.out.println(length + " ChannelCategory record(s) retrieved."); 
		
		System.out.println("Listing ArticleCategory by Criteria...");
		newsapp.ArticleCategoryCriteria lnewsappArticleCategoryCriteria = new newsapp.ArticleCategoryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lnewsappArticleCategoryCriteria.ID.eq();
		lnewsappArticleCategoryCriteria.setMaxResults(ROW_COUNT);
		newsapp.ArticleCategory[] newsappArticleCategorys = lnewsappArticleCategoryCriteria.listArticleCategory();
		length =newsappArticleCategorys== null ? 0 : Math.min(newsappArticleCategorys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(newsappArticleCategorys[i]);
		}
		System.out.println(length + " ArticleCategory record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProjectEAData listProjectEAData = new ListProjectEAData();
			try {
				listProjectEAData.listTestData();
				//listProjectEAData.listByCriteria();
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
