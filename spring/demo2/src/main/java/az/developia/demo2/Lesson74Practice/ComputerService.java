package az.developia.demo2.Lesson74Practice;



import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComputerService {

    private final ComputerRepository computerRepository;

    public void add(AddComputerRequest request) {

        ComputerEntity computer = new ComputerEntity();
        computer.setBrand(request.getBrand());
        computer.setModel(request.getModel());
        computer.setPrice(request.getPrice());
        computer.setColor(request.getColor());

        computerRepository.save(computer);
    }

    public List<ComputerResponse> getAll() {

        return ComputerMapper.toDTOList(computerRepository.findAll());
    }

    public ComputerResponse findById(Long id) {

        ComputerEntity computer = computerRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Computer tapılmadı")
                );

        return ComputerMapper.toDTO(computer);
    }

    public void update(UpdateComputerRequest request) {

        ComputerEntity computer = computerRepository.findById(request.getId())
                .orElseThrow(() ->
                        new RuntimeException("Computer tapılmadı")
                );

        computer.setBrand(request.getBrand());
        computer.setModel(request.getModel());
        computer.setPrice(request.getPrice());
        computer.setColor(request.getColor());

        computerRepository.save(computer);
    }

    public void delete(Long id) {

        ComputerEntity computer = computerRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Computer tapılmadı")
                );

        computerRepository.delete(computer);
    }
}
