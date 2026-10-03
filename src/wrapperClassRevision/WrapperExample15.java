package wrapperClassRevision;

import java.util.HashMap;

public class WrapperExample15 {

    public static void main(String[] args) {

        HashMap<String, Long> salaries = new HashMap<>();

        // Autoboxing: long -> Long
        salaries.put("Rahul", 45000L);
        salaries.put("Amit", 52000L);
        salaries.put("Priya", 48000L);

        System.out.println("Salaries: " + salaries);

        // Get Long object
        Long rahulSalary = salaries.get("Rahul");

        // Long -> long using longValue()
        long salary = rahulSalary.longValue();

        System.out.println("Rahul's salary: " + salary);

        // Calculate increment
        long newSalary = salary + 5000;

        // Autoboxing again: long -> Long
        salaries.put("Rahul", newSalary);

        System.out.println("Updated Salaries: " + salaries);
    }
}
