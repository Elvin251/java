package az.developia.demo2.Lesson63;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByCustomerId(Long customerId);

    List<ProductEntity> findAllByOrderByNameAsc();

    List<ProductEntity> findByPriceBetween(Double minPrice, Double maxPrice);
}
