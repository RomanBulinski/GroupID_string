public class Reverse {

    public String reverse(String addres) {
        String result = "";
        char[] letters = addres.toCharArray();
        String tempWord = "";
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != '.') {
                tempWord = tempWord + letters[i];
            } else {
                result = tempWord + "." + result;
                tempWord = "";
            }
        }
        result = tempWord + "." + result;
        result = result.substring(0, result.length() - 1);
        return result;
    }

}
