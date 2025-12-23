package az.developia.demo2.Lesson63;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerResponseDTO save(CustomerRequestDTO dto) {
        CustomerEntity entity = CustomerMapper.toEntity(dto);
        return CustomerMapper.toResponse(customerRepository.save(entity));
    }

    public CustomerResponseDTO findById(Long id) {
        return customerRepository.findById(id)
                .map(CustomerMapper::toResponse)
                .orElseThrow();
    }
}
