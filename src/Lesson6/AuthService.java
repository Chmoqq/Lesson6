package Lesson6;

public interface AuthService {
    void addClient(String log, String pass);
    String getNick(String login, String password);
    boolean isLoginMatch(String login);
    boolean contains(String username);
}
