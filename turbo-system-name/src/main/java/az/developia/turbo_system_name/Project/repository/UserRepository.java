package az.developia.turbo_system_name.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import az.developia.turbo_system_name.Project.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByUsername(String username);
}