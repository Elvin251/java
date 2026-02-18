package az.developia.turbo_system_name.Project.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import az.developia.turbo_system_name.Project.entity.FavoriteEntity;

public interface FavoriteRepository extends JpaRepository<FavoriteEntity,Long> {
    List<FavoriteEntity> findByUserId(Long userId);
}