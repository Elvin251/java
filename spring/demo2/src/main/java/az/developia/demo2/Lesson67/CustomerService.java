package az.developia.demo2.Lesson67;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerEntity register(CustomerRequest request){
        CustomerEntity customer = new CustomerEntity();
        customer.setName(request.getName());

        customerRepository.save(customer);

        log.info(request.getName() + " adli istifadeci qeydiyyatdan kecdi");

        return customer;
    }
}
