package az.developia.demo2.Lesson70;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public UserEntity register(@RequestParam String username,
                               @RequestParam String password) {
        return userService.register(username, password);
    }

    @PreAuthorize("hasAuthority('ROLE_GET_PROFILE')")
    @GetMapping("/profile")
    public UserEntity getProfile(Authentication authentication) {
        return userService.getProfile(authentication.getName());
    }

    @PreAuthorize("hasAuthority('ROLE_GET_ALL_USERS')")
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }
}
