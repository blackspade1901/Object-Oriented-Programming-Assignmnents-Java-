class ComputerSystem:
    def __init__(self, system_name, ip_address=None):
        self.system_name = system_name
        self.ip_address = ip_address
        self.is_active = True

    def display_system_name(self):
        print(f"System Name: {self.system_name}")

    def register_ip_address(self, ip_address):
        self.ip_address = ip_address
        print(f"IP Address registered: {ip_address}")

    def delete_system(self):
        self.is_active = False
        print(f"{self.system_name} deleted.")
