package applocation;

import entites.OrderComId;
import enums.OrderStatus;
import java.util.Date;

public class ProgramOrder {
    public static void main(String[] args) {
        OrderComId order = new OrderComId(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
    }
}
