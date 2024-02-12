public class Main {
    private static final int MIN_PEOPLE_COUNT = 2;
    private static final String FINISH_COMMAND = "Завершить";

    static int readPersonsCount() {
        int personsCount;

        while (true) {
            personsCount = TerminalReader.readInt(
                    String.format(
                            "На скольких человек разделить счет ? (значение должно быть >=%d)",
                            MIN_PEOPLE_COUNT
                    )
            );

            if (personsCount < MIN_PEOPLE_COUNT) {
                System.out.printf(
                        "Значение должно быть >=%d !%n",
                        MIN_PEOPLE_COUNT
                );
            } else {
                break;
            }
        }

        return personsCount;
    }

    public static void main(String[] args) {
        int personsCount = readPersonsCount();

        Calculator calculator = new Calculator(personsCount);

        while (true) {
            Product product = Product.read();

            calculator.add(product);

            String command = TerminalReader.readString("Хотите добавить еще товар ? Если нет, введите \"завершить\".");

            if (command.equalsIgnoreCase(FINISH_COMMAND)) {
                break;
            }
        }

        calculator.showAllProducts();
        calculator.showSumByPerson();
    }
}