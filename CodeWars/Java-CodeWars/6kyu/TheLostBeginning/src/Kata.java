public class Kata {

    public static long beginning(String s) {

        int length = s.length();

        for (int i = 1; i <= length; i++) {
            int candidate = Integer.parseInt(s.substring(0, i));
            int current = candidate;

            StringBuilder expectedSequence = new StringBuilder();
            while (expectedSequence.length() < length) {
                expectedSequence.append(current);
                current++;
            }

            if (expectedSequence.toString().equals(s) && candidate <= 1000000000) {
                return candidate;
            }
        }

        return -1;


    }
}
