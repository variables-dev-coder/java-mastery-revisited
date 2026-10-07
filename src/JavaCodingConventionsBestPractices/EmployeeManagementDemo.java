package JavaCodingConventionsBestPractices;

import java.util.Objects;

/*
 * ============================================================
 * JAVA CODING CONVENTIONS & BEST PRACTICES
 * ============================================================
 *
 * This example demonstrates:
 *
 * 1. Class naming
 * 2. Method naming
 * 3. Variable naming
 * 4. Constant naming
 * 5. Package/import convention
 * 6. Indentation
 * 7. Meaningful names
 * 8. private fields
 * 9. final fields
 * 10. Encapsulation
 * 11. Constructor validation
 * 12. Avoiding magic numbers
 * 13. Small methods
 * 14. Boolean method naming
 * 15. Avoiding duplicate code
 * 16. Objects.equals()
 * 17. Proper exception handling
 * 18. Comments
 * 19. Single Responsibility
 * 20. Immutable-style fields
 */
public class EmployeeManagementDemo {

    /*
     * CONSTANT
     *
     * Convention:
     * UPPER_SNAKE_CASE
     *
     * static → belongs to the class
     * final  → value cannot be changed
     *
     * This constant belongs to the application.
     */
    private static final String COMPANY_NAME = "ABC Technologies";


    public static void main(String[] args) {

        /*
         * --------------------------------------------------------
         * VARIABLE NAMING
         * --------------------------------------------------------
         *
         * Convention:
         * camelCase
         *
         * Good:
         * employeeName
         * monthlySalary
         * employeeAge
         *
         * Bad:
         * EmployeeName
         * employee_name
         * x
         */
        String employeeName = "Rahul";

        int employeeAge = 25;

        double monthlySalary = 50_000;


        /*
         * --------------------------------------------------------
         * CONSTANT USAGE
         * --------------------------------------------------------
         *
         * Instead of hardcoding:
         *
         * "ABC Technologies"
         *
         * we use:
         *
         * COMPANY_NAME
         *
         * This avoids unnecessary duplication.
         */
        System.out.println("Company: " + COMPANY_NAME);


        /*
         * --------------------------------------------------------
         * OBJECT CREATION
         * --------------------------------------------------------
         *
         * Variable name "employee" is meaningful.
         */
        Employee employee = new Employee(
                employeeName,
                employeeAge,
                monthlySalary
        );


        /*
         * --------------------------------------------------------
         * METHOD NAMING
         * --------------------------------------------------------
         *
         * Method:
         *
         * calculateAnnualSalary()
         *
         * Convention:
         * camelCase
         *
         * Method name clearly describes the action.
         */
        double annualSalary = employee.calculateAnnualSalary();

        System.out.println("Annual Salary: " + annualSalary);


        /*
         * --------------------------------------------------------
         * BOOLEAN METHOD NAMING
         * --------------------------------------------------------
         *
         * isHighEarner() returns true/false.
         *
         * Boolean methods commonly use:
         *
         * is...
         * has...
         * can...
         * should...
         */
        if (employee.isHighEarner()) {

            System.out.println("Employee is a high earner.");

        } else {

            System.out.println("Employee is a normal earner.");
        }


        /*
         * --------------------------------------------------------
         * SMALL METHOD / SINGLE RESPONSIBILITY
         * --------------------------------------------------------
         *
         * getSalaryCategory() has one clear responsibility:
         *
         * Return salary category.
         */
        String salaryCategory = employee.getSalaryCategory();

        System.out.println("Salary Category: "
                + salaryCategory);


        /*
         * --------------------------------------------------------
         * ENCAPSULATION
         * --------------------------------------------------------
         *
         * name is private inside Employee.
         *
         * We cannot directly do:
         *
         * employee.name
         *
         * Instead, we use:
         *
         * employee.getName()
         */
        System.out.println("Employee Name: "
                + employee.getName());


        System.out.println("Employee Age: "
                + employee.getAge());


        System.out.println("Monthly Salary: "
                + employee.getMonthlySalary());


        /*
         * --------------------------------------------------------
         * OBJECTS.EQUALS()
         * --------------------------------------------------------
         *
         * Useful for safe object comparison.
         *
         * It handles null safely.
         */
        if (Objects.equals(employee.getName(), "Rahul")) {

            System.out.println("Employee name matched.");
        }


        /*
         * --------------------------------------------------------
         * FINAL / IMMUTABILITY IDEA
         * --------------------------------------------------------
         *
         * Employee fields are final.
         *
         * Therefore, after construction:
         *
         * name
         * age
         * monthlySalary
         *
         * cannot be reassigned.
         */
        System.out.println("Employee object created successfully.");
    }
}


