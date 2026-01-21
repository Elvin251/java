package az.developia.demo2.Lesson66;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final LogRepository logRepository;

    public CustomerService(CustomerRepository customerRepository,
                           LogRepository logRepository) {
        this.customerRepository = customerRepository;
        this.logRepository = logRepository;
    }

    public CustomerEntity register(CustomerEntity customer) {
        CustomerEntity saved = customerRepository.save(customer);
        saveLog("REGISTER", "Customer registered with id: " + saved.getId());
        return saved;
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
        saveLog("DELETE", "Customer deleted with id: " + id);
    }

    private void saveLog(String action, String desc) {
        LogEntity log = new LogEntity();
        log.setAction(action);
        log.setDescription(desc);
        log.setCreatedAt(LocalDateTime.now());
        logRepository.save(log);
    }
}