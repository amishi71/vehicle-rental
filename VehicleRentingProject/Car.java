package VehicleRentingProject;

public class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Car: " + name);
    }
}
