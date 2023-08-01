**OrderService.java:**

```java
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderService {
    private List<Order> orders;
    private int nextOrderId;

    public OrderService() {
        this.orders = new ArrayList<>();
        this.nextOrderId = 1;
    }

    public Order createOrder(User user, List<Product> products) {
        Order order = new Order(nextOrderId++, new Date(), user, products);
        orders.add(order);
        return order;
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
