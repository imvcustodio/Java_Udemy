package entities;

public class CommonPerson extends TaxPayer {
    private Double healthExpanses;


    public CommonPerson() {}
    public CommonPerson(String name, Double annualIncome, Double healthExpanses) {
        super(name, annualIncome);
        this.healthExpanses = healthExpanses;
        /* this.healthExpanses = annualIncome; o erro de calculo de antes estava aqui que eu
        estava setando o meu atributo da classe que e healthExpanses ao annualIncome e nao ao
        alor gasto com saude que vem do principal*/
    }

    public Double getHealthExpanses() {
        return healthExpanses;
    }
    public void setHealthExpanses(Double healthExpanses) {
        this.healthExpanses = healthExpanses;
    }

    @Override
    public Double taxPrice() {
        double taxRate = (getAnnualIncome()<20000) ? 0.15 : 0.25;
        double baseTax = (getAnnualIncome() * taxRate);
        double reductionHealth = healthExpanses * 0.50;
        return (baseTax-reductionHealth);
    }
}
