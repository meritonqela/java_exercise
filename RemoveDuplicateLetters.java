
public class RemoveDuplicateLetters {

    public static String removeDuplicateLetters(String s){
        String answer = "";
        for (int i =0; i!=s.length();i++)
        { answer = insertAlphabeticallyChar(s.charAt(i), answer); }
        return answer;}

    private static String insertAlphabeticallyChar(char c, String alpha) {
        int index = 0;
        boolean searching_for_duplicate = false;
        while (!searching_for_duplicate && index < alpha.length()) {
            if (c == alpha.charAt(index)) {
                searching_for_duplicate = true;
            } else {
                index++;
            }
        }
        if (!searching_for_duplicate){alpha += c; }
        return alpha;
    }

    public static void main (String [] args){
        System.out.println(removeDuplicateLetters("ggggiiitthhhuuubbbb"));
    }
}
