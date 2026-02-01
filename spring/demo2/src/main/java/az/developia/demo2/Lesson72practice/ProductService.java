package az.developia.demo2.Lesson72practice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponse addProduct(AddProductRequest request) {

        ProductEntity product = new ProductEntity();
        product.setTitle(request.getTitle());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setProductYear(request.getProductYear());
        product.setProductLink(request.getProductLink());

        ProductEntity saved = productRepository.save(product);

        ProductResponse response = new ProductResponse();
        response.setId(saved.getId());
        response.setTitle(saved.getTitle());
        response.setDescription(saved.getDescription());
        response.setPrice(saved.getPrice());
        response.setProductYear(saved.getProductYear());
        response.setProductLink(saved.getProductLink());

        return response;
    }
}