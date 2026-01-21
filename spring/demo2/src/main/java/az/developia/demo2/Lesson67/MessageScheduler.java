package az.developia.demo2.Lesson67;

@Service
@RequiredArgsConstructor
public class MessageScheduler {

    private final CustomerRepository customerRepository;
    private final MessageService messageService;

    @Scheduled(fixedRate = 5000)
    public void autoMessage(){
        List<CustomerEntity> customers = customerRepository.findAll();

        for(CustomerEntity c : customers){
            messageService.sendWelcomeMessage(c);
        }
    }
}