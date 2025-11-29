package az.developia.demo2.Lesson56;



import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @PostMapping
    public CarEntity add(@RequestBody CarEntity request) {
        return carService.add(request);
    }

    @GetMapping("/by-brand")
    public List<CarEntity> findByBrand(@RequestParam(name = "brand") String brand) {
        return carService.findByBrand(brand);
    }

    @GetMapping("/between-year")
    public List<CarEntity> findByYearBetween(
            @RequestParam(name = "begin", required = false) Integer beginDate,
            @RequestParam(name = "end", required = false) Integer endDate
    ) {
        return carService.findByYearBetween(beginDate, endDate);
    }

    @GetMapping
    public List<CarEntity> getAll() {
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public CarEntity findById(@PathVariable Long id) {
        return carService.findById(id);
    }

    @PutMapping
    public CarEntity update(@RequestBody CarEntity request) {
        return carService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        carService.delete(id);
    }
}
