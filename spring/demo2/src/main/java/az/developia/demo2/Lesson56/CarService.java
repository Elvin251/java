package az.developia.demo2.Lesson56;



import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public CarEntity add(CarEntity request) {
        CarEntity car = new CarEntity();
        car.setBrand(request.getBrand());
        car.setDescription(request.getDescription());
        car.setModel(request.getModel());
        car.setPrice(request.getPrice());
        car.setKmCount(request.getKmCount());
        car.setYear(request.getYear());
        carRepository.save(car);
        return car;
    }

    public List<CarEntity> findByBrand(String brand) {
        return carRepository.findByBrandContainingIgnoreCase(brand);
    }

    public List<CarEntity> findByYearBetween(Integer beginDate, Integer endDate) {
        return carRepository.findByYearBetween(beginDate, endDate);
    }

    public List<CarEntity> getAll() {
        return carRepository.findAll();
    }

    public CarEntity findById(Long id) {
        CarEntity car = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found"));
        return car;
    }

    public CarEntity update(CarEntity request) {
        CarEntity car = carRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Car not found"));

        car.setBrand(request.getBrand());
        car.setDescription(request.getDescription());
        car.setModel(request.getModel());
        car.setPrice(request.getPrice());
        car.setKmCount(request.getKmCount());
        car.setYear(request.getYear());

        carRepository.save(car);
        return car;
    }

    public void delete(Long id) {
        CarEntity car = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found"));
        carRepository.delete(car);
    }
}
