import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create a sample user and products
        User user1 = new User(1, "John Doe", "john@example.com", "pass123");
        Product product1 = new Product(101, "Laptop", 799.99);
        Product product2 = new Product(102, "Phone", 399.99);

        // Create a shopping cart and add products to it
        ShoppingCart cart = new ShoppingCart(user1);
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Create an order service and place an order
        OrderService orderService = new OrderService();
        Order order = orderService.createOrder(user1, cart.getProducts());

        // Display the order details
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("User: " + order.getUser().getName());
        System.out.println("Products: ");
        for (Product product : order.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
}
