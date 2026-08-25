package revision4;

public class StaticNonStaticMethod {

    // Static method
    static void staticMethod() {

        System.out.println("Static method called");
    }

    // Non-static method
    void nonStaticMethod() {

        System.out.println("Non-static method called");
    }

    public static void main(String[] args) {

        // Calling static method
        staticMethod();

        // Creating object
        StaticNonStaticMethod obj = new StaticNonStaticMethod();

        // Calling non-static method
        obj.nonStaticMethod();
    }
}
