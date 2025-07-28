package entities;

import java.util.Date;

public class ImportedProduct extends Product {
    private Double customFee;

    public ImportedProduct() {

    }
    public ImportedProduct(String name, Double price, Double customFee) {
        super(name,price);
        this.customFee=customFee;
    }

    public Double totalPrice() {
        return (getPrice()+customFee);
    }
    @Override
    public String priceTag() {
        return (getName()+" $ "+totalPrice()+" (Custom fee: $"+customFee+")");
    }
}
