from employee import Employee

class SystemAdmin(Employee):
    def __init__(self, name, e_id, department, admin_level="Junior"):
        super().__init__(name, department, e_id, "2022-01-01")
        self.admin_level = admin_level
        self.access_level = "Admin"

    def register_ip(self, ip):
        print(f"SystemAdmin {self.name} registered IP: {ip} with admin privileges")

    def monitor_employee(self, emp_name):
        print(f"SystemAdmin {self.name} monitoring employee: {emp_name}")

    def delete_system(self, system_name):
        if self.admin_level.lower() == "senior":
            print(f"SystemAdmin {self.name} deleted system: {system_name}")
        else:
            print(f"SystemAdmin {self.name} does not have permission to delete system: {system_name}")
