package az.developia.demo2.Lesson63;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;

    public void save(ProductRequestDto dto) {
        CustomerEntity customer =
                customerRepository.findById(dto.getCustomerId()).orElseThrow();
        productRepository.save(ProductMapper.toEntity(dto, customer));
    }

    public List<ProductResponseDto> findAll() {
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toDto)
                .toList();
    }

    public ProductResponseDto findById(Long id) {
        return ProductMapper.toDto(
                productRepository.findById(id).orElseThrow());
    }

    public void update(Long id, ProductRequestDto dto) {
        ProductEntity product = productRepository.findById(id).orElseThrow();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public List<ProductResponseDto> findByCustomer(Long customerId) {
        return productRepository.findByCustomerId(customerId)
                .stream()
                .map(ProductMapper::toDto)
                .toList();
    }

    public List<ProductResponseDto> sortAZ() {
        return productRepository.findAllByOrderByNameAsc()
                .stream()
                .map(ProductMapper::toDto)
                .toList();
    }

    public List<ProductResponseDto> findByPriceRange(Double min, Double max) {
        return productRepository.findByPriceBetween(min, max)
                .stream()
                .map(ProductMapper::toDto)
                .toList();
    }
}
