package newsapp.services;

import newsapp.data.NewsApp;
import newsapp.data.User;
import newsapp.services.data.Login;
import newsapp.services.data.LoginResponse;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LoginService implements ILoginService {

    public LoginResponse verifyCredentials(Login login) {
        Map<String, String> conditions = new HashMap<>();
        conditions.put("username", login.getUsername());
        conditions.put("password", login.getPassword());
        String condition = NewsApp.buildComplexCondition(conditions);
        User u = NewsApp.getUser(condition);
        LoginResponse lr = new LoginResponse();
        if(u == null) {
            lr.setSuccess(false);
        } else {
            lr.setSuccess(true);
            lr.setToken(u.getID());
            lr.setChannelName(u.get_myChannel().getName());
            List<String> categories = NewsApp.getUserCategories(u);
            lr.setCategories(categories);
        }
        return lr;
    }
}
