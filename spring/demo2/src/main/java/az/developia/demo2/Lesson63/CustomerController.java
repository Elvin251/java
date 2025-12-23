package az.developia.demo2.Lesson63;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public CustomerResponseDTO save(@RequestBody CustomerRequestDTO dto) {
        return customerService.save(dto);
    }

    @GetMapping("/{id}")
    public CustomerResponseDTO findById(@PathVariable Long id) {
        return customerService.findById(id);
    }
}
