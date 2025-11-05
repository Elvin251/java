package az.developia.demo2.Lesson50Practice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByStatus(Status status);

    @Query("SELECT u FROM User u WHERE u.username = :username AND u.email LIKE CONCAT(:username, '%')")
    List<User> findSimilarUsernameAndEmail(String username);
}
