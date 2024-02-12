public class Product {
    String name;
    float price;

    Product(String productName, float productPrice) {
        name = productName;
        price = productPrice;
    }

    static Product read() {
        String name = TerminalReader.readString("Введите название товара:");
        float price = TerminalReader.readFloat("Введите цену товара:");

        return new Product(name, price);
    }

    @Override
    public String toString() {
        return String.format("– %s: %s", name, PriceFormatter.getHumanizedPrice(price));
    }
}
