public class Product {

    // Уникальный идентификатор товара (например, штрих-код, артикул и т.д.)
    private String id;

    // Название товара
    private String name;

    // Цена товара
    private double price;

    // Категория товара (например, "Электроника", "Одежда" и т.д.)
    private String category;

    // Статическое поле, хранящее общее количество созданных продуктов
    // Статическое поле totalProducts увеличивается в каждом конструкторе. Это означает, что каждый раз, когда мы создаём новый объект Product, счётчик растёт. Важно понимать, что статические поля принадлежат самому классу, а не конкретному объект
    private static int totalProducts = 0;

    /**
     * Конструктор с четырьмя параметрами
     * @param id        уникальный идентификатор товара
     * @param name      название товара
     * @param price     цена товара
     * @param category  категория товара
     */
    public Product(String id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
        setPrice(price); // используем set, чтобы сразу применялись проверки
        totalProducts++;
    }

    // Конструктор с двумя параметрами
    public Product(String name, double price) {
        this("DEFAULT_ID", name, price, "NoCategory");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        // Можно добавить проверку валидации, чтобы id не был пустым/нулевым
        if (id != null && !id.isEmpty()) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    // Сеттер для имени
    public void setName(String name) {
        // Можно добавить проверку на минимум символов, запрещённые символы и т.д.
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    // Сеттер для цены
    public void setPrice(double price) {
        // Типичная проверка, чтобы цена не была отрицательной
        if(price > 0) {
            this.price = price;
        } else {
            // Если передали некорректную цену, например, -10,
            // можно либо выбрасывать исключение, либо игнорировать и не менять значение,
            // либо устанавливать какое-то минимальное значение.
            // Пока просто оставим как есть (не меняем).
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        // Аналогично можно проверить не пустое ли значение
        this.category = category;
    }

    // Геттер для статического поля
    public static int getTotalProducts() {
        return totalProducts;
    }

    // Переопределение toString() для удобного вывода информации о продукте
    // Если не переопределять метод toString(), вследствие чего вывод в консоль для объекта будет выглядеть неинформативно (например, Product@1f32e575).
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
