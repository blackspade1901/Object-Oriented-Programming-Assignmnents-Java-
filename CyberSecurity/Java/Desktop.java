public class Desktop extends ComputerSystem {
    private int screenSize;

    public Desktop() {
        super();
        this.screenSize = 24;
    }

    public Desktop(String name, String ip) {
        super(name, ip, "Desktop");
        this.screenSize = 24;
    }

    public void displayInfo() {
        System.out.println("Desktop System: " + getSystemName() + " | IP: " + getIpAddress() + " | Screen: " + screenSize + " inch");
    }
}