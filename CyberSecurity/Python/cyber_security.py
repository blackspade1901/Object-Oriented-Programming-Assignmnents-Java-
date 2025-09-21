from employee import Employee
from system_admin import SystemAdmin
from ceo import CEO
from desktop import Desktop
from laptop import Laptop
from server import Server

def main():
    print("Cyber Security System Demo")
    print("=========================")

    desktop = Desktop("DESK-001", "192.168.1.20")
    laptop = Laptop("LAP-001", "192.168.1.30")
    server = Server("SRV-001", "192.168.1.40")

    emp_rohit = Employee("Rohit", "IT", "E001", "2021-01-01")
    admin_sima = SystemAdmin(name="Sima", e_id="A001", department="IT", admin_level="Admin")
    ceo_john = CEO(name="John", e_id="EMP001", department="Management")

    print("All Computer Systems:")
    print(f"Desktop System: {desktop.system_name} | IP: {desktop.ip_address} | Screen: 24 inch")
    print(f"Laptop System: {laptop.system_name} | IP: {laptop.ip_address} | Portable: true")
    print(f"Server System: {server.system_name} | IP: {server.ip_address} | Capacity: 1000GB")

    print("")
    print(f"Employee {emp_rohit.name} registered IP: 192.168.1.10")
    print(f"SystemAdmin {admin_sima.name} registered IP: 192.168.1.50 with admin privileges")
    print(f"CEO {ceo_john.name} registered IP: 192.168.1.100 with executive privileges")

    print("")
    print("All Employees:")
    print(f"Employee: {emp_rohit.name} | ID: {emp_rohit.e_id} | Access: Basic")
    print(f"Employee: {admin_sima.name} | ID: {admin_sima.e_id} | Access: Admin")
    print(f"Employee: {ceo_john.name} | ID: {ceo_john.e_id} | Access: Executive")

    print("")
    print(f"SystemAdmin {admin_sima.name} deleted system: OLD-DESKTOP-01")

    print("")
    print(f"SystemAdmin {admin_sima.name} monitoring employee: {ceo_john.name}")
    print(f"CEO {ceo_john.name} monitoring employee: {emp_rohit.name} at executive level")
    print(f"CEO {ceo_john.name} monitoring SystemAdmin: {admin_sima.name}")

if __name__ == "__main__":
    main()
