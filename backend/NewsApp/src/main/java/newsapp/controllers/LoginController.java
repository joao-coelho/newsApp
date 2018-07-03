package newsapp.controllers;

import newsapp.services.ILoginService;
import newsapp.services.data.Login;
import newsapp.services.data.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ILoginService l;

    @RequestMapping(value = "/verifyCredentials", method = RequestMethod.POST)
    public LoginResponse verifyUser(@RequestBody Login login) {
        System.out.println("Entrei");
        LoginResponse lr = l.verifyCredentials(login);
        System.out.println(lr.getChannelName());
        System.out.println(lr.getToken());
        System.out.println(lr.getSuccess());
        System.out.println(lr.getCategories());
        return lr;
    }

}
