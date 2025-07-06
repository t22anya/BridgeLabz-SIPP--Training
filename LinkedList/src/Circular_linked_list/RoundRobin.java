import java.util.*;

class Process {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime = 0;
    int turnAroundTime = 0;
    Process next;

    Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private Process head = null, tail = null;
    private int totalWaitingTime = 0, totalTurnAroundTime = 0;
    private int processCount = 0;

    Scanner sc = new Scanner(System.in);

    public void addProcess() {
        System.out.print("Enter Process ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Burst Time: ");
        int bt = sc.nextInt();
        System.out.print("Enter Priority: ");
        int pr = sc.nextInt();

        Process newProcess = new Process(pid, bt, pr);

        if (head == null) {
            head = tail = newProcess;
            tail.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }

        processCount++;
        System.out.println("Process added.");
    }

    public void removeProcess(int pid) {
        if (head == null) return;

        Process current = head, prev = tail;

        do {
            if (current.pid == pid) {
                if (current == head) head = head.next;
                if (current == tail) tail = prev;
                prev.next = current.next;

                if (current == current.next) head = tail = null; // Only one node
                processCount--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int time = 0;
        Process current = head;

        System.out.println("\n--- Starting Round Robin Scheduling ---");

        while (processCount > 0) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= execTime;
                time += execTime;

                // Update waiting & turnaround time for finished process
                if (current.remainingTime == 0) {
                    current.turnAroundTime = time;
                    current.waitingTime = current.turnAroundTime - current.burstTime;
                    totalWaitingTime += current.waitingTime;
                    totalTurnAroundTime += current.turnAroundTime;

                    System.out.println("Process " + current.pid + " completed. WT: " + current.waitingTime + ", TAT: " + current.turnAroundTime);
                    removeProcess(current.pid);
                    current = current.next;
                } else {
                    System.out.println("Process " + current.pid + " executed for " + execTime + " units. Remaining: " + current.remainingTime);
                    current = current.next;
                }

                displayProcesses();
            } else {
                current = current.next;
            }
        }

        System.out.println("\nAll processes completed.");
        System.out.printf("Average Waiting Time: %.2f\n", (double) totalWaitingTime / (totalWaitingTime + totalTurnAroundTime - totalWaitingTime));
        System.out.printf("Average Turnaround Time: %.2f\n", (double) totalTurnAroundTime / (totalWaitingTime + totalTurnAroundTime - totalWaitingTime));
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }

        System.out.println("\nProcesses in Queue:");
        Process temp = head;
        do {
            System.out.println("PID: " + temp.pid + ", Remaining Time: " + temp.remainingTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}

public class RoundRobin {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Round Robin Scheduler ---");
            System.out.println("1. Add Process");
            System.out.println("2. Display Processes");
            System.out.println("3. Start Scheduling");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: scheduler.addProcess(); break;
                case 2: scheduler.displayProcesses(); break;
                case 3:
                    System.out.print("Enter Time Quantum: ");
                    int tq = sc.nextInt();
                    scheduler.simulate(tq);
                    break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }
}
