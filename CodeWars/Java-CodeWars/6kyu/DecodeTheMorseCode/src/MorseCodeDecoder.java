public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String[] morseArr = morseCode.trim().split(" ");
        StringBuilder decoded = new StringBuilder();
        int flag = 0;
        for (String s : morseArr){
            if (s.isBlank()){
                flag++;
                if (flag == 2){
                    decoded.append(" ");
                    flag = 0;
                }
            }else{
                // MorseCode is a table already preloaded on codewars
//                decoded.append(MorseCode.get(s));
            }
        }
        String result = decoded.toString();

        return result;
    }
}
