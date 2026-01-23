package az.developia.demo2.Lesson70homework;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PreAuthorize("hasAuthority('ROLE_ADD_PRODUCT')")
    @PostMapping
    public ProductEntity addProduct(@RequestParam String title,
                                    @RequestParam String description,
                                    @RequestParam Double price,
                                    Authentication authentication) {
        return productService.addProduct(title, description, price, authentication.getName());
    }

    @GetMapping
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

    @PreAuthorize("hasAuthority('ROLE_GET_OWN_PRODUCTS')")
    @GetMapping("/my")
    public List<ProductEntity> getOwnProducts(Authentication authentication) {
        return productService.getOwnProducts(authentication.getName());
    }
}
