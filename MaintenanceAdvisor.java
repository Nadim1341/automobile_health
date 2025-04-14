package AMS;

// Class 2: MaintenanceAdvisor
public class MaintenanceAdvisor {

    public static String getSuggestion(Vehicle vehicle) {
        int age = vehicle.getAge();
        int mileage = vehicle.getMileage();

        if (age < 2) {
            return "Oil Change and Tire Check";
        } else if (mileage < 30000) {
            return "Engine Check and Fluid Levels Check";
        } else {
            return "Full Service (Engine, Brakes, Tires, Fluids)";
        }
    }
}
