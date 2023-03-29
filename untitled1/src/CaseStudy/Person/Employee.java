package CaseStudy;

public class Employee extends Person{
    private double salary;

    public Employee(String id, String fullName, int age, String address, double salary) {
        super(id, fullName, age, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
