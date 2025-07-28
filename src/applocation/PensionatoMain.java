package applocation;

import java.util.Scanner;
import entites.Pensionato;

public class PensionatoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pensionato[] quartos = new Pensionato[10];//estava dando erro pois eu estava criando um vetor do tipo int depois tentei do tipo string porem como estou criando la em baixo um objeto do tipo pensionato e necesario o meu vetor ser desse tipo para desfrutar dos atributos da classe pensionato
        String name;
        String email;
        int roomNumber;
        System.out.println("How many rooms will be rented: ");
        int roomQuantity = scanner.nextInt();

        for (int i = 0; i < roomQuantity; i++) {
            System.out.println("Room " + (i + 1) + ":");
            scanner.nextLine(); // limpa a quebra de linha pendente
            System.out.print("name: ");
            name = scanner.nextLine();
            System.out.print("Email: ");
            email = scanner.nextLine();
            System.out.println("Room: ");
            roomNumber = scanner.nextInt();

            quartos[roomNumber] = new Pensionato(name, email, roomNumber);

        }

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null){//estava dando errado pois estava tentando fazer a verificação atraves de quartos[i].getNome e não tem como fazer esse get se a instanciação for null, então se fazer a condicional ele reconhece somente o objeto na posição quartos[i] não e necessario chamar um metodo getter
                System.out.println(quartos[i].toString());
            }
        }
        scanner.close();
    }
}
