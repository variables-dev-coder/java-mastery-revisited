package Association_Aggregation_Composition;

// aggregation

import java.util.Arrays;

public class AggregationMain {

    public static void main(String[] args) {

        Professor p1 = new Professor("Rahul");
        Professor p2 = new Professor("Amit");

        Department department = new Department(
                "Computer Science",
                Arrays.asList(p1, p2)
        );

        department.displayDepartment();

        // Professor objects can still be accessed independently
        System.out.println(p1.getName());
    }
}
