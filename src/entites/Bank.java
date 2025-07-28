package entites;

public class Bank {
    private int acontNumber;
    private String name;
    private double value;

    public Bank(int acontNumber, String name, double value) {
        this.acontNumber = acontNumber;
        this.name = name;
        deposit(value);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getContNumber() {
        return acontNumber;
    }

    public void saque(double valorSaque) {
        value -= (valorSaque + 5.0);
    }

    public void deposit(double valor) {
        value += (valor);
    }

    public double getValue(){
        return value;
    }


    public String toString(){
        return String.format("Accont "+getContNumber()+", Holder: " + getName()+", Balance: $"+ getValue());
    }


}
