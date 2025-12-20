package az.developia.demo2.Lesson63;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void save(CustomerRequestDto dto) {
        customerRepository.save(CustomerMapper.toEntity(dto));
    }

    public CustomerResponseDto findById(Long id) {
        return CustomerMapper.toDto(
                customerRepository.findById(id).orElseThrow());
    }
}
