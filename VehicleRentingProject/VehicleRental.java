package VehicleRentingProject;
import java.util.Scanner;
public class VehicleRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        Car[] cars = {
            new Car("Toyota Corolla"),
            new Car("Honda Civic")
        };

        Bike[] bikes = {
            new Bike("Yamaha R15"),
            new Bike("KTM Duke")
        };

        Truck[] trucks = {
            new Truck("Tata Ace"),
            new Truck("Ashok Leyland")
        };

        while (choice != 3) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Show Available Vehicles : Car, Bike, Truck");
            System.out.println("2. Rent a Vehicle; type and no. fo days)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Cars:");
                    for (Car car : cars) {
                        car.displayDetails();
                    }

                    System.out.println("\nAvailable Bikes:");
                    for (Bike bike : bikes) {
                        bike.displayDetails();
                    }

                    System.out.println("\nAvailable Trucks:");
                    for (Truck truck : trucks) {
                        truck.displayDetails();
                    }
                    break;

                case 2:
                    System.out.println("You have selected to Rent a Vehicle");
                    System.out.println("Select vehicle type: 1 - Car, 2 - Bike, 3 - Truck");
                    int vehicleType = scanner.nextInt();

                    System.out.print("Enter number of rental days: ");
                    int numberOfDays = scanner.nextInt();

                    switch (vehicleType) {
                        case 1:
                            System.out.println("Select Car: 1 - Toyota Corolla (450Rs/day), 2 - Honda Civic (570Rs/day)");
                            int carType = scanner.nextInt();
                            if (carType == 1) {
                                System.out.println("You selected Toyota Corolla.");
                                System.out.println("Total price: " + (450 * numberOfDays) + "Rs");
                            } else if (carType == 2) {
                                System.out.println("You selected Honda Civic.");
                                System.out.println("Total price: " + (570 * numberOfDays) + "Rs");
                            }
                            break;

                        case 2:
                            System.out.println("Select Bike: 1 - Yamaha R15 (300Rs/day), 2 - KTM Duke (500Rs/day)");
                            int bikeType = scanner.nextInt();
                            if (bikeType == 1) {
                                System.out.println("You selected Yamaha R15.");
                                System.out.println("Total price: " + (300 * numberOfDays) + "Rs");
                            } else if (bikeType == 2) {
                                System.out.println("You selected KTM Duke.");
                                System.out.println("Total price: " + (500 * numberOfDays) + "Rs");
                            }
                            break;

                        case 3:
                            System.out.println("Select Truck: 1 - Tata Ace (800Rs/day), 2 - Ashok Leyland (1000Rs/day)");
                            int truckType = scanner.nextInt();
                            if (truckType == 1) {
                                System.out.println("You selected Tata Ace.");
                                System.out.println("Total price: " + (800 * numberOfDays) + "Rs");
                            } else if (truckType == 2) {
                                System.out.println("You selected Ashok Leyland.");
                                System.out.println("Total price: " + (1000 * numberOfDays) + "Rs");
                            }
                            break;

                        default:
                            System.out.println("Invalid selection.");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program..");
                    break;

                default:
                    System.out.println("Please choose correct option.");
                    break;
            }
        }

        scanner.close();
    }
}
