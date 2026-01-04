package day04_ObjectOrientedProgramming;

public class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return id == e.id;
    }

    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(1);

        System.out.println(e1.equals(e2));  // true
    }
}
