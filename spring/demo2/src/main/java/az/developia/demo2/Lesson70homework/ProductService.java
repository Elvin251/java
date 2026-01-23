package az.developia.demo2.Lesson70homework;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    public ProductEntity addProduct(String title, String description, Double price, String username) {

        UserEntity user = userRepository.findByUsername(username).orElseThrow();

        ProductEntity product = new ProductEntity();
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setUserId(user.getId());

        return productRepository.save(product);
    }

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public List<ProductEntity> getOwnProducts(String username) {
        UserEntity user = userRepository.findByUsername(username).orElseThrow();
        return productRepository.findByUserId(user.getId());
    }
}
