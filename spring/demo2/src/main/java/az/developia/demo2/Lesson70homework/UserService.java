package az.developia.demo2.Lesson70homework;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserEntity register(String username, String password) {

        UserEntity user = new UserEntity();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));

        Set<RoleEntity> roles = new HashSet<>();
        roles.add(roleRepository.findByName("ROLE_GET_PROFILE").orElseThrow());
        roles.add(roleRepository.findByName("ROLE_ADD_PRODUCT").orElseThrow());
        roles.add(roleRepository.findByName("ROLE_GET_OWN_PRODUCTS").orElseThrow());

        user.setRoles(roles);

        return userRepository.save(user);
    }

    public UserEntity getProfile(String username) {
        return userRepository.findByUsername(username).orElseThrow();
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
