public class Kata{
    public static boolean CheckIfFlush(String[] cards){
        int sum = 0;
        for (int indeks = 0; indeks < cards.length; indeks++) {
            if (!(indeks < cards.length - 1)) {
                break;
            }
            /////////////////////
            String[] el = cards[indeks].split("");
            String[] second = cards[indeks+1].split("");

            if (!(el[el.length-1].equals(second[second.length-1]))){
                sum++;
                break;
            }
        }
        if (sum == 0){
            return true;
        } else return false;
    }
}