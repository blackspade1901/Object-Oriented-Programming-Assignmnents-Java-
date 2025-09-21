public class Employee {
    protected String name;
    protected String empId;
    private String department;
    public String accessLevel;

    public Employee() {
        this.name = "Unknown";
        this.empId = "EMP001";
        this.department = "General";
        this.accessLevel = "Basic";
    }

    public Employee(String name) {
        this.name = name;
        this.empId = "EMP001";
        this.department = "General";
        this.accessLevel = "Basic";
    }

    public Employee(String name, String id, String dept) {
        this.name = name;
        this.empId = id;
        this.department = dept;
        this.accessLevel = "Basic";
    }

    public void employeeInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + empId + ", Department: " + department + ", Access Level: " + accessLevel);
    }

    public void registerIP(String ip) {
        System.out.println("Employee " + name + " registered IP: " + ip);
    }

    public void registerIP(String ip, String systemName) {
        System.out.println("Employee " + name + " registered IP: " + ip + " for system: " + systemName);
    }

    public void viewSystemInfo() {
        System.out.println("Employee: " + name + " | ID: " + empId + " | Access: " + accessLevel);
    }

    public String getName() {
        return name;
    }
}