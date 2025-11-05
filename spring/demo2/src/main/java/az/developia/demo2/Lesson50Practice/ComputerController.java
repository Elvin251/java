package az.developia.demo2.Lesson50Practice;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/computers")
public class ComputerController {

    private final ComputerRepository repo;

    public ComputerController(ComputerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public List<Computer> getAllComputers() {
        return repo.findAll();
    }

    @GetMapping("/hp")
    public List<Computer> getHPComputers() {
        return repo.findAllByBrand("HP");
    }

    @GetMapping("/filter")
    public List<Computer> getFilteredComputer(
            @RequestParam String brand,
            @RequestParam Double price,
            @RequestParam String color) {
        return repo.findAllByBrandAndPriceAndColor(brand, price, color);
    }
}
