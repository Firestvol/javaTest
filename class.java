import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart implements Basket {
    private Map<String, Integer> products;

    public ShoppingCart() {
        products = new HashMap<>();
    }

    @Override
    public void addProduct(String product, int quantity) {
        if (products.containsKey(product)) {
            int currentQuantity = products.get(product);
            products.put(product, currentQuantity + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    @Override
    public void removeProduct(String product) {
        products.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, quantity);
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        if (products.containsKey(product)) {
            return products.get(product);
        }
        return 0;
    }
}