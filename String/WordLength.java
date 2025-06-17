import java.util.*;

public class WordLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);

   
        String[][] wordLengthPairs = getWordsWithLengths(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (int i = 0; i < wordLengthPairs.length; i++) {
            String word = wordLengthPairs[i][0];
            int length = Integer.parseInt(wordLengthPairs[i][1]); 
            System.out.println(word + "\t\t" + length);
        }
    }


    public static String[] splitWords(String text) {
        ArrayList<String> words = new ArrayList<>();
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    words.add(currentWord);
                    currentWord = "";
                }
            }
        }

        if (!currentWord.equals("")) {
            words.add(currentWord);
        }

        return words.toArray(new String[0]);
    }

    public static int findLength(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            count++;
        }
        return count;
    }
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i])); 
        }

        return result;
    }
}

