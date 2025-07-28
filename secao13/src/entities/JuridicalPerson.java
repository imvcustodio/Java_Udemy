package entities;

public class JuridicalPerson extends TaxPayer {
    private Integer employeesNumber;

    public JuridicalPerson() {}
    public JuridicalPerson(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double taxPrice() {
        double tax = 0.0;
        tax=getEmployeesNumber()>10? 0.14 : 0.16;
        return (getAnnualIncome()*tax);
    }
}
