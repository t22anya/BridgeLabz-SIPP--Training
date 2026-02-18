import java.time.LocalDate;
import java.util.*;

class Policy {
    private String policyNumber;
    private String policyHolder;
    private LocalDate expiryDate;

    public Policy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Holder: " + policyHolder + ", Expiry: " + expiryDate;
    }
}

public class InsurancePolicy{

    // Generic method to print all values from any Map<K, V>
    public static <K, V> void printMapValues(Map<K, V> map) {
        for (V value : map.values()) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Policy> hashMap = new HashMap<>();
        Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
        TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

        System.out.print("Enter number of policies: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Policy Number: ");
            String number = sc.nextLine();
            System.out.print("Enter Policy Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
            LocalDate date = LocalDate.parse(sc.nextLine());

            Policy policy = new Policy(number, name, date);

            hashMap.put(number, policy);
            linkedHashMap.put(number, policy);
            treeMap.computeIfAbsent(date, k -> new ArrayList<>()).add(policy);
        }

        System.out.println("\n Retrieve by Policy Number:");
        System.out.print("Enter policy number: ");
        String query = sc.nextLine();
        System.out.println(hashMap.getOrDefault(query, null));

        System.out.println("\n Policies expiring in next 30 days:");
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);
        NavigableMap<LocalDate, List<Policy>> upcomingPolicies = treeMap.subMap(today, true, limit, true);
        for (List<Policy> list : upcomingPolicies.values()) {
            for (Policy p : list) {
                System.out.println(p);
            }
        }

        System.out.println("\n Policies for a specific holder:");
        System.out.print("Enter holder name: ");
        String holder = sc.nextLine();
        for (Policy p : hashMap.values()) {
            if (p.getPolicyHolder().equalsIgnoreCase(holder)) {
                System.out.println(p);
            }
        }

        System.out.println("\n Removing expired policies...");
        hashMap.values().removeIf(p -> p.getExpiryDate().isBefore(today));

        System.out.println("\n Remaining policies:");
        printMapValues(hashMap);
    }
}
