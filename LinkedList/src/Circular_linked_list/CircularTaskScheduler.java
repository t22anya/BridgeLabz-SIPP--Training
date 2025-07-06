import java.util.Scanner;

class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    Task head = null;
    Task current = null;
    Scanner sc = new Scanner(System.in);

    public void addAtBeginning() {
        Task newTask = createTask();
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            newTask.next = head;
            temp.next = newTask;
            head = newTask;
        }
        System.out.println("Task added at beginning.");
    }

    public void addAtEnd() {
        Task newTask = createTask();
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newTask;
            newTask.next = head;
        }
        System.out.println("Task added at end.");
    }

    public void addAtPosition(int position) {
        if (position <= 1) {
            addAtBeginning();
            return;
        }
        Task newTask = createTask();
        Task temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newTask.next = temp.next;
        temp.next = newTask;
        System.out.println("Task added at position " + position);
    }

    public void removeById(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Task temp = head, prev = null;

        // If head is to be deleted
        if (head.id == id) {
            if (head.next == head) {
                head = null;
            } else {
                Task last = head;
                while (last.next != head) last = last.next;
                head = head.next;
                last.next = head;
            }
            System.out.println("Task removed.");
            return;
        }

        do {
            prev = temp;
            temp = temp.next;
            if (temp.id == id) {
                prev.next = temp.next;
                System.out.println("Task removed.");
                return;
            }
        } while (temp != head);

        System.out.println("Task ID not found.");
    }

    public void viewCurrentAndMoveNext() {
        if (current == null) {
            current = head;
        }
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        printTask(current);
        current = current.next;
    }

    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        System.out.println("\n--- All Tasks ---");
        Task temp = head;
        do {
            printTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                printTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No task with given priority.");
    }

    private Task createTask() {
        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Priority (1-5): ");
        int priority = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Due Date (DD-MM-YYYY): ");
        String dueDate = sc.nextLine();
        return new Task(id, name, priority, dueDate);
    }

    private void printTask(Task t) {
        System.out.println("ID: " + t.id + ", Name: " + t.name + ", Priority: " + t.priority + ", Due: " + t.dueDate);
    }
}

public class CircularTaskScheduler {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Task Scheduler ---");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task and Move to Next");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: scheduler.addAtBeginning(); break;
                case 2: scheduler.addAtEnd(); break;
                case 3:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    scheduler.addAtPosition(pos);
                    break;
                case 4:
                    System.out.print("Enter Task ID to remove: ");
                    int id = sc.nextInt();
                    scheduler.removeById(id);
                    break;
                case 5: scheduler.viewCurrentAndMoveNext(); break;
                case 6: scheduler.displayAllTasks(); break;
                case 7:
                    System.out.print("Enter Priority to search: ");
                    int priority = sc.nextInt();
                    scheduler.searchByPriority(priority);
                    break;
                case 8: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }

        } while (choice != 8);
    }
}
