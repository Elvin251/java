package az.developia.demo2.Lesson50Homework;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1L, "iPhone", "Apple smartphone", 1200.0, ProductType.SOLD));
        products.add(new Product(2L, "Samsung TV", "Smart TV", 45.0, ProductType.ON_SALE));
        products.add(new Product(3L, "Laptop", "Gaming laptop", 900.0, ProductType.ON_SALE));
        products.add(new Product(4L, "Mouse", "Wireless mouse", 25.0, ProductType.ON_SALE));
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    @GetMapping("/sold")
    public List<Product> getSoldProducts() {
        return products.stream()
                .filter(p -> p.getProductType() == ProductType.SOLD)
                .collect(Collectors.toList());
    }

    @GetMapping("/on-sale")
    public List<Product> getOnSaleProductsUnder50() {
        return products.stream()
                .filter(p -> p.getProductType() == ProductType.ON_SALE && p.getPrice() < 50)
                .collect(Collectors.toList());
    }

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam(required = false) String name,
                                        @RequestParam(required = false) Double price) {
        return products.stream()
                .filter(p -> (name == null || p.getName().toLowerCase().contains(name.toLowerCase())) &&
                        (price == null || p.getPrice().equals(price)))
                .collect(Collectors.toList());
    }
}
