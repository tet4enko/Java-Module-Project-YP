import java.util.ArrayList;

public class Calculator {
    private final int personsCount;
    private final ArrayList<Product> products = new ArrayList<>();

    private float totalSum = 0;

    Calculator(int count) {
        personsCount = count;
    }

    public void add(Product product) {
        products.add(product);

        totalSum += product.price;

        System.out.println("Товар успешно добавлен.");
    }

    public void showAllProducts() {
        System.out.println("Добавленные товары:");

        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void showSumByPerson() {
        System.out.printf(
                "Каждый человек должен заплатить по %s.%n",
                PriceFormatter.getHumanizedPrice(totalSum / personsCount)
        );
    }
}
