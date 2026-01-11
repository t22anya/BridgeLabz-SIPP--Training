import java.util.*;

public class ShortestAndLongest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengths = getWordsWithLengths(words);
        int[] result = findShortestAndLongest(wordLengths);

        System.out.println("Shortest Word: " + wordLengths[result[0]][0]);
        System.out.println("Longest Word: " + wordLengths[result[1]][0]);
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
        for (char c : word.toCharArray()) {
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

    public static int[] findShortestAndLongest(String[][] wordLengths) {
        int minIndex = 0, maxIndex = 0;
        int min = Integer.parseInt(wordLengths[0][1]);
        int max = Integer.parseInt(wordLengths[0][1]);

        for (int i = 1; i < wordLengths.length; i++) {
            int length = Integer.parseInt(wordLengths[i][1]);
            if (length < min) {
                min = length;
                minIndex = i;
            }
            if (length > max) {
                max = length;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }
}
