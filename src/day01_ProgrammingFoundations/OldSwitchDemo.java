package day01_ProgrammingFoundations;

/*
int day = 3;

String result = switch (day) {
    case 1, 2 -> "Weekday";
    case 6, 7 -> "Weekend";
    default -> "Midweek";
};

System.out.println(result);

 */

public class OldSwitchDemo {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

// Tuesday