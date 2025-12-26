package az.developia.demo2.Lesson50Homework.Lesson50Practice;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final List<User> users = new ArrayList<>();

    public UserController() {

        users.add(new User(1L, "user1", "pass1", "user1@gmail.com", Status.ONLINE));
        users.add(new User(2L, "user2", "pass2", "user2@gmail.com", Status.ONLINE));
        users.add(new User(3L, "user3", "pass3", "user3@gmail.com", Status.ONLINE));
        users.add(new User(4L, "alex", "pass4", "alex123@gmail.com", Status.OFFLINE));
        users.add(new User(5L, "mike", "pass5", "mikey@gmail.com", Status.OFFLINE));
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return users;
    }

    @GetMapping("/online")
    public List<User> getOnlineUsers() {
        return users.stream()
                .filter(u -> u.getStatus() == Status.ONLINE)
                .collect(Collectors.toList());
    }

    @GetMapping("/search")
    public List<User> getUsersWithSimilarEmail(@RequestParam String username) {
        return users.stream()
                .filter(u -> u.getUsername().equalsIgnoreCase(username)
                        && u.getEmail().toLowerCase().contains(username.toLowerCase()))
                .collect(Collectors.toList());
    }
}
