import java.util.ArrayList;
import java.util.List;

public class Modulus11 {

    public static String addCheckDigit(String number) {
        int flag = 1;
        int increaser = 2;
        int productSum = 0;

        List<String> list = new ArrayList<>(List.of(number.split("")));
        for (int i = list.size()-1 ; i >= 0; i--){

            if (flag == 7){
                flag = 1;
                increaser = 2;
            }
            productSum += Integer.parseInt(list.get(i)) * increaser;
            flag++;
            increaser++;
        }
        int remainder = productSum % 11;
        String checkDigit;
        switch (remainder){
            case 0 -> checkDigit = "0";
            case 1 -> checkDigit = "X";
            default -> checkDigit = String.valueOf(11 - remainder);
        }

        String output = number + checkDigit;
        return output;
    }
}