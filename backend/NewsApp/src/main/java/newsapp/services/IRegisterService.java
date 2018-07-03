package newsapp.services;


import newsapp.services.data.UserDetails;

public interface IRegisterService  {

    boolean verifyUsernameAvailability(String username);
    boolean verifyEmailAvailability(String email);
    boolean verifyChannelAvailability(String channelName);
    boolean registerUser(UserDetails user);

}
