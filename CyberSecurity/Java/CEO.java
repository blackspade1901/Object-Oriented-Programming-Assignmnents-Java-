public class CEO extends SystemAdmin {
    private String companyName;

    public CEO() {
        super();
        this.companyName = "TechCorp";
        this.accessLevel = "Executive";
    }

    public CEO(String name) {
        super(name);
        this.companyName = "TechCorp";
        this.accessLevel = "Executive";
    }

    public CEO(String name, String company) {
        super(name);
        this.companyName = company;
        this.accessLevel = "Executive";
    }

    protected void getCeoInfo(){
        System.out.println("CEO Name: " + name + ", Company: " + companyName + ", Access Level: " + accessLevel);
    }

    public void registerIP(String ip) {
        System.out.println("CEO " + name + " registered IP: " + ip + " with executive privileges");
    }

    public void monitorSystemAdmin(String adminName) {
        System.out.println("CEO " + name + " monitoring SystemAdmin: " + adminName);
    }

    public void monitorEmployee(String empName) {
        System.out.println("CEO " + name + " monitoring employee: " + empName + " at executive level");
    }
}