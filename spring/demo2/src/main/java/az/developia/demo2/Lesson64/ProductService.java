package az.developia.demo2.Lesson64;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto create(ProductRequestDto request) {

        ProductEntity product = ProductMapper.toEntity(request);
        productRepository.save(product);

        return ProductMapper.toDto(product);
    }
}
