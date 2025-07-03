package OOPS;
import java.util.*;

// Interface
interface MedicalRecord {
    String addRecord();
    String viewRecord();
}

// Abstract Class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract double calculateBill();

    public void displayDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private int admittedDays;
    private double roomCharge;
    private double treatmentCharge;

    public InPatient(int patientId, String name, int age, int admittedDays, double roomCharge, double treatmentCharge) {
        super(patientId, name, age);
        this.admittedDays = admittedDays;
        this.roomCharge = roomCharge;
        this.treatmentCharge = treatmentCharge;
    }

    @Override
    public double calculateBill() {
        return admittedDays * roomCharge + treatmentCharge;
    }

    @Override
    public String addRecord() {
        return "InPatient record added.";
    }

    @Override
    public String viewRecord() {
        return "Viewing InPatient record.";
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public String addRecord() {
        return "OutPatient record added.";
    }

    @Override
    public String viewRecord() {
        return "Viewing OutPatient record.";
    }
}

// Main class
public class HospitalManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();

        System.out.print("Enter the number of patients: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter patient type (InPatient/OutPatient): ");
            String type = sc.next();

            System.out.print("Enter patient ID: ");
            int id = sc.nextInt();

            System.out.print("Enter patient name: ");
            String name = sc.next();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            if (type.equalsIgnoreCase("In") || type.equalsIgnoreCase("InPatient")) {
                System.out.print("Enter days admitted: ");
                int days = sc.nextInt();

                System.out.print("Enter room charge per day: ");
                double charge = sc.nextDouble();

                System.out.print("Enter treatment charge: ");
                double treatment = sc.nextDouble();

                patients.add(new InPatient(id, name, age, days, charge, treatment));
            } else if (type.equalsIgnoreCase("Out") || type.equalsIgnoreCase("OutPatient")) {
                System.out.print("Enter consultation fee: ");
                double fee = sc.nextDouble();

                patients.add(new OutPatient(id, name, age, fee));
            } else {
                System.out.println("Invalid type. Skipping...");
            }
        }

        System.out.println("\n======= Patient Summary =======");
        for (Patient p : patients) {
            p.displayDetails();
            System.out.println("Bill: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                System.out.println(m.addRecord());
                System.out.println(m.viewRecord());
            }

            System.out.println("-----------------------------");
        }
    }
}
