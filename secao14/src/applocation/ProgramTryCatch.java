package applocation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTryCatch {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
            try {
                String[] vect = scanner.nextLine().split(" ");/*esse codigo ele pega os nomes
            que eu digitar e vai adicionar cada um que eu digiteu ao meu vetor e o tamanho desse vetor
            vai ser a quantidade de nome que eu  digitei e nada mais, esse vetor reconhece que cada valor
            que seja adicionado ao vetor esta separado por um espasso que eu setei a minha função split e o
            caractere que eu quero que seja o separador eu passo como parametro dentro do meu split*/
                int position = scanner.nextInt();
                System.out.println(vect[position]);
            }catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                indexOutOfBoundsException.printStackTrace();
                System.out.println("Invalid position");
            }catch (InputMismatchException inputMismatchException) {
                System.out.println("Invalid input the positios is numbers isn´t letters");
            }
            System.out.println("End of the program");


            scanner.close();
    }
}
