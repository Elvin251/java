package az.developia.demo.Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<ModelEntity, Long> {
}