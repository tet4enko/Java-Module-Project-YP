public class PriceFormatter {
    public static String getHumanizedPrice(float price) {
        String rounded = String.format("%.2f", price).replace(',',  '.');

        // передаем уже округленное значение для гарантии консистентности
        return String.format("%s %s", rounded, getPriceSpelling(Float.parseFloat(rounded)));
    }

    private static String getPriceSpelling(float price) {
        int roundedPrice = (int) price;
        int preLastDigit = roundedPrice % 100 / 10;

        if (preLastDigit == 1) {
            return "рублей";
        }

        switch (roundedPrice % 10) {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }
}
