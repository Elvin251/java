package az.developia.demo2.Lesson51Homework.Task3;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/accounts")
@CrossOrigin(origins = "*")
public class AccountRestController {

    private List<AccountEntity> accounts = new ArrayList<>(List.of(
            new AccountEntity(1L, "4169 1234 5678 9001", 1200.50, "Elvin", "Həsənov"),
            new AccountEntity(2L, "4169 9876 5432 1001", 500.00, "Aysel", "Quliyeva"),
            new AccountEntity(3L, "4169 2222 3333 4444", 2500.75, "Ramil", "Əliyev")
    ));

    @GetMapping
    public List<AccountEntity> getAllAccounts() {
        return accounts;
    }

    @GetMapping("/max-balance")
    public AccountEntity getMaxBalanceAccount() {
        return accounts.stream()
                .max(Comparator.comparingDouble(AccountEntity::getBalance))
                .orElse(null);
    }

    @GetMapping("/search")
    public List<AccountEntity> searchByCardAndBalance(@RequestParam String cardNumber, @RequestParam double balance) {
        return accounts.stream()
                .filter(a -> a.getCardNumber().contains(cardNumber) && a.getBalance() == balance)
                .toList();
    }
}