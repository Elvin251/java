package az.developia.demo2.Lesson50Homework.Lesson50Practice;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/computers")
public class ComputerController {

    private final List<Computer> computers = new ArrayList<>();

    public ComputerController() {
        computers.add(new Computer(1L, "HP", "ProBook", "black", 1200.0, 16, 512));
        computers.add(new Computer(2L, "HP", "EliteBook", "silver", 1500.0, 32, 1024));
        computers.add(new Computer(3L, "ASUS", "VivoBook", "gray", 1000.0, 16, 512));
        computers.add(new Computer(4L, "ASUS", "ROG", "red", 1800.0, 32, 1024));
        computers.add(new Computer(5L, "MAC", "MacBook Pro", "white", 2000.0, 16, 512));
    }

    @GetMapping("/all")
    public List<Computer> getAllComputers() {
        return computers;
    }

    @GetMapping("/hp")
    public List<Computer> getHPComputers() {
        return computers.stream()
                .filter(c -> c.getBrand().equalsIgnoreCase("HP"))
                .collect(Collectors.toList());
    }

    @GetMapping("/filter")
    public List<Computer> getFilteredComputer(
            @RequestParam String brand,
            @RequestParam Double price,
            @RequestParam String color) {

        return computers.stream()
                .filter(c -> c.getBrand().equalsIgnoreCase(brand)
                        && c.getPrice().equals(price)
                        && c.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }
}
