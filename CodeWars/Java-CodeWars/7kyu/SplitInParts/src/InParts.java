import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InParts {
    public static String splitInParts(String s, int partLength) {
        int flag = -1;

        String[] strings = s.split("");
        System.out.println(Arrays.toString(strings));

        List<String> stringList = new ArrayList<>(Arrays.stream(strings).toList());
        System.out.println(stringList);
        for (int i =0; i< stringList.size(); i++){

            flag++;
            if (flag == partLength){
                stringList.add(i," ");
                flag = -1;
            }
        }
        String s1 = String.join("", stringList);
        return s1;
    }
}