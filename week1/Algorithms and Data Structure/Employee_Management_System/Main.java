public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee e1 = new Employee("E001", "Alice", "Manager", 75000);
        Employee e2 = new Employee("E002", "Bob", "Developer", 55000);
        Employee e3 = new Employee("E003", "Charlie", "Analyst", 50000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearch Employee E002:");
        Employee searchResult = ems.searchEmployee("E002");
        System.out.println(searchResult != null ? searchResult : "Employee not found");

        System.out.println("\nDelete Employee E002:");
        ems.deleteEmployee("E002");
        ems.traverseEmployees();
    }
}
