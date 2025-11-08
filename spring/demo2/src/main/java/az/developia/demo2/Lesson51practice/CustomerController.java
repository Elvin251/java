package az.developia.demo2.Lesson51practice;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "*")
public class CustomerController {

    private final List<CustomerEntity> customers = new ArrayList<>();

    public CustomerController() {

        customers.add(new CustomerEntity(1L, "Ali", "Mammadov", "ali@mail.com", "0501112233", 600.0));
        customers.add(new CustomerEntity(2L, "Aysel", "Huseynova", "aysel@mail.com", "0512223344", 750.0));
        customers.add(new CustomerEntity(3L, "Murad", "Aliyev", "murad@mail.com", "0503334455", 450.0));
        customers.add(new CustomerEntity(4L, "Kamran", "Hasanov", "kamran@mail.com", "0704445566", 300.0));
        customers.add(new CustomerEntity(5L, "Arzu", "Ismayilova", "arzu@mail.com", "0555556677", 900.0));
        customers.add(new CustomerEntity(6L, "Samir", "Quliyev", "samir@mail.com", "0776667788", 200.0));
        customers.add(new CustomerEntity(7L, "Aqil", "Rzayev", "aqil@mail.com", "0507778899", 510.0));
        customers.add(new CustomerEntity(8L, "Ramil", "Hajiyev", "ramil@mail.com", "0708889900", 100.0));
        customers.add(new CustomerEntity(9L, "Ayten", "Kerimova", "ayten@mail.com", "0519990011", 850.0));
        customers.add(new CustomerEntity(10L, "Tural", "Aliyev", "tural@mail.com", "0770001122", 480.0));
    }

    @GetMapping
    public List<CustomerEntity> getAllCustomers() {
        return customers;
    }


    @GetMapping("/{id}")
    public CustomerEntity getCustomerById(@PathVariable Long id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/search")
    public List<CustomerEntity> searchByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return customers.stream()
                .filter(c -> c.getName().toLowerCase().contains(name.toLowerCase())
                        && c.getSurname().toLowerCase().contains(surname.toLowerCase()))
                .collect(Collectors.toList());
    }

    @GetMapping("/balance-over-500")
    public List<CustomerEntity> getCustomersWithBalanceOver500() {
        return customers.stream()
                .filter(c -> c.getBalance() > 500)
                .collect(Collectors.toList());
    }

    @GetMapping("/starts-with-a")
    public List<CustomerEntity> getCustomersStartingWithA() {
        return customers.stream()
                .filter(c -> c.getName().toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
    }
}