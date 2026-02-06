import java.util.Arrays;
import java.util.Objects;

//Создаём класс Order
public class Order {
    //Определяем поля класса
    private String customer;
    private Product[] basket;

    //Создаём конструктор класса
    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    //Переопределяем toString согласно задания
    @Override
    public String toString() {
        return "Заказ [" + "Клиент: '" + customer + '\'' + ", Корзина: " + Arrays.toString(basket) + ']';
    }

    //Переопределяем equals согласно задания
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Order order = (Order) object;
        return customer == order.customer && Arrays.equals(basket, order.basket);
    }
}
