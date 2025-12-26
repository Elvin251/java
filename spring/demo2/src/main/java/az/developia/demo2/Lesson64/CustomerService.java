package az.developia.demo2.Lesson64;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final UserRepository userRepository;
    private final CustomerRepository customerRepository;

    public CustomerResponseDto register(CustomerRequestDto request) {

        UserEntity user = UserMapper.toEntity(request.getUser());
        userRepository.save(user);

        CustomerEntity customer =
                CustomerMapper.toEntity(request, user);
        customerRepository.save(customer);

        return CustomerMapper.toDto(customer);
    }
}
