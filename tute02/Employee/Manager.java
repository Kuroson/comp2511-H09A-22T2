package Employee;

// import java.time.LocalDate;
// import java.util.Date;

public class Manager extends Employee {
    String hireDate;

    public Manager(String name, double salary, String hireDate) {
        super(name, salary); // parent class constructor => Employee(String name, double salary)
        this.hireDate = hireDate;
    }

    @Override
    public String getName() {
        this.name = "new name";
        return "some name";
    }

    public void someMethod() {
        Employee e = this;
        System.out.println(e.getName()); // line 15 function
        System.out.println(this.getName()); // line 15 function
        System.out.println(super.getName()); // Will actually get name of the Employee
    }

    public static void main(String[] args) {
        // Employee e = new Employee("Alvin", 100.0);
        // System.out.println(e.getName());
        Manager m = new Manager("Libo", 50.0, "10/10/2001");
        // System.out.println(m.getName());
        m.someMethod();
    }
}
