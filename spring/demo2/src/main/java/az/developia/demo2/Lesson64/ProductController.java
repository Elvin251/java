package az.developia.demo2.Lesson64;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductResponseDto create(@RequestBody ProductRequestDto request) {
        return productService.create(request);
    }
}
