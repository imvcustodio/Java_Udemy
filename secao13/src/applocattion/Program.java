package applocattion;

import entities.Employee;
import entities.OutSourceEmployee;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeesList = new ArrayList<>();
        System.out.println("Enter the number of employees: ");
        int employeesNumber = scanner.nextInt();
        for (int i = 0; i < employeesNumber; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.println("Outsourced (y/n): ");
            String outsourced = scanner.next();
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Hours: ");
            int hours = scanner.nextInt();
            System.out.println("Value per hour: ");
            double hoursValue = scanner.nextDouble();
            if(outsourced.equalsIgnoreCase("y")){
                System.out.println("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                employeesList.add(new OutSourceEmployee(name, hours, hoursValue, additionalCharge));

            }else  if(outsourced.equalsIgnoreCase("n")){
                employeesList.add(new Employee(name, hours, hoursValue));
            }

        }
        System.out.println("PAYMENTS: ");
        for (Employee employee : employeesList) {
            System.out.println(employee);
        }
        scanner.close();
    }
}
