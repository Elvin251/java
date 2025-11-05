package az.developia.demo2.Lesson50Practice;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @GetMapping("/online")
    public List<User> getOnlineUsers() {
        return repo.findAllByStatus(Status.ONLINE);
    }

    @GetMapping("/similar")
    public List<User> getSimilarUsers(@RequestParam String username) {
        return repo.findSimilarUsernameAndEmail(username);
    }
}
