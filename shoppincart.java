**ShoppingCart.java:**

```java
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private User user;

    public ShoppingCart(User user) {
        this.user = user;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }
}

