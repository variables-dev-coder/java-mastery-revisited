package day10_throwVSthrows;

public class ThrowThrowsCombo {

    static void validate(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Invalid age");
        }
    }

    public static void main(String[] args) throws Exception {

        validate(15);  // age valid age

       // validate(20);
    }
}

//Convert to unchecked exception
//Remove throws