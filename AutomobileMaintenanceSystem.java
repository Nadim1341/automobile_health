package AMS;

import java.util.*;

// Main Class
public class AutomobileMaintenanceSystem {

    static Scanner scanner = new Scanner(System.in);
    static Map<Long, Vehicle> vehicleDatabase = new HashMap<>();
    static long vehicleIdCounter = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Automobile Maintenance System ---");
            System.out.println("1. Register Vehicle");
            System.out.println("2. Suggest Maintenance");
            System.out.println("3. Display All Vehicles");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerVehicle();
                    break;
                case 2:
                    suggestMaintenance();
                    break;
                case 3:
                    displayAllVehicles();
                    break;
                case 4:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void registerVehicle() {
        System.out.print("Enter vehicle name: ");
        scanner.nextLine();  // consume newline
        String name = scanner.nextLine();

        System.out.print("Enter vehicle model: ");
        String model = scanner.nextLine();

        System.out.print("Enter vehicle age (in years): ");
        int age = scanner.nextInt();

        System.out.print("Enter vehicle mileage (in km): ");
        int mileage = scanner.nextInt();

        Vehicle vehicle = new Vehicle(vehicleIdCounter++, name, model, age, mileage);
        vehicleDatabase.put(vehicle.getId(), vehicle);
        System.out.println("Vehicle registered successfully! Assigned ID: " + vehicle.getId());
    }

    private static void suggestMaintenance() {
        System.out.print("Enter vehicle ID to suggest maintenance: ");
        long id = scanner.nextLong();

        Vehicle vehicle = vehicleDatabase.get(id);
        if (vehicle != null) {
            String suggestion = MaintenanceAdvisor.getSuggestion(vehicle);
            System.out.println("Maintenance Suggestion for Vehicle ID " + id + ": " + suggestion);
        } else {
            System.out.println("Vehicle not found!");
        }
    }

    private static void displayAllVehicles() {
        if (vehicleDatabase.isEmpty()) {
            System.out.println("No vehicles registered.");
        } else {
            System.out.println("All Registered Vehicles:");
            for (Vehicle vehicle : vehicleDatabase.values()) {
                System.out.println(vehicle);
            }
        }
    }
}

