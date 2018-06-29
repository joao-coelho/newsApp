package backend;

import newsapp.*;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService implements IRegisterService {

    public int verifyUser(String name) {
        User u = new User();
        Channel c = new Channel();
        c.setDescription("pedro");
        c.setLikes(0);
        c.setName("pedro");
        c.setSubscribers(0);
        u.setUsername("Pedro");
        u.setAge((short)12);
        u.setName("Alfredo");
        u.setCountry("portugal");
        u.setPassword("asdasd");
        u.set_myChannel(c);
        try {
            ChannelDAO.save(c);
            UserDAO.save(u);
        } catch (PersistentException e) {

        }

        return 1;
    }

    public int verifyEmail(String email) {
        return 1;
    }

    /*
    public int submitDetails(UserDetails user) {
        return 1;
    }*/


}
