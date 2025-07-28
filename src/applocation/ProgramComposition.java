package applocation;

import entites.Departament;
import entites.HourContract;
import entites.Worker;
import enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramComposition {
    public static void main(String[] args) throws ParseException {
         Scanner scanner=new Scanner(System.in);
         SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfm=new SimpleDateFormat("MM/yyyy");

        System.out.println("Enter departament's name:");
        String DepartamentsName=scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String workerName = scanner.nextLine();
        System.out.println("Level: ");
        String workerLevel = scanner.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Departament(DepartamentsName));

        System.out.println("How many contracts to this worker: ");
        int contractsQuantity = scanner.nextInt();
        for(int i=0;i<contractsQuantity;i++){
            System.out.println("Enter contract number #"+(i+1)+" data: ");
            System.out.print("Date(DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scanner.next()) ;
            System.out.print("Value per Hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        String[] dateParts = monthAndYear.split("/");
        int month = Integer.parseInt(dateParts[0]);
        int year = Integer.parseInt(dateParts[1]);
        System.out.println("Name: "+worker.getName());
        System.out.println("departament's name: "+worker.getDepartament().getName());
        System.out.println("Income for "+monthAndYear+": "+worker.income(year, month));// estav passando os parametros em ordens erradas e esse era o meu erro

        scanner.close();
    }
}
