package Association_Aggregation_Composition;

// aggregation

import java.util.List;

public class Department {

    private String departmentName;

    private List<Professor> professors;

    public Department(
            String departmentName,
            List<Professor> professors) {

        this.departmentName = departmentName;
        this.professors = professors;
    }

    public void displayDepartment() {

        System.out.println("Department: " + departmentName);

        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }
}
