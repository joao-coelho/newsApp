package backend;


public interface IRegisterService {
    int verifyUser(String name);
    int verifyEmail(String email);
}
