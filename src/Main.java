public class Main {
    public static void main(String[] args) {
        /* Задача 1.
        Создайте класс Product.
        Поля id (артикул, int), name (String), price (int) и category (String).
        Переопределите toString() → "Товар[артикул=..., название=..., цена=..., категория=...]".
         */
        System.out.println("Задача 1. Вывод в консоль теста набора товаров:");
        //Создаём новые элементы класса roduct
        Product cottageCheese1 = new Product(1, "Творог жирностью 5%", 250, "Кисломолочное");
        Product cottageCheese2 = new Product(1, "Творог жирностью 2%", 200, "Кисломолочное");
        Product bread = new Product(3, "Хлеб", 50, "Хлебобулочное");
        Product umbrella = new Product(4, "Зонт", 1500, "Промтовары");
        //Выводим элементы класса roduct в консоль
        System.out.println(cottageCheese1);
        System.out.println(cottageCheese2);
        System.out.println(bread);
        System.out.println(umbrella);

         /* Задача 2.
        Реализуйте сравнение товаров.
        Переопределите equals(): товары равны при совпадении id и category. Не забудьте, что null может быть у любого товара в любом строковом поле,
        поэтому такие поля удобно сравнивать через Objects.equals(string1, string2).
        Протестируйте сравнение товаров через main() — создайте несколько товаров, выведите их на экран, затем выведите на экран результат сравнения попарно.
         */
        System.out.println("\nЗадача 2. Сравнение введённых товаров:");
        System.out.println("Сравним товары:");
        //Производим сравнение элементов класса roduct
        System.out.println("Равен ли " + cottageCheese1 + cottageCheese2 + " если их id и категория совпадают?\n" + cottageCheese1.equals(cottageCheese2));
        System.out.println("Равен ли " + cottageCheese1 + bread + " если их id и категория совпадают?\n" + cottageCheese1.equals(bread));
        System.out.println("Равен ли " + cottageCheese2 + bread + " если их id и категория совпадают?\n" + cottageCheese2.equals(bread));
        System.out.println("Равен ли " + bread + umbrella + " если их id и категория совпадают?\n" + bread.equals(umbrella));

        /* Задача 3.
        3.1. Создайте класс Order. Поля customer (String), массив Product - basket.
        Переопределите toString(). Для вывода массива используйте Arrays.toString().
        Создайте и выведите на экран объект класса Order с заполненным массивом товаров.
        Обратите внимание на формат вывода массива — Arrays.toString переиспользует внутри реализованный вами метод toString() класса Product.
        */
        System.out.println("\nЗадача 3.1. Заполнение массива заказа и вывод на экран:");
        //Заполняем массив basket первым элементов
        Product[] productsPupkin = {
                new Product(bread.getId(), bread.getName(), bread.getPrice(), bread.getCategory()),
                new Product(cottageCheese1.getId(), cottageCheese1.getName(), cottageCheese1.getPrice(), cottageCheese1.getCategory()),
                new Product(umbrella.getId(), umbrella.getName(), umbrella.getPrice(), umbrella.getCategory())
        };
        System.out.println("\nВывод объекта класса Order:");
        //Создаём новый элемент класса Order и выводим его в консоль
        Order vasyaPupkin = new Order("Вася Пупкин", productsPupkin);
        System.out.println(vasyaPupkin);

        /*
        3.2. Реализуйте сравнение заказов.
        В сравнении участвуют все поля класса, включая массив — товары в нем должны полностью совпадать с последовательностью, в которой они лежат в массиве.
        Вспомните, как вы сравнивали массивы примитивов. Реализуйте аналогичный алгоритм, но сравнение сделайте не через == и !=,
        а через метод equals(), который вы реализовывали в классе Product — product1.equals(product2). Не забудьте проверить product1 на null, чтобы не получить NullPointerException.
        Протестируйте сравнение заказов через main() — создайте несколько заказов, выведите их на экран, затем выведите на экран результат сравнения попарно.
         */
        System.out.println("\nЗадача 3.2. Сравнение заказов:");
        //Создаём ещё элементы класса Order
        Product[] productsSlonova = {
                new Product(bread.getId(), bread.getName(), bread.getPrice(), bread.getCategory()),
                new Product(umbrella.getId(), umbrella.getName(), umbrella.getPrice(), umbrella.getCategory())
        };
        Order musyaSlonova = new Order("Муся Слонова", productsSlonova);

        Product[] productsIvanov = {
                new Product(bread.getId(), bread.getName(), bread.getPrice(), bread.getCategory()),
                new Product(cottageCheese1.getId(), cottageCheese1.getName(), cottageCheese1.getPrice(), cottageCheese1.getCategory()),
                new Product(umbrella.getId(), umbrella.getName(), umbrella.getPrice(), umbrella.getCategory())
        };
        Order ivanIvanov = new Order("Вася Пупкин", productsIvanov);

        Product[] productsPetrov = {
                new Product(bread.getId(), bread.getName(), bread.getPrice(), bread.getCategory()),
                new Product(umbrella.getId(), umbrella.getName(), umbrella.getPrice(), umbrella.getCategory())
        };
        Order maksimPetrov = new Order("Максим Петров", productsPetrov);
        //Производим сравнение наших заказов с выводом результата в консоль
        System.out.println("Равен ли заказ " + vasyaPupkin + " и заказ " + musyaSlonova + ": \n" + vasyaPupkin.equals(musyaSlonova));
        System.out.println("Равен ли " + ivanIvanov + " и " + vasyaPupkin + ": \n" + vasyaPupkin.equals(ivanIvanov));
        System.out.println("Равен ли заказ " + maksimPetrov + " и заказ " + musyaSlonova + ": \n" + maksimPetrov.equals(musyaSlonova));
        System.out.println("Равен ли заказ " + vasyaPupkin + " и заказ " + maksimPetrov + ": \n" + vasyaPupkin.equals(maksimPetrov));
    }
}