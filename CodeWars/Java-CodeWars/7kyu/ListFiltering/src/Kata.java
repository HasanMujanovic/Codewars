import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        List<Object> listInteger = list.stream().
                filter(x -> x instanceof Integer).
                collect(Collectors.toList());
        return listInteger;
    }
}