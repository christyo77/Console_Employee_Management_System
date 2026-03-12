package model;

public class Parttime extends Employee{
    private boolean eligibleForBenefits;
    private double hourlyRate;
    private int hoursPerWeek;

    public Parttime(String dept, int id, String name, double baseSalary, boolean eligibleForBenefits, double hourlyRate, int hoursPerWeek) {
        super(dept, id, name, baseSalary);
        this.eligibleForBenefits = eligibleForBenefits;
        this.hourlyRate = hourlyRate;
        this.hoursPerWeek = hoursPerWeek;
    }

    public boolean isEligibleForBenefits() {
        return eligibleForBenefits;
    }

    public void setEligibleForBenefits(boolean eligibleForBenefits) {
        this.eligibleForBenefits = eligibleForBenefits;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    //Create a method or variable to calculate weekly Part-time Salary = hourlyRate × hours
    @Override
    public double calculateSalary() {
        double calculatedHourlyRate = getBaseAnnualSalary() / 2080;

            if (this.hoursPerWeek <= 0) {
                System.out.println("Invalid hours worked");
                return 0;
            }

            return this.hourlyRate * this.hoursPerWeek;
        }

}
