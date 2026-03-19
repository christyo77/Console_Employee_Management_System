package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Contract extends  Employee{
    private String contractEndDate;
    private String contractStartDate;
    private String agencyName;
    private double contractValue;

    public Contract(String dept, int id, String name, double baseAnnualSalary, String contractEndDate, String contractStartDate, String agencyName, double contractValue) {
        super(dept, id, name, baseAnnualSalary);
        this.contractEndDate = contractEndDate;
        this.contractStartDate = contractStartDate;
        this.agencyName = agencyName;
        this.contractValue = contractValue;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public double getContractValue() {
        return contractValue;
    }

    public void setContractValue(double contractValue) {
        this.contractValue = contractValue;
    }



    //Create a method or variable to calculate full salary - Contract: Monthly Salary = contractValue / duration in months
    //Create a method to calculate duration
    public long calculateDuration() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate start = LocalDate.parse(contractStartDate, formatter);
        LocalDate end = LocalDate.parse(contractEndDate, formatter);


        return ChronoUnit.MONTHS.between(start, end);
    }

    //Create a method to calculate full monthly salary

    @Override
    public double calculateSalary() {
        long duration = calculateDuration();
        if (contractValue <= 0 || duration <= 0) {
            System.out.println("Invalid contract value or duration");
            return 0;
        }
        return contractValue / (double) duration;
    }

    @Override
    public String toString() {
        return "Parttime {" +
                "id = " + getId() +
                ", dept = " + getDept() +
                ", name = " + getName() +
                ", Start date = " + this.contractStartDate +
                ", End date = "+ this.contractEndDate +
                ", Agency Name: " + this.agencyName +
                ", Contract value: " + this.contractValue +
                ", Net salary = " + calculateSalary() +
                '}';
    }

}
