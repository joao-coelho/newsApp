package backend;

import newsapp.ProjectEAPersistentManager;
import org.orm.PersistentException;
import org.orm.PersistentSession;


import javax.servlet.http.HttpSession;

public class SessionManager {

    public static PersistentSession getSession(HttpSession session)  {
        HttpSession s = session;
        PersistentSession p = (PersistentSession) session.getAttribute("session");
        if (p == null) {
            try {
                p = ProjectEAPersistentManager.instance().getSession();
            } catch (PersistentException e) {
                e.printStackTrace();
            }
            session.setAttribute("session", p);
        }
        return p;
    }
}
