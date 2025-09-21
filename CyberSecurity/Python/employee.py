class Employee:
    def __init__(self, name, department, e_id, joining_date):
        self.name = name
        self.department = department
        self.e_id = e_id
        self.joining_date = joining_date

    def employee_details(self):
        print(f"Employee Details:")
        print(f"Employee name: {self.name};\tEmployee department: {self.department}\t;\tEmployee ID: {self.e_id}\t;\tJoining date: {self.joining_date}")

    def project_in_hand(self):
        raise NotImplementedError("Subclasses should implement this method.")
