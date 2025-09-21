import java.util.Scanner;
import java.util.ArrayList;

// Base class for all vehicles
abstract class Vehicle {
    protected String model_name;
    protected String license_plate;
    protected String maintenance_schedule;
    protected String fuel_type;
    protected int wheels;
    private boolean is_operational;

    // Corrected constructor to accept parameters
    public Vehicle(String model_name, String license_plate, String maintenance_schedule, String fuel_type, int wheels) {
        this.model_name = model_name;
        this.license_plate = license_plate;
        this.maintenance_schedule = maintenance_schedule;
        this.fuel_type = fuel_type;
        this.wheels = wheels;
        this.is_operational = true;
    }

    // Constructor with just model_name (example of constructor overloading)
    public Vehicle(String model_name) {
        this.model_name = model_name;
        this.is_operational = false;
        System.out.println("Vehicle with model name " + this.model_name + " created.");
    }

    // Public getter for private attribute
    public boolean isOperational() {
        return this.is_operational;
    }
    
    // Setter for is_operational
    public void setOperational(boolean status) {
        this.is_operational = status;
    }

    public void display() {
        System.out.println("\n--- Vehicle Details ---");
        System.out.println("Model: " + model_name);
        System.out.println("License Plate: " + license_plate);
        System.out.println("Maintenance Scheduled on: " + maintenance_schedule);
        System.out.println("Fuel Type: " + fuel_type);
        System.out.println("Number of Wheels: " + wheels);
        System.out.println("Is Operational: " + (is_operational ? "Yes" : "No"));
        System.out.println("---------------------");
    }

    // Abstract method to be implemented by subclasses
    public abstract void use();
}

// Subclass for Electric Scooters
class ElectricScooters extends Vehicle {
    public ElectricScooters(String model_name, String license_plate, String maintenance_schedule, String fuel_type, int wheels) {
        super(model_name, license_plate, maintenance_schedule, fuel_type, wheels);
    }
    
    // Overloaded constructor with just model name
    public ElectricScooters(String model_name) {
        super(model_name);
    }

    @Override
    public void use() {
        System.out.println("Used for quick trips around the city.");
    }
}

// Subclass for Lawn Mowers
class LawnMowers extends Vehicle {
    public LawnMowers(String model_name, String license_plate, String maintenance_schedule, String fuel_type, int wheels) {
        super(model_name, license_plate, maintenance_schedule, fuel_type, wheels);
    }
    
    // Overloaded constructor with just model name
    public LawnMowers(String model_name) {
        super(model_name);
    }

    @Override
    public void use() {
        System.out.println("Used for residential yards and small parks.");
    }
}

// Subclass for Utility Vans
class UtilityVans extends Vehicle {
    private int capacity;

    public UtilityVans(String model_name, String license_plate, String maintenance_schedule, String fuel_type, int wheels, int capacity) {
        super(model_name, license_plate, maintenance_schedule, fuel_type, wheels);
        this.capacity = capacity;
    }
    
    // Overloaded constructor with just model name
    public UtilityVans(String model_name) {
        super(model_name);
        this.capacity = 0;
    }

    @Override
    public void use() {
        System.out.println("Used for hauling equipment and materials, with a capacity of " + capacity + " kg.");
    }
}

// Base class for all employees
abstract class Employee {
    protected String emp_name;
    protected String emp_id;
    protected String role;

    public Employee(String emp_name, String emp_id, String role) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.role = role;
    }

    // Method to be overridden
    public void check_vehicle_status(Vehicle vehicle) {
        System.out.println(emp_name + " is checking the status of " + vehicle.model_name + ".");
    }
}

// Class for Gardener
class Gardener extends Employee {
    public Gardener(String emp_name, String emp_id) {
        super(emp_name, emp_id, "Gardener");
    }

    // Overriding the base method to provide specific gardener details
    @Override
    public void check_vehicle_status(Vehicle vehicle) {
        System.out.println("Gardener " + emp_name + " is checking the operational status of " + vehicle.model_name + ".");
        if (vehicle.isOperational()) {
            System.out.println("This vehicle is ready for use.");
        } else {
            System.out.println("This vehicle is not operational. Please contact a mechanic.");
        }
    }
}

// Class for Mechanic
class Mechanic extends Employee {
    public Mechanic(String emp_name, String emp_id) {
        super(emp_name, emp_id, "Mechanic");
    }
    
    // Method overloading: one method for general check
    public void perform_maintenance(Vehicle vehicle) {
        System.out.println("Mechanic " + emp_name + " is performing a general check on " + vehicle.model_name + ".");
    }

    // Method overloading: a second method with an additional task
    public void perform_maintenance(Vehicle vehicle, String task) {
        System.out.println("Mechanic " + emp_name + " is performing a specific task: " + task + " on " + vehicle.model_name + ".");
    }
}

// Class for Supervisor
class Supervisor extends Employee {
    public Supervisor(String emp_name, String emp_id) {
        super(emp_name, emp_id, "Supervisor");
    }

