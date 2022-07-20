/*
  - Refatoração Ordenação Map
  - Proposta: Dadas as seguintes informações  de id e contato, crie um dicionário e ordene este dicionário exibindo
    (Nome id - Nome contato):

    id = 1 - Contato = nome: Simba, numero: 2222;
    id = 4 - Contato = nome: Cami, numero: 5555;
    id = 3 - Contato = nome: Jon, numero: 1111;

    Criada a classe Contato (externa)
*/

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class exRefOrdMap {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<Integer, Contato>() {{ //iniciar o HashMap e inserir os elementos dentro
            put(1, new Contato("Julie", 5555));
            put(4, new Contato("Erika", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<Integer, Contato>() {{
            put(1, new Contato("Julie", 5555));
            put(4, new Contato("Erika", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        //O id é a chave, portanto, será utilizado o TreeMap que por default organiza o dicionário de acordo com as chaves
        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone\t--");
        //precisamos organizar os valores. Logo:
        //classe anônima - utilizando o comparator do tipo Entry

        /*
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) { //cont 1 e 2 para organizar os contatos
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero()); //comparar por número de telefone/Ordenação
            }
        });*/

        /*
          É possível utilizar o método estático do comparator/comparing?
          O método .comparing (permite fazer comparações) vai receber uma ‘interface’ funcional Function, não precisa
          criá-la fora. Será utilizado o conceito de classe anônima.
          Qual o tipo do argumento que eu quero que seja comparado, por exemplo.
          Como o objetivo é comparar por número de telefone, será o integer.
          Implementação do método apply
        */

        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() { //inserir o tipo que faça a comparação, e o retorno.
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero(); //retornar de acordo com o número de telefone
                    }
                }));
        */

        /*
          utilização do Lambda - simplificação de código
          Do lado esquerdo ele pede um argumento e do direito pede o corpo/código/lógica
          Depois da variável/argumento inserir uma flecha
        */
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero())); //ordenação de acordo com os números

        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        //imprimindo usando forEach
        set1.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getNome()));
    }
}

/*
//inserida TreeSet<>
class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}
*/

/*
class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}
*/