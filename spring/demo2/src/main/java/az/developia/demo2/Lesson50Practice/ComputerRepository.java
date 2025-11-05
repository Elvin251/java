package az.developia.demo2.Lesson50Practice;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> findAllByBrand(String brand);
    List<Computer> findAllByBrandAndPriceAndColor(String brand, Double price, String color);
}
