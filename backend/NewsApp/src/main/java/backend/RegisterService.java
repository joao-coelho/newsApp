package backend;


import newsapp.*;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService implements IRegisterService  {

    public boolean verifyUsernameAvailability(String username) {
        String condition = NewsApp.buildSimpleCondition("username", username);
        User u = NewsApp.getUser(condition);
        if(u == null) return true;
        else return false;
    }

    public boolean verifyEmailAvailability(String email) {
        String condition = NewsApp.buildSimpleCondition("email", email);
        User u = NewsApp.getUser(condition);
        if(u == null) return true;
        else return false;
    }

    public boolean verifyChannelAvailability(String channelName) {
        String condition = NewsApp.buildSimpleCondition("name", channelName);
        Channel c = NewsApp.getChannel(condition);
        if(c == null) return true;
        else return false;
    }

    public boolean registerUser(UserDetails user) {
        Channel c = null;
        User u = null;
        List<String> channelTypes = user.getChannelTypes();
        String channelName, description;
        if(user.wantsChannel()) {
            channelName = user.getChannelName();
            description = user.getChannelDescription();
        } else {
            channelName = user.getUsername();
            description = "";
        }
        c = NewsApp.createChannel(channelName, description, channelTypes);
        if(c == null) return false;
        u = NewsApp.createUser(user.getUsername(), user.getPassword(), user.getName(),
                                user.getAge(), user.getCountry(), user.getTypes(), c);
        if(u == null) return false;
        return true;
    }



}
