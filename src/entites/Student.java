package entites;

import java.util.Scanner;

public class Student {
    public String studentName;
    public double nota1;
    public double nota2;
    public double nota3;

    public void studentData(Scanner scanner){
        System.out.println("Student name: ");
        studentName = scanner.next();

        System.out.println("Student Note trimestre one: ");
        nota1 = scanner.nextDouble();
        System.out.println("Student Note trimestre two: ");
        nota2 = scanner.nextDouble();
        System.out.println("Student Note trimestre three: ");
        nota3 = scanner.nextDouble();
    }
    public double verifyNotes(Scanner scanner) {
        double media = 0.0;
        if (nota1 > 30 || nota2 > 35 || nota3 > 35) {
            System.out.println("Have an error in the notes");
            studentData(scanner);
        } else {
            media = (nota1 + nota2 + nota3);
        }
        return media;
    }
    public void results(double result){
        if (result >= 60) {
            System.out.printf("FINAL GRADE %.2f\n", result);
            System.out.println("You PASS!");
        }else{
            System.out.printf("FINAL GRADE %.2f\n", result);
            double missed = 60 -  result;
            System.out.printf("MISSING %.2f POINTS", missed);
        }
    }



}
