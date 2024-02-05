public class Solution{
    public static int[] digitize(int n){
        String brojString = Integer.toString(n);

        int[] niz = new int[brojString.length()];
        for (int i = 0; i < brojString.length(); i++) {
            niz[i] = Character.getNumericValue(brojString.charAt(i));
        }
        return niz;
    }
}