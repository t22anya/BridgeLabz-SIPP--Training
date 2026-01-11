import java.util.*;

public class LeadingSpace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] indices = getIndices(input);
        String customTrimmed = (indices[0] <= indices[1]) ? customString(input, indices[0], indices[1]) : "";

        String builtInTrimmed = input.trim();

        boolean areEqual = Compare(customTrimmed, builtInTrimmed);

        System.out.println("Custom Trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in Trimmed: '" + builtInTrimmed + "'");
        System.out.println("Are both equal? " + areEqual);
    }

    public static int[] getIndices(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String customString(String str, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++) {
            res += str.charAt(i);
        }
        return res;
    }

    public static boolean Compare(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
