package applocation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramFile {
    public static void main(String[] args) {
        Scanner scanner = null;
        File file = new File("C:\\Users\\ISAC\\Desktop\\int.txt");//isso eu crio um objeto do tipo arquivo

        try{
            scanner = new Scanner(file);//crio um novo leitor para percorrer o meu arquivo criado
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }/*Esse trecho lê um arquivo linha por linha e imprime cada linha no console. Ele continua
            fazendo isso até que não existam mais linhas para ler.*/
        }catch(FileNotFoundException fileError){// se o arquivo não for encontrado conforme o caminho passado
            System.out.println("File not found, we had an error"+fileError.getMessage());
        }finally{//o bloco finaly vai rodar de qualquer jeito se aprovar o try ou se cair no catch
            if (scanner != null) {
                scanner.close();
            }
            System.out.println();
            System.out.println("Program File closed");
        }
    }
}
