package wrapperClassRevision;

public class WrapperExample5 {

    public static void main(String[] args) {

        // Salary data coming as Strings
        String salary1 = "25000";
        String salary2 = "32000";
        String salary3 = "28000";
        String salary4 = "45000";

        // String -> int
        int s1 = Integer.parseInt(salary1);
        int s2 = Integer.parseInt(salary2);
        int s3 = Integer.parseInt(salary3);
        int s4 = Integer.parseInt(salary4);

        // Start with the smallest possible integer
        int highestSalary = Integer.MIN_VALUE;

        if (s1 > highestSalary) {
            highestSalary = s1;
        }

        if (s2 > highestSalary) {
            highestSalary = s2;
        }

        if (s3 > highestSalary) {
            highestSalary = s3;
        }

        if (s4 > highestSalary) {
            highestSalary = s4;
        }

        System.out.println("Highest Salary: ₹" + highestSalary);

        // int -> Integer using valueOf()
        Integer salaryObject = Integer.valueOf(highestSalary);

        System.out.println("Wrapper Object: " + salaryObject);
    }
}
