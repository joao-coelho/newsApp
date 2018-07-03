package newsapp.services;

import newsapp.services.data.Login;
import newsapp.services.data.LoginResponse;

public interface ILoginService {
    LoginResponse verifyCredentials(Login login);
}
