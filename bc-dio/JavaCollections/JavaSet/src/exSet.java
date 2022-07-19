
/*
  - Method Set
  - Tanto o List quanto o Set estendem a interface Collection
  - Formas de como iniciar um Set

    Set notas = new HashSet(); //antes do java 5
    HashSet<Double> notas = new HashSet<>();
    Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
    Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
    notas.add(1d);
    notas.remove(5d);
    System.out.println(notas);

  - Proposta: Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
*/

import java.util.*;

public class exSet {

    public static void main(String[] args) {

        /*
           Foi criado um Set de notas e implementado o HashSet inserindo como argumento no construtor o Arrays.asList()
           com todas as notas. No teste, com o HashSet o conjunto não fica na ordem e sim aleatório, enquanto os elementos
           repetidos entraram só uma vez.
        */
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //inicia o conjunto + imports
        System.out.println(notas.toString()); //A impressão é com toString() ou só passando notas

        /*
          Ao trabalhar com Set não é possível fazer buscas/pesquisas de acordo com a posição, principalmente no HashSet
          porque é aleatório. Não há o método indexOf() para fazer.
        */
        //System.out.println("Exiba a posição da nota 5.0: ");
        //System.out.println("Adicione na lista a nota 8.0 na posição 4: ");

        /*
          Não há como fazer essa substituição com o método, só se fosse uma List.
        */
        // System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

        /*
          É possível com o método .contains na interface Set. É passado o objeto que no caso é a nota 5
        */
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        /*
          Não é possível porque não tem o método .get para passar o índice e ser possível retornar a nota
        */
        //System.out.println("Exiba a terceira nota adicionada: ");

        /*
          Análogo ao List utilizar para menor, o método .min da classe Collections com s, ela recebe uma Collection que é o Set. E
          passa notas. E para maior, o método .max
        */
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        /*
          Soma dos valores - assim como o List utilizar o Iterator para fazer a soma dos elementos dentro do conjunto.
          Vai resultar em um valor menor do que o exemplo anterior em List, porque no Set não se repete elementos.
        */
        Iterator<Double> iterator = notas.iterator(); //criar variável: CTrl + alt + v
        Double soma = 0.0; //variável de controle - soma
        while(iterator.hasNext()) { //criar laço para saber se tem um próximo
            Double next = iterator.next(); //opcional - colocar em uma variável para poder visualizar
            soma += next; //somar o próximo com o valor da soma
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        /*
          Será a soma dividido pela quantidade e para saber a quantidade usar o método .size
        */
        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        /*
          Se inserir como inteiro retornará erro, porque ele não tem o remove tirando por índice não é feita a manipulação,
          portanto inserir 0d.
        */
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        /*
          Não há como saber a posição zero
        */
        //System.out.println("Remova a nota da posição 0");

        /*
          Análogo ao que foi feito na List. Será chamado o Iterator
        */
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator(); //criação da variável
        while(iterator1.hasNext()){ //enquanto o iterator1 tem próximo
            Double next = iterator1.next(); //cria variável para o próximo elemento
            if (next < 7) iterator1.remove(); //pergunta se o próximo elemento é < 7, se true remover.
        }
        System.out.println(notas);

        /*
          Quando se trabalha com Set, para salvar a ordem que foi formada não é possível usar o HashSet e sim a LinkedHashSet.
          Será usado o método .add para adicionar as notas, lembrando que não é possível adicionar elementos iguais dentro de
          um Set.
        */
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(); //conjunto 2
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        /*
          Neste caso é preciso utilizar a implementação TreeSet porque vai organizar de acordo com a ordem natural dos
          elementos. O Double possui o comparable. Também seria possível criar um laço e imprimir com for.
          Só é possível adicionar notas2 porque seus elementos são Double que tem o comparable. Se fosse uma classe que
          não tivesse o comparable e nem passasse o comparator não seria possível a exibição.
        */
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); //conjunto 3
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}