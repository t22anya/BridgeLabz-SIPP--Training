import java.util.*;

public class Splittingchecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] builtInSplit = text.split(" ");
        String[] manualSplit = manualSplitWords(text); 

        boolean match = compareArrays(builtInSplit, manualSplit);

        System.out.println("\nBuilt-in split(): " + Arrays.toString(builtInSplit));
        System.out.println("Manual split     : " + Arrays.toString(manualSplit));
        System.out.println("\nDo both methods give the same result? " + (match ? "Yes" : "No"));
    }

 
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
           
        }
        return count;
    }


    public static String[] manualSplitWords(String text) {
        int len = getLength(text);
        int wordCount = 0;

        // Count number of words
        boolean inWord = false;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                inWord = true;
                wordCount++;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        // Store words
        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    words[index++] = word;
                    word = "";
                }
            }
        }

        if (!word.equals("")) {
            words[index] = word;
        }

        return words;
    }

  
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}
