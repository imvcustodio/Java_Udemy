package applocation;

import entites.Client;
import entites.Order;
import entites.OrderItem;
import entites.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class OrderProgram {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.next();
        System.out.println("birth date (DD/MM/YYYY): ");
        String birthDate = scanner.next();

        Date birthCorrect = formatter.parse(birthDate);
        Client client = new Client(name,email,birthCorrect);//instacio o meu cliente aqui

        System.out.println("Enter product data: ");
        System.out.println("Status: ");
        String statusString = scanner.next();
        OrderStatus status = OrderStatus.valueOf(statusString);// aqui eu instacio o meu status passando el para o meu tipo OrderStatus

        Order order = new Order(new Date(), status, client);//estava estranhando essa parte de o terceito parametro das chamadas serem associados a outra classe porem e assim que a feito a asociação e após isso eu criarei um atributo do tipo client em meu Order
        /*Nesse order eu ja criei o meu client ent eu ja associo o meu cliente a esse pedido*/
        System.out.println("How many items to this order: ");
        int dataQuantity = scanner.nextInt();

        for (int i = 0; i < dataQuantity; i++) {
            System.out.println("Enter #" + (i + 1) + "item data :");
            System.out.println("Name: ");
            String itemName = scanner.next();
            System.out.println("Price: ");
            Double price = scanner.nextDouble();
            System.out.println("Quantity: ");
            int quantity = scanner.nextInt();

            Product product = new Product(itemName,price);//crio um novo produto (ate entao SOLTO)

            OrderItem orderItem = new OrderItem(quantity, price, product);//aqui eu ja adiciono esse pedido a uma ordem de pedido, que no caso ja fica instanciado um ao outro

            order.addItem(orderItem);// apos criar o pedido e a ordem de pedido do mesmo aqui eu adiciono a minha lista de itens que pode possuir diversas ordensItens e itens que esta associado ao meu pedido de um cliente especifico


        }
        System.out.println(order);


        scanner.close();
    }
}
