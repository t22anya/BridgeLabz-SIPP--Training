public class Armstrong {
    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = String.valueOf(n).length();
        while (temp != 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
