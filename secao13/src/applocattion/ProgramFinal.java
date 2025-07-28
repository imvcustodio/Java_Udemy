package applocattion;

import entities.CommonPerson;
import entities.JuridicalPerson;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramFinal {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        List<TaxPayer> taxPayerList = new ArrayList<>();
        System.out.println("Enter the number of tax payers: ");;
        int payersNumber = scanner.nextInt();
        for (int i = 0; i < payersNumber; i++) {
            System.out.println("Tax payer #"+(i+1)+" data: ");
            System.out.println("Commom person or Juridical person (c/j): ");
            String choseClass = scanner.next().toUpperCase();
            char choiceClass = choseClass.charAt(0);
            scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Annual Income: ");
            Double annualIncome = scanner.nextDouble();

            if(choiceClass == 'C'){
                System.out.println("Health expense: ");
                Double healthExpense = scanner.nextDouble();
                taxPayerList.add(new CommonPerson(name, annualIncome,healthExpense));
            } else{
                System.out.println("Number of employees: ");
                int employeesNumber = scanner.nextInt();
                taxPayerList.add(new JuridicalPerson(name, annualIncome, employeesNumber));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : taxPayerList) {
            System.out.println(taxPayer.getName()+": $ "+ String.format("%.2f", taxPayer.taxPrice()));
        }
        scanner.close();
    }
}
