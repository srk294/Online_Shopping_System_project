**Order.java:**

```java
import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private Date orderDate;
    private User user;
    private List<Product> products;

    public Order(int orderId, Date orderDate, User user, List<Product> products) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.user = user;
        this.products = products;
    }

    // Getters and setters
}
