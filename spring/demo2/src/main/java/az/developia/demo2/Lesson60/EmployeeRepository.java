package az.developia.demo2.Lesson60;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    List<EmployeeEntity> findBySalaryBetween(Double min, Double max);

    List<EmployeeEntity> findBySalaryGreaterThan(Double salary);


    List<EmployeeEntity> findByEmailEndingWith(String end);

    @Query("SELECT e FROM EmployeeEntity e WHERE CONCAT(e.name, ' ', e.surname) LIKE %:keyword%")
    List<EmployeeEntity> searchByFullName(@Param("keyword") String keyword);

    List<EmployeeEntity> findByBirthdayBetween(LocalDate begin, LocalDate end);

    List<EmployeeEntity> findByExperienceYearBetween(Integer min, Integer max);

    List<EmployeeEntity> findByPhoneStartingWith(String prefix);
}
