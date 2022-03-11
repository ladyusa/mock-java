package registration;

public interface UserRepository {

    boolean isUsernameAvailable(String username);
    void addUserToDatabase(String username, String hashPassword);
}
