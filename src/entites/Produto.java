/*package entites;

import java.util.Scanner;

public class Produto {

    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;
    private double totalPrice;

    public Produto() {
        this.nomeProduto = name;// referencia a meu atributo
        this.precoProduto = price;
        this.quantidadeProduto = quantity;
    }

    public void productData(Scanner scanner) {
        System.out.println("enter with the product data: ");
        System.out.println("Name: ");
        nomeProduto = scanner.next();
        System.out.println("Preco: ");
        precoProduto = scanner.nextDouble();
        System.out.println("Quantidade: ");
        quantidadeProduto = scanner.nextInt();

    }
    public double totalValueStock(){
        return totalPrice = precoProduto * quantidadeProduto;
    }
    public void updateData(Scanner scanner) {
        System.out.println("Enter the number of the product you want to add: ");
        quantidadeProduto += scanner.nextInt();
    }
    public void removeData(Scanner scanner) {
        System.out.println("Enter the number of the product you want to remove: ");
        quantidadeProduto -= scanner.nextInt();
    }

    public void printData(){
        System.out.printf("Updated data: %s,  $ %.2f, %d units, Total: %.2f\n", nomeProduto, precoProduto, quantidadeProduto, totalValueStock());
    }


}
*/