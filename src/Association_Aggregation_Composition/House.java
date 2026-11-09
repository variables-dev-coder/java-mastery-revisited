package Association_Aggregation_Composition;

// Composition

import java.util.ArrayList;
import java.util.List;

public class House {

    private List<Room> rooms;

    public House() {

        rooms = new ArrayList<>();

        // House creates and owns its rooms
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Kitchen"));
        rooms.add(new Room("Living Room"));
    }

    public void displayHouse() {

        for (Room room : rooms) {
            room.displayRoom();
        }
    }
}
