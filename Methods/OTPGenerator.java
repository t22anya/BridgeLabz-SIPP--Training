import java.util.*;

public class OTPGenerator {

    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otps) System.out.println(otp);

        boolean unique = areOTPsUnique(otps);
        System.out.println("All OTPs Unique: " + unique);
    }
}
