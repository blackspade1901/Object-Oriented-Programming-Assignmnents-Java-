from employee import Employee

class CEO(Employee):
    def __init__(self, name, e_id, department):
        super().__init__(name, department, e_id, "2022-01-01")
        self.access_level = "CEO"

    def register_ip(self, ip):
        print(f"CEO {self.name} registered IP: {ip} with CEO privileges")

    def monitor_employee(self, emp_name):
        print(f"CEO {self.name} monitoring employee: {emp_name}")

    def monitor_admin(self, admin_name):
        print(f"CEO {self.name} monitoring SystemAdmin: {admin_name}")
