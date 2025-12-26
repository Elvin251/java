package az.developia.demo2.Lesson64;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public OrderResponseDto create(@RequestBody OrderRequestDto request) {
        return orderService.createOrder(request);
    }
}
