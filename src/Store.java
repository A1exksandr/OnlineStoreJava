import java.util.ArrayList;
import java.util.List;

public class Store {


    public static void main(String[] args) {

        Cart cart = new Cart();

        // Пример создания продуктов с использованием разных конструкторов
        Product p1 = new Product("MacBook M3", 3000.00);
        Product p2 = new Product("AirPods", 20.00);
        Product p3 = new Product("AirPods Pro", 25.00);
        Product p4 = new Product("JBL Charge 5", 50.0);

        // Используем сеттеры, чтобы добавить данные о категории и id
        p1.setId("NBK-001");
        p1.setCategory("Laptops");

        p2.setId("HPH-001");
        p2.setCategory("Headphones");

        p3.setId("HPH-002");
        p3.setCategory("Headphones");

        p4.setId("SPK-001");
        p4.setCategory("Speaker");

        // Пример вывода информации
        System.out.println("Информация о товарах:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("Скидка в 10% на ноутбук и колонку");
        p1.applyDiscount(10);
        p4.applyDiscount(10);
        System.out.println(p1);
        System.out.println(p4);

        // Пример изменения цены
        p2.setPrice(-10.0);

        p4.setName("Sony Headset");
        p4.setPrice(20.0);

        System.out.println("Товар " + p4.getName() + " цена " + p4.getPrice());
        // Цена не изменится, потому что в setPrice стоит проверка (if price > 0)
        System.out.println("Попытка выставить отрицательную цену для p2. Итоговая цена: " + p2.getPrice());

        // Продемонстрируем работу со статическим счётчиком
        System.out.println("Всего продуктов создано: " + Product.getTotalProducts());

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);

        cart.printCartDetails();
        System.out.println("Итоговая стоимость: " + cart.getTotalCost());

        System.out.println("Наушники идут в подарок.");

        cart.removeProduct(p2);
        System.out.println("Итоговая стоимость: " + cart.getTotalCost());

        // Работа с обобщённым заказом
        GenericOrder<Product> productOrder = new GenericOrder<>();
        productOrder.addItem(p1); // Используем тот же объект
        productOrder.addItem(new Product("Smartphone", 800.00)); // Новый продукт
        productOrder.printOrder();
        productOrder.removeItem(p1); // Удаляем продукт из заказа
        productOrder.printOrder();
    }

    private static Cart getCart(Cart cart) {
        return cart;
    }
}
