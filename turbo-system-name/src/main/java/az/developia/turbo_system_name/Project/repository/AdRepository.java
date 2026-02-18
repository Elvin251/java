package az.developia.turbo_system_name.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import az.developia.turbo_system_name.Project.entity.AdEntity;

public interface AdRepository extends JpaRepository<AdEntity,Long> {
}