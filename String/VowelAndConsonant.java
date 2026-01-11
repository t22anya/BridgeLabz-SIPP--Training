import java.util.*;

public class VowelAndConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findVowelsAndConsonants(text);
        displayResult(result);
    }

    public static String getCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } 
        else {
            return "Not a Letter";
        }
    }

    public static String[][] findVowelsAndConsonants(String text) {
        String[][] data = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            data[i][0] = String.valueOf(ch);
            data[i][1] = getCharType(ch);
        }

        return data;
    }

    public static void displayResult(String[][] arr) {
        System.out.println("\nCharacter\tType");
        System.out.println("---------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("    " + arr[i][0] + "\t\t" + arr[i][1]);
        }
    }
}