/*
 * ============================================================
 * EMPLOYEE CLASS
 * ============================================================
 *
 * CLASS NAMING:
 *
 * PascalCase
 *
 * Employee
 * BankAccount
 * PaymentService
 * UserController
 *
 * All follow PascalCase.
 */
class Employee {


    /*
     * ========================================================
     * CONSTANTS
     * ========================================================
     *
     * Constants use:
     *
     * UPPER_SNAKE_CASE
     *
     * These constants belong to Employee because they are
     * related to Employee's business rules.
     */


    // Minimum valid employee age.
    private static final int MINIMUM_EMPLOYEE_AGE = 18;


    // Number of months in one year.
    private static final int MONTHS_IN_YEAR = 12;


    // Annual salary threshold.
    private static final double HIGH_SALARY_THRESHOLD = 500_000;


    /*
     * ========================================================
     * FIELDS
     * ========================================================
     *
     * PRIVATE:
     *
     * Protects the internal state of the object.
     *
     * FINAL:
     *
     * These values cannot be reassigned after construction.
     *
     * This is part of ENCAPSULATION.
     */


    private final String name;

    private final int age;

    private final double monthlySalary;


    /*
     * ========================================================
     * CONSTRUCTOR
     * ========================================================
     *
     * Constructor name must be exactly the same as class name.
     *
     * Employee(...)
     */
    public Employee(
            String name,
            int age,
            double monthlySalary) {


        /*
         * ====================================================
         * INPUT VALIDATION
         * ====================================================
         *
         * Best practice:
         *
         * Don't allow invalid objects to be created.
         */


        /*
         * Validate employee name.
         */
        if (name == null || name.isBlank()) {

            throw new IllegalArgumentException(
                    "Employee name cannot be empty"
            );
        }


        /*
         * Validate employee age.
         *
         * We don't write:
         *
         * if (age < 18)
         *
         * because 18 would be a MAGIC NUMBER.
         *
         * Instead:
         *
         * MINIMUM_EMPLOYEE_AGE
         */
        if (age < MINIMUM_EMPLOYEE_AGE) {

            throw new IllegalArgumentException(
                    "Employee must be at least "
                            + MINIMUM_EMPLOYEE_AGE
                            + " years old"
            );
        }


        /*
         * Validate salary.
         */
        if (monthlySalary < 0) {

            throw new IllegalArgumentException(
                    "Salary cannot be negative"
            );
        }


        /*
         * ====================================================
         * ASSIGN VALUES
         * ====================================================
         *
         * "this" means the current object.
         *
         * this.name
         *      ↓
         * object's field
         *
         * name
         *      ↓
         * constructor parameter
         */
        this.name = name;

        this.age = age;

        this.monthlySalary = monthlySalary;
    }


    /*
     * ========================================================
     * METHOD: calculateAnnualSalary()
     * ========================================================
     *
     * METHOD NAMING:
     *
     * camelCase
     *
     * The method name clearly describes an action.
     *
     * SINGLE RESPONSIBILITY:
     *
     * This method only calculates annual salary.
     */
    public double calculateAnnualSalary() {

        return monthlySalary * MONTHS_IN_YEAR;
    }


    /*
     * ========================================================
     * METHOD: isHighEarner()
     * ========================================================
     *
     * BOOLEAN METHOD NAMING:
     *
     * Starts with "is".
     *
     * Returns:
     *
     * true
     * OR
     * false
     */
    public boolean isHighEarner() {

        /*
         * We don't write:
         *
         * return calculateAnnualSalary() > 500000;
         *
         * because 500000 would be a MAGIC NUMBER.
         *
         * Instead:
         *
         * HIGH_SALARY_THRESHOLD
         */
        return calculateAnnualSalary()
                > HIGH_SALARY_THRESHOLD;
    }


    /*
     * ========================================================
     * METHOD: getSalaryCategory()
     * ========================================================
     *
     * SMALL METHOD:
     *
     * One responsibility:
     *
     * Determine salary category.
     */
    public String getSalaryCategory() {

        if (isHighEarner()) {

            return "HIGH";
        }

        return "NORMAL";
    }


    /*
     * ========================================================
     * GETTER METHODS
     * ========================================================
     *
     * Fields are private.
     *
     * So external code cannot directly access them.
     *
     * Instead, getters provide controlled access.
     */


    public String getName() {

        return name;
    }


    public int getAge() {

        return age;
    }


    public double getMonthlySalary() {

        return monthlySalary;
    }
}
