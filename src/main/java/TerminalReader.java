import java.util.Scanner;

public class TerminalReader {
    final static private Scanner scanner = new Scanner(System.in);
    public static String readString(String message) {
        System.out.println(message);

        return scanner.next();
    }

    static float readFloat(String message) {
        System.out.println(message);

        String stringValue = scanner.next();

        float resultValue;
        try {
            resultValue = Float.parseFloat(stringValue);
        } catch (NumberFormatException e) {
            System.out.printf("\"%s\" не является числом%n", stringValue);

            return readFloat(message);
        }


        return resultValue;
    }

    static int readInt(String message) {
        System.out.println(message);

        String stringValue = scanner.next();

        int resultValue;
        try {
            resultValue = Integer.parseInt(stringValue);
        } catch (NumberFormatException e) {
            System.out.printf("\"%s\" не является числом%n", stringValue);

            return readInt(message);
        }


        return resultValue;
    }
}
