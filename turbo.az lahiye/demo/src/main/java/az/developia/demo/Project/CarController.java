package az.developia.demo.Project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostMapping
    public CarEntity add(@RequestBody CarEntity car) {
        return carRepository.save(car);
    }

    @GetMapping
    public List<CarEntity> list() {
        return carRepository.findAll();
    }
}