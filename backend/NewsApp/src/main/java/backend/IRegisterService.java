package backend;



import newsapp.Channel;
import newsapp.NewsApp;
import newsapp.User;


import java.util.List;

public interface IRegisterService  {

    boolean verifyUsernameAvailability(String username);
    boolean verifyEmailAvailability(String email);
    boolean verifyChannelAvailability(String channelName);
    boolean registerUser(UserDetails user);

}
