package az.developia.demo2.Lesson67;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/register")
    public String register(@RequestBody CustomerRequest request){
        customerService.register(request);
        return "Customer qeydiyyatdan kecdi";
    }
}