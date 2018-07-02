package backend;

public interface ILoginService {
    LoginResponse verifyCredentials(Login login);
}
