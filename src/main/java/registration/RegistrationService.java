package registration;

public class RegistrationService {

    private PasswordEncoder passwordEncoder;
    private UserRepository userRepository;

    public RegistrationService(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    public void register(String username, String password) {
        if (userRepository.isUsernameAvailable(username)) {
            String hashedPassword = passwordEncoder.hash(password);
            userRepository.addUserToDatabase(username,hashedPassword);
        }
    }
}
