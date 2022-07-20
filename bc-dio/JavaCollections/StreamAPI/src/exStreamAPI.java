
/*
  Stream API (PENDENTE)

  - As streams existem em dois tipos de operações: operações intermediárias e terminais.
  - Operações interediárias: são as operações que retornam um stream e é possível encadear, colocando várias operações
    intermediárias uma atrás da outra.
  - Operações terminais: só pode ser utilizada uma ao invés de várias, retornando um objeto ou um valor.
*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;


public class exStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");


        out.println("Imprima todos os elementos dessa lista de String: ");
/*
          numerosAleatorios.stream()
                .forEach(System.out::println);
*/
        //imprimir com forEach

/*        numerosAleatorios.stream().forEach(new Consumer<String>() { //forEach() é uma operação final
            @Override
            public void accept(String s) { //método .accept é um void, logo, não irá retornar algo. Mas. vai pegar cada elemento e imprimir.
                System.out.println(s);
            }
        });
*/
        //usando Lambda - A própria list possui o forEach sem precisar usar stream

//        numerosAleatorios.stream().forEach(s -> System.out.println(s));
//        numerosAleatorios.forEach(s -> System.out.println(s));
        numerosAleatorios.forEach(out::println);

        out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");

        //recebe um long, essa operação vai pegar os cinco primeiros números
        //coleta para dentro de um Set e será impresso 4 números por não aceitar nºs repetidos
        //É possível utilizar o Reference Method
/*
          numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
*/

/*
          Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
                  .limit(5)
                  .collect(Collectors.toSet());
          System.out.println(numerosAleatorios5Primeiros);
*/
        //se não desejar imprimir, pressionar Ctrl+alt+v e inserir dentro da variável

        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());

        /*
          Neste caso, não está sendo coletado mas transformado uma lista do tipo String para Inteiros.
          Será utilizado a operação map que vai tranformar a list de string p/ inteiros.
          O map vai solitar que passe uma Function e vai receber uma String e retornar Integer, vai pedir
          para implementar o método (alt+enter) .apply
        */
        out.println("Transforme esta lista de String em uma lista de números inteiros.");

/*        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
*/

        //forma em desuso
/*        numerosAleatorios.stream()
                .map(new Function<String, Integer>() { //esse map recebe uma interface Function e retorna uma Stream (fluxo)
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                });
 */

        //forma alternativa
/*        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList()) //coletar o stream para inserir dentro de um list de números inteiros
                .forEach(out::println);
*/

        //inserindo dentro de uma variável fica uma List de Integer
/*        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
*/

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");

/*        numerosAleatorios.stream()
                  .map(Integer::parseInt)
                  .filter(i -> i % 2 == 0 && i > 2)
                  .collect(Collectors.toList())
                  .forEach(System.out::println);
*/

/*        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                  .map(Integer::parseInt) //map pega cada valor da list e transforma em um tipo
                  .filter(i -> (i % 2 == 0 && i > 2)) //pegar os pares < 2, ou seja, fazendo um filtro/seleção e pede Predicate
                  .collect(Collectors.toList());
          System.out.println(listParesMaioresQue2);
*/

/*        System.out.println("Mostre a média dos números: ");
          //numerosAleatorios1.stream()
                  //.average()
                  //.ifPresent(System.out::println);

          numerosAleatorios.stream()
                  .mapToInt(Integer::parseInt)
                  .average()
                .ifPresent(System.out::println);
*/

/*        System.out.println("Remova os valores ímpares: ");
          //numerosAleatorios1.removeIf(integer -> integer % 2 != 0);
          //System.out.println(numerosAleatorios1);

          numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
          System.out.println(numerosAleatoriosInteger);
*/

/*
        Para você
/*
        out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        Arrays numerosAleatoriosInteger;
        numerosAleatoriosInteger.stream()
                .skip(3)
                .forEach(out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();
        out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);
*/

/*
        out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(out::println);

        out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(out::println);
        ;

        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);
/*

/*
        out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        out.println(numerosOrdemNatural);
*/

/*
        out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        //dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        out.println(collectNumerosMultiplosDe3E5);
*/
    }}
