package az.developia.demo2.Lesson56;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

    List<CarEntity> findByBrandContainingIgnoreCase(String brand);

    List<CarEntity> findByYearBetween(Integer beginDate, Integer endDate);
}
