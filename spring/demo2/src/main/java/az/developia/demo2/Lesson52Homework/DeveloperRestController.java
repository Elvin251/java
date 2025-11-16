package az.developia.demo2.Lesson52Homework;


import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
@RequestMapping("/api/developers")
@CrossOrigin(origins = "*")
public class DeveloperRestController {


    private final List<DeveloperEntity> developers = new ArrayList<>(List.of(
            new DeveloperEntity(1L, "Elvin", "Aliyev", "Backend", 2500, 4),
            new DeveloperEntity(2L, "Nurlan", "Quliyev", "Frontend", 2200, 3),
            new DeveloperEntity(3L, "Aysel", "Mammadova", "Fullstack", 3000, 6)
    ));


    @GetMapping
    public List<DeveloperEntity> getAll() {
        return developers;
    }


    @GetMapping("/{id}")
    public DeveloperEntity findById(@PathVariable Long id) {
        return developers.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }


    @GetMapping("/max-salary")
    public DeveloperEntity maxSalary() {
        return developers.stream().max(Comparator.comparingDouble(DeveloperEntity::getSalary)).orElse(null);
    }


    @GetMapping("/max-experience")
    public DeveloperEntity maxExperience() {
        return developers.stream().max(Comparator.comparingInt(DeveloperEntity::getExperienceYear)).orElse(null);
    }


    @PostMapping
    public DeveloperEntity add(@RequestBody DeveloperEntity dev) {
        dev.setId((long) (developers.size() + 1));
        developers.add(dev);
        return dev;
    }
}


