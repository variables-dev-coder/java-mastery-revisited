package Association_Aggregation_Composition;

// Composition

public class Room {

    private String roomName;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public void displayRoom() {
        System.out.println("Room: " + roomName);
    }
}
