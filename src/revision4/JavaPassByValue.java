package revision4;

public class JavaPassByValue {

    static void changeValue(int x) {

        x = 100;

        System.out.println("Inside method: " + x);
    }

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Before method: " + number);

        changeValue(number);

        System.out.println("After method: " + number);
    }
}
