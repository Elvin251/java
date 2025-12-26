package az.developia.demo2.Lesson64;
public interface UserRepository extends JpaRepository<UserEntity, Long> {}
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {}
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {}
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {}
