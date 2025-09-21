public class Laptop extends ComputerSystem {
    private boolean isPortable;

    public Laptop() {
        super();
        this.isPortable = true;
    }

    public Laptop(String name, String ip) {
        super(name, ip, "Laptop");
        this.isPortable = true;
    }

    public void displayInfo() {
        System.out.println("Laptop System: " + getSystemName() + " | IP: " + getIpAddress() + " | Portable: " + isPortable);
    }
}