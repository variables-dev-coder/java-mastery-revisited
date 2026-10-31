package polymorphism;


class Student {

    void calculateResult() {
        System.out.println("Calculating result...");
    }
}

class EngineeringStudent extends Student {

    @Override
    void calculateResult() {
        System.out.println("Engineering result calculated");
    }
}

class MedicalStudent extends Student {

    @Override
    void calculateResult() {
        System.out.println("Medical result calculated");
    }
}

public class Main_10 {

    public static void main(String[] args) {

        Student[] students = {
                new EngineeringStudent(),
                new MedicalStudent()
        };

        for (Student student : students) {
            student.calculateResult();
        }
    }
}

