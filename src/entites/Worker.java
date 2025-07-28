package entites;

import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;//esse parametro vai ser um dos niveis la das minhas enumeraçoes
    private Double baseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>() ;

    public Worker(){

    }
    public Worker(String name, WorkerLevel level, Double BaseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = BaseSalary;
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        Double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract contract : contracts){
            cal.setTime(contract.getDate());
            int contractYear = cal.get(Calendar.YEAR);
            int contractMonth = 1 + cal.get(Calendar.MONTH);//mais um pq o calendario Calendar começa em 0
            if(year == contractYear && month == contractMonth){
                sum+=contract.totalValue();
            }
        }
        return sum;
    }

}
