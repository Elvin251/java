package az.developia.demo2.Lesson64;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public CustomerResponseDto register(@RequestBody CustomerRequestDto request) {
        return customerService.register(request);
    }
}
