from computer_system import ComputerSystem

class Server(ComputerSystem):
    def __init__(self, system_name, ip_address=None):
        super().__init__(system_name, ip_address)
