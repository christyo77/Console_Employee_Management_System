package model;

public class Contract extends  Employee{
    private String contractEndDate;
    private String agencyName;
    private double contractValue;

    public Contract(String dept, int id, String name, double baseSalary, String contractEndDate, String agencyName, double contractValue) {
        super(dept, id, name, baseSalary);
        this.contractEndDate = contractEndDate;
        this.agencyName = agencyName;
        this.contractValue = contractValue;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
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

    //Create a method or variable to calculate full salary - Contract: Salary = contractValue / duration
}
