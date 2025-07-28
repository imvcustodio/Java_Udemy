package applocation;

import entites.CurrencyConverter;

import java.util.Scanner;

public class CurrencyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the dollar price: ");
        double dollarPrice = scanner.nextDouble();
        System.out.println("How many price will be bought: ");
        double dollarBought = scanner.nextDouble();

        CurrencyConverter currencyConverter = new CurrencyConverter(dollarPrice, dollarBought);

        System.out.printf("Amount to be paid in reais = %.2f",currencyConverter.Amout());

        scanner.close();
    }
}
