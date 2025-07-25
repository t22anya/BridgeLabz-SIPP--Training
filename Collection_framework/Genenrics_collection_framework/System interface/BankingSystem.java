import java.util.*;

public class BankingSystem {

    static class WithdrawalRequest<K> {
        K accountNumber;
        double amount;

        public WithdrawalRequest(K accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }
    }

    public static <K> void processWithdrawals(Map<K, Double> accounts, Queue<WithdrawalRequest<K>> queue) {
        while (!queue.isEmpty()) {
            WithdrawalRequest<K> request = queue.poll();
            if (accounts.containsKey(request.accountNumber)) {
                double balance = accounts.get(request.accountNumber);
                if (balance >= request.amount) {
                    accounts.put(request.accountNumber, balance - request.amount);
                    System.out.println("✅ Withdrawal of ₹" + request.amount + " from " + request.accountNumber);
                } else {
                    System.out.println("❌ Insufficient balance in account " + request.accountNumber);
                }
            } else {
                System.out.println("❌ Account " + request.accountNumber + " not found");
            }
        }
    }

    public static <K, V extends Comparable<V>> void displaySortedAccounts(Map<K, V> map) {
        TreeMap<V, K> sortedMap = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("\n🏦 Accounts sorted by balance (high to low):");
        for (Map.Entry<V, K> entry : sortedMap.entrySet()) {
            System.out.println(entry.getValue() + " => ₹" + entry.getKey());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> accounts = new HashMap<>();
        Queue<WithdrawalRequest<String>> withdrawalQueue = new LinkedList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter account number: ");
            String acc = sc.nextLine();
            System.out.print("Enter balance: ");
            double bal = sc.nextDouble();
            sc.nextLine();
            accounts.put(acc, bal);
        }

        System.out.print("Enter number of withdrawal requests: ");
        int w = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < w; i++) {
            System.out.print("Enter account number: ");
            String acc = sc.nextLine();
            System.out.print("Enter withdrawal amount: ");
            double amt = sc.nextDouble();
            sc.nextLine();
            withdrawalQueue.add(new WithdrawalRequest<>(acc, amt));
        }

        processWithdrawals(accounts, withdrawalQueue);
        displaySortedAccounts(accounts);
    }
}
