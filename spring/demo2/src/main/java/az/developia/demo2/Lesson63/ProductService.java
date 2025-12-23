package az.developia.demo2.Lesson63;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;

    public ProductResponseDTO save(ProductRequestDTO dto) {
        CustomerEntity customer = customerRepository.findById(dto.getCustomerId()).orElseThrow();
        ProductEntity product = ProductMapper.toEntity(dto, customer);
        return ProductMapper.toResponse(productRepository.save(product));
    }

    public List<ProductResponseDTO> getAll() {
        return productRepository.findAll()
                .stream().map(ProductMapper::toResponse).toList();
    }

    public ProductResponseDTO findById(Long id) {
        return productRepository.findById(id)
                .map(ProductMapper::toResponse).orElseThrow();
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public List<ProductResponseDTO> findByCustomer(Long customerId) {
        return productRepository.findByCustomerId(customerId)
                .stream().map(ProductMapper::toResponse).toList();
    }

    public List<ProductResponseDTO> sortAZ() {
        return productRepository.findAllByOrderByNameAsc()
                .stream().map(ProductMapper::toResponse).toList();
    }

    public List<ProductResponseDTO> findByPriceRange(Double min, Double max) {
        return productRepository.findByPriceBetween(min, max)
                .stream().map(ProductMapper::toResponse).toList();
    }
}
