package Encapsulation;


class Mobile {

    // 1. Private data members
    private String brand;
    private String model;
    private int volume;
    private int batteryPercentage;

    // 2. Constructor
    public Mobile(String brand, String model,
                  int volume, int batteryPercentage) {

        this.brand = brand;
        this.model = model;
        setVolume(volume);
        setBatteryPercentage(batteryPercentage);
    }

    // 3. Getter for brand
    public String getBrand() {
        return brand;
    }

    // 4. Getter for model
    public String getModel() {
        return model;
    }

    // 5. Getter for volume
    public int getVolume() {
        return volume;
    }

    // 6. Setter for volume with validation
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println(
                    "Volume must be between 0 and 100!"
            );
        }
    }

    // 7. Getter for battery
    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    // 8. Setter for battery with validation
    public void setBatteryPercentage(int batteryPercentage) {
        if (batteryPercentage >= 0 &&
                batteryPercentage <= 100) {
            this.batteryPercentage = batteryPercentage;
        } else {
            System.out.println(
                    "Battery must be between 0 and 100!"
            );
        }
    }

    // 9. Increase volume
    public void increaseVolume(int amount) {
        if (amount <= 0) {
            System.out.println(
                    "Increase amount must be positive!"
            );
            return;
        }

        if (volume + amount > 100) {
            volume = 100;
        } else {
            volume += amount;
        }

        System.out.println("Volume increased.");
    }

    // 10. Use battery
    public void useBattery(int percentage) {
        if (percentage <= 0) {
            System.out.println(
                    "Battery usage must be positive!"
            );
            return;
        }

        if (percentage > batteryPercentage) {
            batteryPercentage = 0;
        } else {
            batteryPercentage -= percentage;
        }

        System.out.println("Battery updated.");
    }

    // 11. Display mobile details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Volume: " + volume);
        System.out.println(
                "Battery: " + batteryPercentage + "%"
        );
    }
}

public class MobileEncapsulationDemo {

    public static void main(String[] args) {

        // Create mobile object
        Mobile mobile =
                new Mobile("Samsung", "Galaxy S25", 50, 100);

        System.out.println("=== Initial Details ===");
        mobile.displayDetails();

        // Increase volume
        System.out.println("\n=== Increase Volume ===");
        mobile.increaseVolume(30);
        System.out.println(
                "Current Volume: " + mobile.getVolume()
        );

        // Attempt invalid volume
        System.out.println("\n=== Invalid Volume ===");
        mobile.setVolume(150);
        System.out.println(
                "Current Volume: " + mobile.getVolume()
        );

        // Use battery
        System.out.println("\n=== Use Battery ===");
        mobile.useBattery(25);
        System.out.println(
                "Current Battery: " +
                        mobile.getBatteryPercentage() + "%"
        );

        // Display final details
        System.out.println("\n=== Final Details ===");
        mobile.displayDetails();
    }
}

