package backend;

import newsapp.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private IRegisterService r;

    @RequestMapping(value = "/verifyUser", method = RequestMethod.GET)
    public int verifyUser(@RequestParam("username") String username) {
        int result = r.verifyUser(username);
        return result;
    }

    @RequestMapping(value = "/verifyEmail", method = RequestMethod.GET)
    public int verifyEmail(@RequestParam("email") String email) {
        int result = r.verifyEmail(email);
        return result;
    }

    /*
    @RequestMapping(value = "/submitDetails", method = RequestMethod.POST)
    public int submitDetails(@RequestBody UserDetails user) {
        int result = r.submitDetails(user);
        return result;
    }*/



}
