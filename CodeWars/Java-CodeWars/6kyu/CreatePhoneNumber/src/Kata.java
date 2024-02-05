import java.util.Arrays;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String[] stringNiz = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        String stringInt = String.join("", stringNiz);
        String result = "(" + stringInt.substring(0, 3) + ") " +
                stringInt.substring(3, 6) + "-" + stringInt.substring(6);
        return result;
    }
}