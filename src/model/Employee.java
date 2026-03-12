package model;

public abstract class Employee {
    private String dept;
    private int id;
    private String name;
    private double baseAnnualSalary;

    public Employee(String dept, int id, String name, double baseAnnualSalary) {
        this.dept = dept;
        this.id = id;
        this.name = name;
        this.baseAnnualSalary = baseAnnualSalary;
    }

    //TODO
    //Create abstract method to calculate Salary
    public abstract double calculateSalary ();

    public String getDept() {
        return dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseAnnualSalary() {
        return baseAnnualSalary;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseAnnualSalary(double baseAnnualSalary) {
        this.baseAnnualSalary = baseAnnualSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", baseAnnualSalary=" + baseAnnualSalary +
                '}';
    }
}




