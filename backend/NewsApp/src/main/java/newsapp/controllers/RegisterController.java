package newsapp.controllers;



import newsapp.services.IRegisterService;
import newsapp.services.data.UserDetails;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;


@RestController
@CrossOrigin
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private IRegisterService r;

    @RequestMapping(value = "/verifyUser", method = RequestMethod.GET)
    public int verifyUser(@RequestParam("username") String username) {
        boolean result = r.verifyUsernameAvailability(username);
        return result ? 1 : 0;
    }

    @RequestMapping(value = "/verifyEmail", method = RequestMethod.GET)
    public int verifyEmail(@RequestParam("email") String email) {
        /*
        boolean result = r.verifyEmailAvailability(email);
        return result ? 1 : 0;*/
        return 1;
    }

    @RequestMapping(value = "/verifyChannelName", method = RequestMethod.GET)
    public int verifyChannel(HttpSession session, @RequestParam("channelName") String channelName) {
        boolean result = r.verifyChannelAvailability(channelName);
        return result ? 1 : 0;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public int submitDetails(@RequestBody UserDetails user ) {
        boolean result = r.registerUser(user);
        return result ? 1 : 0;
    }



}
