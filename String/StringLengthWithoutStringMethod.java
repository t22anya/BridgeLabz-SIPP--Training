import java.util.*;

public class StringLengthWithoutStringMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next(); 

        int customLength = getStringLength(input);
        int builtInLength = input.length();

        System.out.println("Custom Length (without using length()): " + customLength);
        System.out.println("Built-in Length (using length()): " + builtInLength);
    }

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
}
