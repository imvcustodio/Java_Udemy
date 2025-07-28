package entites;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName()+", ");
        sb.append("$"+ product.getPrice()+ ", ");
        sb.append("Quantity: "+quantity+", ");
        sb.append("Subtotal: $"+subTotal()+"\n");
        return sb.toString();
    }
}
