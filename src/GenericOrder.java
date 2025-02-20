import java.util.ArrayList;
import java.util.List;

public class GenericOrder<T> {

    private List<T> items;

    public GenericOrder() {
        this.items = new ArrayList<>();
    }

    // Добавить элемент в заказ
    public void addItem(T item) {
        items.add(item);
        System.out.println("Элемент добавлен в заказ: " + item);
    }

    // Удалить элемент из заказа
    public void removeItem(T item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Элемент удалён из заказа: " + item);
        } else {
            System.out.println("Элемент не найден в заказе: " + item);
        }
    }

    // Печать содержимого заказа
    public void printOrder() {
        System.out.println("Текущий заказ:");
        for (T item : items) {
            System.out.println(item);
        }
    }
}
