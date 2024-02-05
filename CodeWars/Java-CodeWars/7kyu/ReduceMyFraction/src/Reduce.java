public class Reduce{
    public static int[] myFraction(int[] fractions){
        int delilac = 1;

        for (int i = 1; i<fractions[0] ; i++){
            if (fractions[0] % i == 0 && fractions[1] % i == 0){
                delilac = i;
            }
        }
        int[] finalNiz = new int[2];
        finalNiz[0] = fractions[0] / delilac;
        finalNiz[1] = fractions[1] / delilac;
        return finalNiz;
    }
}