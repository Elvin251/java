package az.developia.demo2.Lesson70homework;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findByUserId(Long userId);
}
