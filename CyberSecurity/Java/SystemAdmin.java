public class SystemAdmin extends Employee {
    private String adminLevel;

    public SystemAdmin() {
        super();
        this.adminLevel = "Junior";
        this.accessLevel = "Admin";
    }

    public SystemAdmin(String name) {
        super(name);
        this.adminLevel = "Senior";
        this.accessLevel = "Admin";
    }

    public SystemAdmin(String name, String id) {
        super(name, id, "IT");
        this.adminLevel = "Senior";
        this.accessLevel = "Admin";
    }

    public void getAdminInfo(){
        System.out.println("Admin Name: " + name + ", Admin Level: " + adminLevel + ", Access Level: " + accessLevel);
    }
    public void registerIP(String ip) {
        System.out.println("SystemAdmin " + name + " registered IP: " + ip + " with admin privileges");
    }

    public void monitorEmployee(String empName) {
        System.out.println("SystemAdmin " + name + " monitoring employee: " + empName);
    }

    public void deleteSystem(String systemName) {
        System.out.println("SystemAdmin " + name + " deleted system: " + systemName);
    }
}