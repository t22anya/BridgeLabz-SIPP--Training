import java.util.*;

public class RotateList<T> {

    public List<T> rotate(List<T> list, int k) {
        int n = list.size();
        k %= n;
        List<T> rotated = new ArrayList<>();
        rotated.addAll(list.subList(k, n));
        rotated.addAll(list.subList(0, k));
        return rotated;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RotateList<String> rotator = new RotateList<>();

        System.out.println("Enter elements:");
        String[] input = sc.nextLine().split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(input));

        System.out.print("Enter rotate-by value: ");
        int k = sc.nextInt();

        List<String> result = rotator.rotate(list, k);
        System.out.println("Rotated List: " + result);
    }
}
