public class Product {
    String name;
    float price;

    Product(String productName, float productPrice) {
        name = productName;
        price = productPrice;
    }

    static Product read() {
        String name = TerminalReader.readString("Введите название товара:");
        float price;

        while (true) {
            price = TerminalReader.readFloat("Введите цену товара:");

            if (price >= 0) {
                break;
            }

            System.out.println("Цена не должна быть отрицательным числом!");
        }

        return new Product(name, price);
    }

    @Override
    public String toString() {
        return String.format("– %s: %s", name, PriceFormatter.getHumanizedPrice(price));
    }
}
