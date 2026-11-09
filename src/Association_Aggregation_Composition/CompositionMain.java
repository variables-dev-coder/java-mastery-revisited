package Association_Aggregation_Composition;

// Composition


public class CompositionMain {

    public static void main(String[] args) {

        House house = new House();

        house.displayHouse();

        // House is no longer referenced after this point
        house = null;
    }
}
