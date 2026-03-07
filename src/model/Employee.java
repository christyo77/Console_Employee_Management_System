package model;

public abstract class Employee {
    private String dept;
    private int id;
    private String name;
    private double baseSalary;

    public Employee(String dept, int id, String name, double baseSalary) {
        this.dept = dept;
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getDept() {
        return dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
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

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}




