package az.developia.demo2.Lesson70homework;

@Component
@RequiredArgsConstructor
public class DataLoader {

    private final RoleRepository roleRepository;

    @PostConstruct
    public void loadRoles() {

        List<String> roles = List.of(
                "ROLE_GET_PROFILE",
                "ROLE_ADD_PRODUCT",
                "ROLE_GET_ALL_USERS",
                "ROLE_GET_OWN_PRODUCTS"
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
