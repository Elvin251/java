package az.developia.demo2.Lesson63;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findByCustomerId(Long customerId);

    List<ProductEntity> findByPriceBetween(Double min, Double max);

    List<ProductEntity> findAllByOrderByNameAsc();
}
