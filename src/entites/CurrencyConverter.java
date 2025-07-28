package entites;

public class CurrencyConverter {
    private Double dollarPrice;
    private Double dollarBought;
    private Double dollarFinal;
    private Double temp;
    public CurrencyConverter() {

    }
    public CurrencyConverter(double dollarPrice, double dollarBought) {
        this.dollarPrice = dollarPrice;
        this.dollarBought = dollarBought;
    }

    public Double Amout() {
        temp = dollarPrice*dollarBought;
        dollarFinal = (dollarPrice*dollarBought) + (temp*0.06);
        return dollarFinal;
    }

}
