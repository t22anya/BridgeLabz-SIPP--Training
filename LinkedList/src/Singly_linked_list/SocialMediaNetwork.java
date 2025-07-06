import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    User next;

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class SocialMedia {
    User head = null;
    Scanner sc = new Scanner(System.in);

    public void addUser() {
        System.out.print("Enter User ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (findUserById(id) != null) {
            System.out.println("User ID already exists.");
            return;
        }

        User newUser = new User(id, name, age);
        newUser.next = head;
        head = newUser;

        System.out.println("User added.");
    }

    public void addFriendConnection(int id1, int id2) {
        User user1 = findUserById(id1);
        User user2 = findUserById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIds.contains(id2)) user1.friendIds.add(id2);
        if (!user2.friendIds.contains(id1)) user2.friendIds.add(id1);

        System.out.println("Friend connection added.");
    }

    public void removeFriendConnection(int id1, int id2) {
        User user1 = findUserById(id1);
        User user2 = findUserById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIds.remove(Integer.valueOf(id2));
        user2.friendIds.remove(Integer.valueOf(id1));

        System.out.println("Friend connection removed.");
    }

    public void findMutualFriends(int id1, int id2) {
        User user1 = findUserById(id1);
        User user2 = findUserById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User(s) not found.");
            return;
        }

        System.out.println("Mutual Friends between " + user1.name + " and " + user2.name + ":");
        for (int fid : user1.friendIds) {
            if (user2.friendIds.contains(fid)) {
                User f = findUserById(fid);
                System.out.println("ID: " + f.userId + ", Name: " + f.name);
            }
        }
    }

    public void displayFriends(int id) {
        User user = findUserById(id);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println(user.name + "'s Friends:");
        for (int fid : user.friendIds) {
            User f = findUserById(fid);
            System.out.println("ID: " + f.userId + ", Name: " + f.name);
        }
    }

    public void searchUser() {
        System.out.print("Search by (1) ID or (2) Name: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter User ID: ");
            int id = sc.nextInt();
            User user = findUserById(id);
            if (user != null) printUser(user);
            else System.out.println("User not found.");
        } else {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            boolean found = false;
            User temp = head;
            while (temp != null) {
                if (temp.name.equalsIgnoreCase(name)) {
                    printUser(temp);
                    found = true;
                }
                temp = temp.next;
            }
            if (!found) System.out.println("User not found.");
        }
    }

    public void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println("User ID: " + temp.userId + ", Name: " + temp.name + ", Friends: " + temp.friendIds.size());
            temp = temp.next;
        }
    }

    private User findUserById(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    private void printUser(User u) {
        System.out.println("User ID: " + u.userId + ", Name: " + u.name + ", Age: " + u.age);
    }

    public void displayAllUsers() {
        User temp = head;
        while (temp != null) {
            printUser(temp);
            temp = temp.next;
        }
    }
}

public class SocialMediaNetwork {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Social Media Friend Manager ---");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Find Mutual Friends");
            System.out.println("5. Display Friends of User");
            System.out.println("6. Search User by ID or Name");
            System.out.println("7. Count Friends of All Users");
            System.out.println("8. Display All Users");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: sm.addUser(); break;
                case 2:
                    System.out.print("Enter first User ID: ");
                    int id1 = sc.nextInt();
                    System.out.print("Enter second User ID: ");
                    int id2 = sc.nextInt();
                    sm.addFriendConnection(id1, id2);
                    break;
                case 3:
                    System.out.print("Enter first User ID: ");
                    int uid1 = sc.nextInt();
                    System.out.print("Enter second User ID: ");
                    int uid2 = sc.nextInt();
                    sm.removeFriendConnection(uid1, uid2);
                    break;
                case 4:
                    System.out.print("Enter first User ID: ");
                    int mid1 = sc.nextInt();
                    System.out.print("Enter second User ID: ");
                    int mid2 = sc.nextInt();
                    sm.findMutualFriends(mid1, mid2);
                    break;
                case 5:
                    System.out.print("Enter User ID: ");
                    int fid = sc.nextInt();
                    sm.displayFriends(fid);
                    break;
                case 6: sm.searchUser(); break;
                case 7: sm.countFriends(); break;
                case 8: sm.displayAllUsers(); break;
                case 9: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 9);
    }
}
