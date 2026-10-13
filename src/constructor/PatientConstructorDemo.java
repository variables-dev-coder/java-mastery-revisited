package constructor;


class Patient {

    int patientId;
    String patientName;
    int age;
    String disease;
    double consultationFee;

    // 1. No-argument constructor
    Patient() {
        this(0, "Unknown", 0, "Not Assigned", 0.0);
        System.out.println("Default patient record created");
    }

    // 2. Parameterized constructor
    Patient(int patientId, String patientName, int age,
            String disease, double consultationFee) {

        if (age < 0 || consultationFee < 0) {
            throw new IllegalArgumentException(
                    "Age and consultation fee cannot be negative"
            );
        }

        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
        this.consultationFee = consultationFee;
    }

    // 3. Overloaded constructor
    Patient(int patientId, String patientName, int age) {
        this(patientId, patientName, age, "General Checkup", 500.0);
    }

    // 4. Copy constructor
    Patient(Patient other) {
        this(other.patientId, other.patientName, other.age,
                other.disease, other.consultationFee);
    }

    // Update disease
    void updateDisease(String disease) {
        this.disease = disease;
        System.out.println("Patient diagnosis updated");
    }

    // Calculate bill
    double calculateBill() {
        return consultationFee;
    }

    // Display patient details
    void display() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Consultation Fee: Rs. " + consultationFee);
        System.out.println("Total Bill: Rs. " + calculateBill());
        System.out.println("----------------------------");
    }
}

public class PatientConstructorDemo {

    public static void main(String[] args) {

        // No-argument constructor
        Patient p1 = new Patient();
        p1.display();

        // Parameterized constructor
        Patient p2 = new Patient(
                101, "Munna", 31, "Fever", 800.0
        );
        p2.display();

        // Overloaded constructor
        Patient p3 = new Patient(102, "Rahul", 28);
        p3.display();

        // Update patient diagnosis
        p2.updateDisease("Viral Fever");
        p2.display();

        // Copy constructor
        Patient p4 = new Patient(p2);
        p4.display();
    }
}

