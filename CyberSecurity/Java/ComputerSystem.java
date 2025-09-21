public class ComputerSystem {
    private String systemName;
    private String ipAddress;
    private String systemType;
    protected String location;
    public String status;

    public ComputerSystem() {
        this.systemName = "Unknown";
        this.ipAddress = "0.0.0.0";
        this.systemType = "Generic";
        this.location = "Unknown";
        this.status = "Active";
    }

    public ComputerSystem(String name) {
        this.systemName = name;
        this.ipAddress = "192.168.1.1";
        this.systemType = "Generic";
        this.location = "Office";
        this.status = "Active";
    }

    public ComputerSystem(String name, String ip, String type) {
        this.systemName = name;
        this.ipAddress = ip;
        this.systemType = type;
        this.location = "Office";
        this.status = "Active";
    }

    public String getSystemName() {
        return systemName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ip) {
        this.ipAddress = ip;
    }

    public String getSystemType() {
        return systemType;
    }

    public void displayInfo() {
        System.out.println("System: " + systemName + " | IP: " + ipAddress + " | Type: " + systemType);
    }
}