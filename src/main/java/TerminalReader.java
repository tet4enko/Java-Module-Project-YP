import java.util.Scanner;

public class TerminalReader {
    final static private Scanner scanner = new Scanner(System.in);
    public static String readString(String message) {
        System.out.println(message);

        return scanner.next();
    }

    public static float readFloat(String message) {
        float resultValue;

        while (true) {
            System.out.println(message);

            String stringValue = scanner.next();

            try {
                resultValue = Float.parseFloat(stringValue);
                break;
            } catch (NumberFormatException e) {
                System.out.printf("\"%s\" не является числом%n", stringValue);
            }
        }

        return resultValue;
    }

    public static int readInt(String message) {
        int resultValue;

        while (true) {
            System.out.println(message);

            String stringValue = scanner.next();

            try {
                resultValue = Integer.parseInt(stringValue);
                break;
            } catch (NumberFormatException e) {
                System.out.printf("\"%s\" не является числом%n", stringValue);
            }

        }

        return resultValue;
    }
}
