import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static int findEvenIndex(int[] arr) {
        if ((Arrays.stream(arr).sum()) - arr[0] == 0){
            return 0;
        }

        List<Integer> list = Arrays.stream(arr).boxed().toList();
        for (int i = 1; i < list.size(); i++){
            List<Integer> listFirst = new ArrayList<>();
            List<Integer> listSecond = new ArrayList<>();
            int sumFirst = 0;
            int sumSecond = 0;
            listFirst = list.subList(0, i);
            listSecond = list.subList(i + 1,list.size());

            sumFirst = listFirst.stream().mapToInt(Integer::intValue).sum();
            sumSecond = listSecond.stream().mapToInt(Integer::intValue).sum();

            if (sumFirst == sumSecond){
                return i;
            }
        }
        return -1;

    }
}