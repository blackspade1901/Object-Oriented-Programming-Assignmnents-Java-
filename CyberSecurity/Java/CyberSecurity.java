import java.util.*;

public class CyberSecurity {
    private ArrayList<ComputerSystem> systems;
    private ArrayList<Employee> employees;

    public CyberSecurity() {
        systems = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addSystem(ComputerSystem system) {
        systems.add(system);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void performOperation(int choice, Employee user) {
        switch(choice) {
            case 1:
                registerNewIP(user);
                break;
            case 2:
                displayAllSystems();
                break;
            case 3:
                deleteUnusedSystem(user);
                break;
            case 4:
                displayAllEmployees();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void registerNewIP(Employee user) {
        if(user instanceof CEO) {
            user.registerIP("192.168.1.100");
        } else if(user instanceof SystemAdmin) {
            user.registerIP("192.168.1.50");
        } else {
            user.registerIP("192.168.1.10");
        }
    }

    public void displayAllSystems() {
        System.out.println("All Computer Systems:");
        for(ComputerSystem system : systems) {
            system.displayInfo();
        }
    }

    public void deleteUnusedSystem(Employee user) {
        if(user instanceof SystemAdmin) {
            SystemAdmin admin = (SystemAdmin) user;
            admin.deleteSystem("OLD-DESKTOP-01");
        } else {
            System.out.println("Access denied for system deletion");
        }
    }

    public void displayAllEmployees() {
        System.out.println("All Employees:");
        for(Employee emp : employees) {
            emp.viewSystemInfo();
        }
    }

    public static void main(String[] args) {
        CyberSecurity cs = new CyberSecurity();

        Desktop desktop1 = new Desktop("DESK-001", "192.168.1.20");
        Laptop laptop1 = new Laptop("LAP-001", "192.168.1.30");
        Server server1 = new Server("SRV-001", "192.168.1.40");

        cs.addSystem(desktop1);
        cs.addSystem(laptop1);
        cs.addSystem(server1);

        Employee emp1 = new Employee("Rohit", "E001", "Sales");
        SystemAdmin admin1 = new SystemAdmin("Sima", "A001");
        CEO ceo1 = new CEO("John", "TechCorp");

        cs.addEmployee(emp1);
        cs.addEmployee(admin1);
        cs.addEmployee(ceo1);

        System.out.println("Cyber Security System Demo");
        System.out.println("=========================");

        cs.performOperation(2, admin1);
        System.out.println();

        cs.performOperation(1, emp1);
        cs.performOperation(1, admin1);
        cs.performOperation(1, ceo1);
        System.out.println();

        cs.performOperation(4, admin1);
        System.out.println();

        cs.performOperation(3, admin1);
        System.out.println();

        admin1.monitorEmployee("John");
        ceo1.monitorEmployee("Rohit");
        ceo1.monitorSystemAdmin("Sima");
    }
}