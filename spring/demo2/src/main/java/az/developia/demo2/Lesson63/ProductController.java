package az.developia.demo2.Lesson63;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public void save(@RequestBody ProductRequestDto dto) {
        productService.save(dto);
    }

    @GetMapping
    public List<ProductResponseDto> getAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductResponseDto getById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id,
                       @RequestBody ProductRequestDto dto) {
        productService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }

    @GetMapping("/customer/{customerId}")
    public List<ProductResponseDto> byCustomer(@PathVariable Long customerId) {
        return productService.findByCustomer(customerId);
    }

    @GetMapping("/sort")
    public List<ProductResponseDto> sortAZ() {
        return productService.sortAZ();
    }

    @GetMapping("/price")
    public List<ProductResponseDto> priceRange(
            @RequestParam Double min,
            @RequestParam Double max) {
        return productService.findByPriceRange(min, max);
    }
}
