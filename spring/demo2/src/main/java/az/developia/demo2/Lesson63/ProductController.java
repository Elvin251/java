package az.developia.demo2.Lesson63;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductResponseDTO save(@RequestBody ProductRequestDTO dto) {
        return productService.save(dto);
    }

    @GetMapping
    public List<ProductResponseDTO> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ProductResponseDTO findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }

    @GetMapping("/by-customer/{customerId}")
    public List<ProductResponseDTO> byCustomer(@PathVariable Long customerId) {
        return productService.findByCustomer(customerId);
    }

    @GetMapping("/sort-az")
    public List<ProductResponseDTO> sortAZ() {
        return productService.sortAZ();
    }

    @GetMapping("/price-range")
    public List<ProductResponseDTO> priceRange(
            @RequestParam Double min,
            @RequestParam Double max) {
        return productService.findByPriceRange(min, max);
    }
}
