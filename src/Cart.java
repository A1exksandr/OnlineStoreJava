import java.util.List;
import java.util.ArrayList;

public class Cart {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
            products.add(product);
        }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotalCost(){
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void printCartDetails() {
        System.out.println("Содержимое корзины:");
        for (Product product: products) {
            System.out.println(product);
        }
    }
}