    // Method overriding: a more detailed check for the supervisor
    @Override
    public void check_vehicle_status(Vehicle vehicle) {
        System.out.println("Supervisor " + emp_name + " is reviewing the maintenance schedule for " + vehicle.model_name + ".");
        System.out.println("Next maintenance is scheduled for: " + vehicle.maintenance_schedule);
    }
    
    // Example of polymorphism: can assign any type of employee and vehicle
    public void assign_vehicle(Employee employee, Vehicle vehicle) {
        System.out.println(this.emp_name + " (Supervisor) assigned " + vehicle.model_name + " to " + employee.emp_name + ".");
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> fleet = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();

        // Create initial employees
        employees.add(new Gardener("John Smith", "G101"));
        employees.add(new Mechanic("Alice Jones", "M202"));
        employees.add(new Supervisor("David Lee", "S303"));

        int choice;
        do {
            System.out.println("\n--- Eco-Friendly City Gardeners Fleet Management System ---");
            System.out.println("1. Register a new vehicle");
            System.out.println("2. Display a vehicle's status");
            System.out.println("3. Assign a vehicle to an employee");
            System.out.println("4. Perform maintenance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type (scooter/mower/van): ");
                    String type = scanner.next();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter model name: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter license plate: ");
                    String plate = scanner.nextLine();
                    System.out.print("Enter maintenance schedule: ");
                    String schedule = scanner.nextLine();
                    System.out.print("Enter fuel type: ");
                    String fuel = scanner.nextLine();
                    System.out.print("Enter number of wheels: ");
                    int wheels = scanner.nextInt();
                    
                    if (type.equalsIgnoreCase("scooter")) {
                        fleet.add(new ElectricScooters(model, plate, schedule, fuel, wheels));
                    } else if (type.equalsIgnoreCase("mower")) {
                        fleet.add(new LawnMowers(model, plate, schedule, fuel, wheels));
                    } else if (type.equalsIgnoreCase("van")) {
                        System.out.print("Enter van capacity: ");
                        int capacity = scanner.nextInt();
                        fleet.add(new UtilityVans(model, plate, schedule, fuel, wheels, capacity));
                    } else {
                        System.out.println("Invalid vehicle type.");
                    }
                    break;
                case 2:
                    System.out.print("Enter employee ID to check status: ");
                    String empId = scanner.next();
                    System.out.print("Enter vehicle license plate to check: ");
                    String vehiclePlate = scanner.next();
                    
                    Employee selectedEmp = employees.stream().filter(e -> e.emp_id.equals(empId)).findFirst().orElse(null);
                    Vehicle selectedVehicle = fleet.stream().filter(v -> v.license_plate.equals(vehiclePlate)).findFirst().orElse(null);

                    if (selectedEmp != null && selectedVehicle != null) {
                        System.out.println("--- Demonstrating Method Overriding ---");
                        // This demonstrates polymorphism based on the type of Employee
                        selectedEmp.check_vehicle_status(selectedVehicle);
                    } else {
                        System.out.println("Employee or vehicle not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Supervisor ID: ");
                    String supId = scanner.next();
                    System.out.print("Enter employee ID to assign vehicle: ");
                    String assignEmpId = scanner.next();
                    System.out.print("Enter vehicle license plate to assign: ");
                    String assignVehiclePlate = scanner.next();
                    
                    Supervisor supervisor = (Supervisor) employees.stream().filter(e -> e.emp_id.equals(supId) && e instanceof Supervisor).findFirst().orElse(null);
                    Employee targetEmp = employees.stream().filter(e -> e.emp_id.equals(assignEmpId)).findFirst().orElse(null);
                    Vehicle assignedVehicle = fleet.stream().filter(v -> v.license_plate.equals(assignVehiclePlate)).findFirst().orElse(null);
                    
                    if (supervisor != null && targetEmp != null && assignedVehicle != null) {
                         System.out.println("--- Demonstrating Polymorphism ---");
                         // Supervisor can assign vehicle to any employee type
                         supervisor.assign_vehicle(targetEmp, assignedVehicle);
                    } else {
                        System.out.println("Supervisor, employee, or vehicle not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Mechanic ID: ");
                    String mechId = scanner.next();
                    System.out.print("Enter vehicle license plate to service: ");
                    String servicePlate = scanner.next();
                    
                    Mechanic mechanic = (Mechanic) employees.stream().filter(e -> e.emp_id.equals(mechId) && e instanceof Mechanic).findFirst().orElse(null);
                    Vehicle serviceVehicle = fleet.stream().filter(v -> v.license_plate.equals(servicePlate)).findFirst().orElse(null);
                    
                    if (mechanic != null && serviceVehicle != null) {
                        System.out.println("--- Demonstrating Method Overloading ---");
                        mechanic.perform_maintenance(serviceVehicle); // First version
                        mechanic.perform_maintenance(serviceVehicle, "oil change"); // Second version
                    } else {
                        System.out.println("Mechanic or vehicle not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
}