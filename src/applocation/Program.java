package applocation;

import java.util.Scanner;

import entites.Triangle;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

            /*
            double xA, xB, xC, yA, yB, yC;*/
            System.out.println("Enter the measures of triangle X ");
            x.a = scanner.nextDouble();
            x.b = scanner.nextDouble();
            x.c= scanner.nextDouble();
            System.out.println("Enter the measures of triangle Y ");
            y.a = scanner.nextDouble();
            y.b = scanner.nextDouble();
            y.c = scanner.nextDouble();


            double areaA = x.area();

            double areaB = y.area();

            System.out.printf("Area of triangle A = %.4f ",areaA);
            System.out.printf("Area of triangle B = %.4f",areaB);

            x.maiorTriangle(areaA,areaB);


        scanner.close();
    }
}
