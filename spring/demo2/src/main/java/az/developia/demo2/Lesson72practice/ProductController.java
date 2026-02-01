package az.developia.demo2.Lesson72practice;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductResponse addProduct(
            @RequestBody @Valid AddProductRequest request) {
        return productService.addProduct(request);
    }
}