package entities;

public class BusinnesAcount extends Account {
    private Double loanLimit; //esse vai ser o meu atributo diferencial da classe Account

    public BusinnesAcount(Integer number, String holder, Double balance, Double loanLimit) {// construtor normal como de outras classe sem herança
        super(number, holder, balance);/*Ao inves de usarmos os this.holde = holder e etc.., utilizamos o super(Parametros)
                                        para que os atributos dessa classe BusinessAcount CHAMEM O construtor da classe pai
                                        ou seja Essa linha está passando os valores recebidos (number, holder, balance) para
                                        o construtor da superclasse Account, para que ela possa inicializar seus próprios atributos.*/

    this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(double amount) {
        if(amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
