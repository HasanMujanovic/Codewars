import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static String camelCase(String input) {
        String[] niz = input.split("");
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(niz));
        int counter = 0;

        for (int i = 0; i < niz.length; i++){
            if (niz.length > 1&& niz[i] == niz[i].toUpperCase()){
                lista.add(i + counter," ");
                counter++;
            }
        }
        String listString = String.join("", lista);
        return listString;

    }
}