public class Server extends ComputerSystem {
    private int capacity;

    public Server() {
        super();
        this.capacity = 1000;
    }

    public Server(String name, String ip) {
        super(name, ip, "Server");
        this.capacity = 1000;
    }

    public void displayInfo() {
        System.out.println("Server System: " + getSystemName() + " | IP: " + getIpAddress() + " | Capacity: " + capacity + "GB");
    }
}