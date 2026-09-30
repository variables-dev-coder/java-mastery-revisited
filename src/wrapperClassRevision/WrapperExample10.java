package wrapperClassRevision;

public class WrapperExample10 {

    public static void main(String[] args) {

        // Data received as Strings
        String username = "Munna";
        String loginStatus = "true";

        // String -> boolean
        boolean isLoggedIn = Boolean.parseBoolean(loginStatus);

        // boolean -> Boolean (autoboxing)
        Boolean statusObject = isLoggedIn;

        // Boolean -> boolean (unboxing)
        boolean finalStatus = statusObject;

        if (finalStatus) {
            System.out.println(username + " is logged in.");
        } else {
            System.out.println(username + " is not logged in.");
        }

        // Using Boolean.valueOf()
        Boolean anotherStatus = Boolean.valueOf("false");

        System.out.println("Another status: " + anotherStatus);
    }
}
