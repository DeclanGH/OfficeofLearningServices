package bigoexamples;

public class SubsetProblem {
    public static void main(String[] args) {
        // setup
        String word = "Declan";

        printSubstringsOf(word);
    }

    private static void printSubstringsOf(String word) {
        char[] chars = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                System.out.println(word.substring(i, j));
            }
        }
    }
}
