package Employee;

public class Employee {
    // name and salary
    protected String name = "default name";
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and setters w/ JavaDoc

    /**
     * Sets the name of the Employee
     * @param newName new name to assign to Employee
     * @return ??? void (dont need to be here)
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
    * Get name of employee
    * @param ?? no params (doesn't need to be here)
    * @return the name of the Employee
    */
    public String getName() {
        return this.name;
    }

    // Using automatic generator
    // public String getName() {
    //     return this.name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public double getSalary() {
    //     return this.salary;
    // }

    // public void setSalary(double salary) {
    //     this.salary = salary;
    // }

    // @Override
    // public String toString() {
    //     return "{" +
    //         " name='" + getName() + "'" +
    //         ", salary='" + getSalary() + "'" +
    //         "}";
    // }
}
