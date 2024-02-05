import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WeightSort {

    public static String orderWeight(String strng) {
        if (strng.isEmpty()){
            return strng;
        }
        List<String> strings = new ArrayList<>(List.of(strng.split(" ")));
        Collections.sort(strings);
        List<Integer> ints1 = new ArrayList<>();
        for (String s : strings){
            int[] ints2 = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();
            ints1.add(Arrays.stream(ints2).sum());
        }
        Collections.sort(ints1);
        String[] resultArr = new String[ints1.size()];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<ints1.size(); i++){
            for (int j = 0; j< strings.size(); j++){
                int[] ints3 = Arrays.stream(strings.get(j).split("")).mapToInt(Integer::parseInt).toArray();
                int summedUp = (Arrays.stream(ints3).sum());
                if (ints1.get(i) == summedUp){
                    stringBuilder.append(strings.get(j) + " ");
                    strings.remove(j);
                    break;
                }
            }
        }
        String result = stringBuilder.toString().trim();
        return result;
    }
}