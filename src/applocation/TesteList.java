package applocation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Isac");
        list.add("Ana");
        list.add("Mila");
        list.add("Isis");

        System.out.println("Developer: "+list.get(0));
        System.out.println("----------------");
        for (String names : list){
            System.out.println(names);
        }
        System.out.println("--------------------------");
        list.add(2,"Lobinho");
        list.add(3, "May");
        list.add(4, "Poly");

        System.out.println("Tamanho da minha Lista: " + list.size());
        for (String names : list){
            System.out.println(names);
        }
        System.out.println("---------------------");
        list.remove("Ana"); // procura na lista um  elemento que seja igual a este que passei como parametro e remove da minha lista
        list.removeIf(x -> x.charAt(0) == 'I'); //remova se( x tal que x(no char do indice 0 for igual a 'I'))
        for (String names : list){
            System.out.println(names);
        }
        System.out.println("---------------------");
        System.out.println("Index of Mila: " + list.indexOf("Mila"));//aqui eu procuro o indece que o meu parametro esta dentro da lista
        System.out.println("---------------------");
        /*criando uma nova lista com itens da lista list conforme uma determinada condição da minha função lambda*/
        System.out.println("Nova lista chamada result com itens de list porem com uma condição lambda aplicada");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for(String names : result){
            System.out.println(names);
        }
        System.out.println("-----------------------");
        System.out.println("Adicionar a uma variavel um valor que esta presente em uma lista conforme uma condição");
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);/*findFirst() = encontrar o primeirou; orElse(null) = se nn achar em toda a lista me retorna um null */
        System.out.println("Primeiro nome da lista que atendeu a condição: " + name);
        System.out.println("-----------------------");
        System.out.println("Adicionar a uma variavel um valor que esta presente em uma lista conforme uma condição[Exemplo 2]");
        String nameExemplo2 = list.stream().filter(x -> x.charAt(0) == 'M' && x.length()>3).findFirst().orElse(null);/*findFirst() = encontrar o primeirou; orElse(null) = se nn achar em toda a lista me retorna um null */
        System.out.println("Primeiro nome da lista que atendeu a condição: " + nameExemplo2);
    }
}
