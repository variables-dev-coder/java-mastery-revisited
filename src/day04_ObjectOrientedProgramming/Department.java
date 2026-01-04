package day04_ObjectOrientedProgramming;

public class Department {
    String depName = "IT";
}

class University {
    Department dept;

    University(Department dept) {
        this.dept = dept;
    }

    public static void main(String[] args) {
        Department d = new Department();
        University u = new University(d);

        System.out.println(u.dept.depName); // IT
    }
}
