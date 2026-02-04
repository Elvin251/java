package az.developia.demo2.Lesson74Practice;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/computers")
@RequiredArgsConstructor
public class ComputerController {

    private final ComputerService computerService;

    @PostMapping
    public void add(@RequestBody @Valid AddComputerRequest request) {
        computerService.add(request);
    }

    @GetMapping
    public List<ComputerResponse> getAll() {
        return computerService.getAll();
    }

    @GetMapping("/{id}")
    public ComputerResponse findById(@PathVariable Long id) {
        return computerService.findById(id);
    }

    @PutMapping
    public void update(@RequestBody @Valid UpdateComputerRequest request) {
        computerService.update(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        computerService.delete(id);
    }
}
