package az.developia.demo2.Lesson64;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    public OrderResponseDto createOrder(OrderRequestDto request) {

        CustomerEntity customer =
                customerRepository.findById(request.getCustomerId()).orElseThrow();

        ProductEntity product =
                productRepository.findById(request.getProductId()).orElseThrow();

        OrderEntity order = new OrderEntity();
        order.setCustomer(customer);
        order.setProduct(product);
        order.setQuantity(request.getQuantity());

        orderRepository.save(order);

        return OrderMapper.toDto(order);
    }
}
