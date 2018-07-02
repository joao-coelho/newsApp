CREATE TABLE "User" (ID SERIAL NOT NULL, ChannelID int4 NOT NULL, Username varchar(255), Password varchar(255), Name varchar(255), Age int2, Country varchar(255), Email varchar(255), PRIMARY KEY (ID));
CREATE TABLE Category (ID SERIAL NOT NULL, Description varchar(255), PRIMARY KEY (ID));
CREATE TABLE Comment (ID SERIAL NOT NULL, ArticleID int4 NOT NULL, UserID int4 NOT NULL, Content varchar(255), AddedAt date, PRIMARY KEY (ID));
CREATE TABLE Article (ID SERIAL NOT NULL, ChannelID int4 NOT NULL, Title varchar(255), Content varchar(255), Likes int4 NOT NULL, AddedAt date, Image_url varchar(255), PRIMARY KEY (ID));
CREATE TABLE Channel (ID SERIAL NOT NULL, Name varchar(255), Description varchar(255), Subscribers int4 NOT NULL, Image_url varchar(255), PRIMARY KEY (ID));
CREATE TABLE Suggestion (ID SERIAL NOT NULL, ArticleID int4, ChannelID int4, UserID int4 NOT NULL, Comment varchar(255), AddedAt date, Discriminator varchar(255) NOT NULL, PRIMARY KEY (ID));
CREATE TABLE User_Category (UserID int4 NOT NULL, CategoryID int4 NOT NULL, PRIMARY KEY (UserID, CategoryID));
CREATE TABLE Suggestion_User (SuggestionID int4 NOT NULL, UserID int4 NOT NULL, PRIMARY KEY (SuggestionID, UserID));
CREATE TABLE User_Channel (UserID int4 NOT NULL, ChannelID int4 NOT NULL, PRIMARY KEY (UserID, ChannelID));
CREATE TABLE Channel_Category (ChannelID int4 NOT NULL, CategoryID int4 NOT NULL, PRIMARY KEY (ChannelID, CategoryID));
CREATE TABLE Article_Category (ArticleID int4 NOT NULL, CategoryID int4 NOT NULL, PRIMARY KEY (ArticleID, CategoryID));
CREATE TABLE User_Article (UserID int4 NOT NULL, ArticleID int4 NOT NULL, PRIMARY KEY (UserID, ArticleID));
ALTER TABLE User_Category ADD CONSTRAINT FKUser_Categ848082 FOREIGN KEY (UserID) REFERENCES "User" (ID);
ALTER TABLE User_Category ADD CONSTRAINT FKUser_Categ854446 FOREIGN KEY (CategoryID) REFERENCES Category (ID);
ALTER TABLE Comment ADD CONSTRAINT FKComment537260 FOREIGN KEY (UserID) REFERENCES "User" (ID);
ALTER TABLE Comment ADD CONSTRAINT FKComment841720 FOREIGN KEY (ArticleID) REFERENCES Article (ID);
ALTER TABLE Article ADD CONSTRAINT FKArticle351210 FOREIGN KEY (ChannelID) REFERENCES Channel (ID);
ALTER TABLE Suggestion_User ADD CONSTRAINT FKSuggestion816255 FOREIGN KEY (SuggestionID) REFERENCES Suggestion (ID);
ALTER TABLE Suggestion_User ADD CONSTRAINT FKSuggestion962739 FOREIGN KEY (UserID) REFERENCES "User" (ID);
ALTER TABLE Suggestion ADD CONSTRAINT FKSuggestion672977 FOREIGN KEY (UserID) REFERENCES "User" (ID);
ALTER TABLE User_Channel ADD CONSTRAINT FKUser_Chann909379 FOREIGN KEY (UserID) REFERENCES "User" (ID);
ALTER TABLE User_Channel ADD CONSTRAINT FKUser_Chann951847 FOREIGN KEY (ChannelID) REFERENCES Channel (ID);
ALTER TABLE "User" ADD CONSTRAINT FKUser990031 FOREIGN KEY (ChannelID) REFERENCES Channel (ID);
ALTER TABLE Suggestion ADD CONSTRAINT FKSuggestion562614 FOREIGN KEY (ChannelID) REFERENCES Channel (ID);
ALTER TABLE Suggestion ADD CONSTRAINT FKSuggestion994152 FOREIGN KEY (ArticleID) REFERENCES Article (ID);
ALTER TABLE Channel_Category ADD CONSTRAINT FKChannel_Ca538340 FOREIGN KEY (ChannelID) REFERENCES Channel (ID);
ALTER TABLE Channel_Category ADD CONSTRAINT FKChannel_Ca620357 FOREIGN KEY (CategoryID) REFERENCES Category (ID);
ALTER TABLE Article_Category ADD CONSTRAINT FKArticle_Ca932806 FOREIGN KEY (ArticleID) REFERENCES Article (ID);
ALTER TABLE Article_Category ADD CONSTRAINT FKArticle_Ca330876 FOREIGN KEY (CategoryID) REFERENCES Category (ID);
ALTER TABLE User_Article ADD CONSTRAINT FKUser_Artic732470 FOREIGN KEY (UserID) REFERENCES "User" (ID);
ALTER TABLE User_Article ADD CONSTRAINT FKUser_Artic36931 FOREIGN KEY (ArticleID) REFERENCES Article (ID);