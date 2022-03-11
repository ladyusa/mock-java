package registration;

public interface PasswordEncoder {
    String hash(String password);
}
