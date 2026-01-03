package day03_ObjectOrientedProgramming;

public class User {

    int id;
    String name;

    void login() {
        System.out.println(name + " logged in");
    }

    public static void main(String[] args) {
        User u1 = new User();
        u1.id = 1;
        u1.name = "Munna";

        u1.login();
    }
}

// Munna logged in

//What to Observe
//Class → blueprint
//Object → new User()
//Instance variables belong to object