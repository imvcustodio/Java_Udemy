package applocation;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lines ");
        int lines = scanner.nextInt();
        System.out.println("Columns ");
        int columns = scanner.nextInt();

        int[][] matriz = new int[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Number to Search the positios around :");
        int number = scanner.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (matriz[i][j] == number) {
                    System.out.println("Line Posirion[" + i + "][" + j + "]");
                    if (j > 0 && matriz[i][j-1]>lines){
                        System.out.println("Left: "+matriz[i][j-1]);
                    }
                    if (j < columns - 1 && matriz[i][j+1]>lines){
                        System.out.println("Right: "+matriz[i][j+1]);
                    }
                    if (i > 0 && matriz[i-1][j]>columns){
                        System.out.println("Up: "+matriz[i-1][j]);
                    }
                    if (i < lines - 1 && matriz[i+1][j]>columns){
                        System.out.println("Down: "+matriz[i+1][j]);
                    }
                }
            }
        }
        scanner.close();
    }
}
