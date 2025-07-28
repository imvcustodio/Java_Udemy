package applocation;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

import entites.People;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de pessoas que deseja adicionar: ");
        int pessoas = scanner.nextInt();
        double somaAltura = 0.0;
        People[] persons = new People[pessoas];
        String[] nomes = new String[pessoas];
        int total16 = 0;

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Digite o nome da pessoa ["+(i+1)+"]: ");
            String nome = scanner.next();
            System.out.println("Digite o idade da pessoa ["+(i+1)+"]: ");
            int idade = scanner.nextInt();
            System.out.println("Digite a altura da pessoa ["+(i+1)+"]: ");
            double altura = scanner.nextDouble();
            persons[i] = new People(nome, idade, altura);//criei um novo objeto passando como parametro os atributos da minha classe people que possui esses atributos no construtor
            if (idade<16){
                total16++;
            }
        }
        for (int i = 0; i < pessoas; i++) {
            somaAltura += persons[i].getAltura();
        }
        double mediaAltura = somaAltura / pessoas;
        double percent16 = total16 * 100.0 / pessoas;

        System.out.printf("A media de Altura é: %.2f%n", mediaAltura);
        System.out.printf("A Porcentagem de pessoas menores de 16 anos é: %.2f%n", percent16);
        System.out.println("Aqui estão os seus nome");

        for (int i = 0; i < pessoas; i++) {
            if(persons[i].getIdade()<16){
                System.out.println(persons[i].getNome());
            }
        }

        scanner.close();
    }
}
