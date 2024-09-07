public class Intern extends Employee {

    private static final double MAX_SALARY = 20000;

    public Intern(String name, String mail, int age, double salary) {
        super(name, mail, age, salary);

        if (salary > MAX_SALARY) {
            System.out.println("Input is INVALID! Limit reached for intern " + getName() + ". Setting salary to the maximum allowed.");
            setSalary(MAX_SALARY);  // Enforce maximum salary
        }
    }

    @Override
    public String toString() {
        return "- Intern {Name = '" + getName() + "', E-mail = '" + getEmail() + "', Age = " + getAge() + ", Salary = " + getSalary() + "}";
    }
}
