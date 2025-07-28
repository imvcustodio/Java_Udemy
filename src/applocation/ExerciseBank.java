package applocation;

import entites.Bank;

import java.util.Scanner;

public class ExerciseBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double value;
            System.out.print("Account number: ");
            int acontNumber = scanner.nextInt();
            System.out.println("Accont name: ");
            String name = scanner.next();
            System.out.println("Is there a initial deposit: (y/n): ");
            String initialDeposit = scanner.next();

            if (initialDeposit.equals("y")) {
                System.out.println("Initial deposit value: ");
                value = scanner.nextDouble();
            }else{
                value = 0.0;
            }

        Bank bank = new Bank(acontNumber, name, value);
        String resp = bank.toString();
        System.out.println("Bank response: " + resp);

        System.out.println("Enter a Deposit Value: ");
        double depositValue = scanner.nextDouble();
        bank.deposit(depositValue);
        System.out.println("updated Bank response: " + bank);/*aqui eu n precisei colocar o toString pq ele
        ja fica implicito a isso, quando chmao um metodo no System.out.println pois ele ja reconhece que quero
        chamar um metodo que escreve algo, não somente um calculo como os outros que estao na outra classe que não são o toString*/

        System.out.println("Enter a WithDraw Value: ");
        double withDraw = scanner.nextDouble();
        bank.saque(withDraw);
        System.out.println("updated Bank response: " + bank);/*aqui eu n precisei colocar o toString pq ele
        ja fica implicito a isso, quando chmao um metodo no System.out.println pois ele ja reconhece que quero
        chamar um metodo que escreve algo, não somente um calculo como os outros que estao na outra classe que não são o toString*/




        scanner.close();



    }
}
