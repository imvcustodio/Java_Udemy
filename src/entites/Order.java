package entites;

import enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {//This order is the class of the final exercice in the section 12
    private Date moment;
    private OrderStatus status;

    private Client client;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public void addItem(OrderItem orderItem){
        items.add(orderItem);
    }
    public void removeItem(OrderItem orderItem){
        items.remove(orderItem);
    }
    public Date getMoment() {
        return moment;
    }
    public double total(){
        double total = 0.0;
        for(OrderItem orderItem : items){
            total+= orderItem.subTotal();
        }
        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
                sb.append("Order moment: "+sdf.format(moment)+"\n");
                sb.append("Order status: "+status+"\n");
                sb.append("Client data: "+client.toString()+"\n");
                sb.append("Order items: \n");
                for(OrderItem orderItem : items){
                    sb.append(orderItem.toString()+"\n");
                }
                sb.append("Total price: "+total());
                return sb.toString();// oque estava dando erro e porque eu n colocava o sb e isso torna redundante se colocar somente o toString para retorno, isso fica como um loop infinito e nn para entao ele precisa de um brackPoint e isso e os intens adicionados ao sb
    }

}
