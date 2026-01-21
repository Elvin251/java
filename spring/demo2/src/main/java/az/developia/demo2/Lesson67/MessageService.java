package az.developia.demo2.Lesson67;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;
    private final CustomerRepository customerRepository;

    public void sendWelcomeMessage(CustomerEntity customer){
        MessageEntity message = new MessageEntity();
        message.setMessage("Xos gelmisen");
        message.setCustomer(customer);

        messageRepository.save(message);
    }
}
