
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Employee[] employees = new Employee[10];


        employees[0] = new Employee("Alice Johnson", "alice.johnson@letstry.com", 28, 50000);
        employees[1] = new Employee("Bob Smith", "bob.smith@eletstry.com", 35, 60000);
        employees[2] = new Intern("Charlie Brown", "charlie.brown@letstry.com", 22, 15000);
        employees[3] = new Employee("David Wilson", "david.wilson@letstry.com", 40, 70000);
        employees[4] = new Intern("Eve Thompson", "eve.thompson@vletstry.com", 21, 18000);
        employees[5] = new Employee("Frank Harris", "frank.harris@letstry.com", 45, 55000);
        employees[6] = new Intern("Grace Lee", "grace.lee@letstry.com", 23, 20000);
        employees[7] = new Employee("Hannah White", "hannah.white@letstry.com", 32, 62000);
        employees[8] = new Employee("Ian Scott", "ian.scott@letstry.com", 29, 48000);
        employees[9] = new Intern("Jack Taylor", "jack.taylor@letstry.com", 24, 17000);


        writeEmployeeDetailsToFile(employees);
    }

    private static void writeEmployeeDetailsToFile(Employee[] employees) throws IOException {
        try (FileWriter writer = new FileWriter("employees.txt", true)) {
            for (Employee employee : employees) {
                writer.write(employee.toString() + "\n");  // Writing employee data with a newline
            }
            System.out.println("Employee details appended to employees.txt successfully.");
        }
    }
}