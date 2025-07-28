package applocation;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entites.ListEmployes;

public class ListExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many employees will be registered: ");
        int employeesNumber = scanner.nextInt();
        Double percentage;
        List<ListEmployes> list = new ArrayList<>();


        for(int i=0; i<employeesNumber; i++){
            System.out.println("Employee #"+(i+1)+":");
            System.out.println("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Salary: ");
            double salary = scanner.nextDouble();
            ListEmployes employes = new ListEmployes(id,name,salary);

            list.add(employes);
        }

        for (ListEmployes employes : list) {
            System.out.println(employes.toString());
        }

        System.out.println("Enter the employee ID that will have a salary incrase: ");
        int employeeID = scanner.nextInt();
        System.out.println("Enter the percentage: ");
        percentage = scanner.nextDouble();

        for (ListEmployes employes : list) {
            if (employes.getId() == employeeID) {
                employes.setSalary(employes.increaseSalary(percentage));
                break;
            }
        }

        for (ListEmployes employes : list) {
            System.out.println(employes.toString());
        }

        scanner.close();
    }

}
