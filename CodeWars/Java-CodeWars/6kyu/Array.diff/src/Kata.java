import java.util.Arrays;
public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        for (int i : b){
            a = Arrays.stream(a).filter(x -> x!=i).toArray();
        }
        return a;

    }

}