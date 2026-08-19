package opp_Implements;

public class CustomerMain {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.name = "Munna";
        customer.email = "munna@gmail.com";

        System.out.println(customer.name);  // Munna
        System.out.println(customer.email);  // munna@gmail.com
    }
}
