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
        // Цена не изменится, потому что в setPrice стоит проверка (if price > 0)
        System.out.println("Попытка выставить отрицательную цену для p2. Итоговая цена: " + p2.getPrice());

        // Продемонстрируем работу со статическим счётчиком
        System.out.println("Всего продуктов создано: " + Product.getTotalProducts());

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.printCartDetails();
        System.out.println("Итоговая стоимость: " + cart.getTotalCost());

        System.out.println("Наушники идут в подарок.");

        cart.removeProduct(p2);
        System.out.println("Итоговая стоимость: " + cart.getTotalCost());

        /*
         * Типичные ошибки:
         * - Забывать вызвать конструктор или не понимать, что без конструктора нельзя создать объект.
         * - Забывать про ключевое слово new при создании объектов.
         * - Неправильно обращаются к статическим методам/полям (надо через имя класса, а не через объект).
         */

        // --- ЗАДАНИЕ ДЛЯ САМОСТОЯТЕЛЬНОЙ ПРАКТИКИ ---
        /*
         * 1) Создайте ещё один объект Product (p4) со своими данными (например, "Колонка", цена 50.0).
         *    - Задай ему уникальный id и категорию, выведите в консоль.
         * 2) Попробуй изменить имя, цену и категорию этого нового объекта через сеттеры
         *    и снова выведи результат, чтобы увидеть изменения.
         * 3) Добавь метод в класс Product, например, applyDiscount(double percent),
         *    который будет уменьшать цену товара на заданный процент.
         *    - Например, если цена была 100, и discount = 10, новая цена будет 90.
         *    - Проверь работу этого метода на созданных объектах.
         *
         * 4) Создай класс Cart (корзина), который будет содержать список (или массив) продуктов.
         *    - В классе Cart пропиши поле private List<Product> items (или private Product[] items).
         *    - Реализуй метод addProduct(Product product), который добавляет продукт в коллекцию/массив.
         *    - Реализуй метод removeProduct(Product product), который удаляет продукт из коллекции/массива (если есть).
         *    - Реализуй метод getTotalCost(), который возвращает суммарную стоимость всех товаров в корзине.
         *    - По желанию: метод printCartDetails(), который выводит список товаров в корзине и их цены.
         *    - P.S Можешь модифицировать под свои нужды (заменить ArrayList на простой массив и т.д.) для простоты
         *
         * 5) В этом же методе main создай объект Cart,
         *    добавь в него несколько продуктов (p1, p2, p3, p4),
         *    выведи в консоль содержимое корзины и итоговую стоимость.
         *
         * 6) (опционально, если хочешь посложнее самостоятельно поработать):
         *    - Сделай возможность применения скидки ко всем товарам в корзине (например, метод applyDiscountToAll(double percent)).
         *    - Реализуй проверку наличия товара перед удалением (чтобы не было ошибок).
         *    - Продумай, что будет, если корзина пустая (возвращать 0 при getTotalCost() или выводить сообщение).
         */
    }
    private static Cart getCart(Cart cart) {
        return cart;
    }
}
