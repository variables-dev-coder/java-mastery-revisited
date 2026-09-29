package wrapperClassRevision;

public class WrapperExample8 {

    public static void main(String[] args) {

        // Population data comes as String
        String city1 = "1500000";
        String city2 = "2300000";
        String city3 = "1750000";

        // String -> long
        long population1 = Long.parseLong(city1);
        long population2 = Long.parseLong(city2);
        long population3 = Long.parseLong(city3);

        // Calculate total
        long totalPopulation =
                population1 + population2 + population3;

        // long -> Long (autoboxing)
        Long populationObject = totalPopulation;

        System.out.println("City 1: " + population1);
        System.out.println("City 2: " + population2);
        System.out.println("City 3: " + population3);

        System.out.println("Total Population: " + totalPopulation);
        System.out.println("Wrapper Object: " + populationObject);

        // Check the type
        System.out.println(
                "Maximum Long Value: " + Long.MAX_VALUE
        );
    }
}
