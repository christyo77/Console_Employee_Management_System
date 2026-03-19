package model;

public class Fulltime extends Employee{
    private boolean hasHealthInsurance;
    private double annualBonus;

    public Fulltime(String dept, int id, String name, double baseSalary, boolean hasHealthInsurance, double annualBonus) {
        super(dept, id, name, baseSalary);
        this.hasHealthInsurance = hasHealthInsurance;
        this.annualBonus = annualBonus;
    }

    public boolean isHasHealthInsurance() {
        return hasHealthInsurance;
    }

    public void setHasHealthInsurance(boolean hasHealthInsurance) {
        this.hasHealthInsurance = hasHealthInsurance;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    //Create a method or variable to calculate full salary- Full-time: Salary = base + bonus
    @Override
    public double calculateSalary() {
        double salary = getBaseAnnualSalary();
        if (salary <= 0) {
            System.out.println("Invalid Salary Amount");
            return 0;
        }
        return salary + this.annualBonus;
    }

    @Override
    public String toString() {
        return "Fulltime {" +
                "hasHealthInsurance=" + hasHealthInsurance +
                ", annualBonus=" + annualBonus +
                ", name=" + getName() +
                ", dept=" + getDept() +
                ", id=" + getId() +
                ", baseSalary=" + getBaseAnnualSalary() +
                ", Net salary = "+ calculateSalary() +
                '}';
    }




}
