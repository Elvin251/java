package az.developia.demo2.Lesson70;
@Component
@RequiredArgsConstructor
public class DataLoader {

    private final RoleRepository roleRepository;

    @PostConstruct
    public void loadRoles() {

        List<String> roles = List.of(
                "ROLE_GET_PROFILE",
                "ROLE_UPDATE_PROFILE",
                "ROLE_DELETE_PROFILE",
                "ROLE_GET_ALL_USERS",
                "ROLE_DELETE_PICTURE"
        );

        for (String roleName : roles) {
            if (roleRepository.findByName(roleName).isEmpty()) {
                RoleEntity role = new RoleEntity();
                role.setName(roleName);
                roleRepository.save(role);
            }
        }
    }
}
