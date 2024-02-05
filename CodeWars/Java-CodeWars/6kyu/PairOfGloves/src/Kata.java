import java.util.Arrays;

class Kata {
    public static int numberOfPairs(String[] gloves) {
        String[] noDuplicate = Arrays.stream(gloves).distinct().toArray(String[]::new);

        int pairs = 0;

        for (String s : noDuplicate) {
            int flag = 0;
            for (String glove : gloves) {
                System.out.println(s.equals(glove));
                if (s.equals(glove)) {
                    flag++;
                    if (flag == 2) {
                        pairs++;
                        flag = 0;
                    }
                }
            }
        }
        return pairs;
    }
}