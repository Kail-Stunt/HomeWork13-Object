import java.util.Objects;

//Создаём класс Product
public class Product {
    //Объявляем поля класса
    private int id;
    private String name;
    private int price;
    private String category;

    //Создаём конструктор класса
    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //Переопределяем toString согласно задания
    @Override
    public String toString() {
        return "Товар " + this.id + ", название " + this.name + ", цена " + this.price + ", категория " + this.category;
    }

    //Переопределяем equals для корректной работы
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Product product = (Product) object;
        return id == product.id && Objects.equals(category, product.category);
    }

    //Определяем геты для полей класса
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getCategory() {
        return this.category;
    }
}