package az.developia.demo2.Lesson50Homework;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private List<Order> orders = new ArrayList<>();

    public OrderController() {
        orders.add(new Order(1L, "Ali", 150.0, OrderStatus.NEW));
        orders.add(new Order(2L, "Veli", 200.0, OrderStatus.DELIVERED));
        orders.add(new Order(3L, "Ayşe", 80.0, OrderStatus.NEW));
        orders.add(new Order(4L, "Mehmet", 300.0, OrderStatus.DELIVERED));
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orders;
    }

    @GetMapping("/new")
    public List<Order> getNewOrders() {
        return orders.stream()
                .filter(o -> o.getStatus() == OrderStatus.NEW)
                .collect(Collectors.toList());
    }

    @GetMapping("/delivered")
    public List<Order> getDeliveredOrdersAbove100() {
        return orders.stream()
                .filter(o -> o.getStatus() == OrderStatus.DELIVERED && o.getTotalAmount() > 100)
                .collect(Collectors.toList());
    }

    @GetMapping("/search")
    public List<Order> searchOrders(@RequestParam(required = false) String customerName,
                                    @RequestParam(required = false) OrderStatus status) {
        return orders.stream()
                .filter(o -> (customerName == null || o.getCustomerName().toLowerCase().contains(customerName.toLowerCase())) &&
                        (status == null || o.getStatus() == status))
                .collect(Collectors.toList());
    }
}

