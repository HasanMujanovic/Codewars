import java.util.ArrayList;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> arrList = new ArrayList<>(List.of(arr));
        String NS = "NORTHSOUTH";
        String SN = "SOUTHNORTH";
        String WE = "WESTEAST";
        String EW = "EASTWEST";
        int flag = 1;
        while (flag==1){
            flag =0;
            for (int i = 0; i < arrList.size() - 1; i++) {
                String joined = String.join("", arrList.get(i), arrList.get(i + 1));
                if (joined.equals(NS) || joined.equals(SN) || joined.equals(WE) || joined.equals(EW)) {
                    arrList.remove(i+1);
                    arrList.remove(i);
                    i -= 1;
                    flag = 1;
                }
            }
        }
        String[] result = arrList.toArray(arrList.toArray(new String[arrList.size()]));

        return result;
    }
}