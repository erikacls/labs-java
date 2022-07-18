/*
  Proposta/Desafio: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

            System.out.println("Crie uma lista chamada notas2 " +
            "e coloque todos os elementos da list Arraylist nessa nova lista: ");
            System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
            System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/

import java.util.*;

import static java.util.Arrays.*;

class exList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: "); //ex.1

        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0); //adicionar usando o método add (existem vários, foi usado a 2ª opção do tipo Double)
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString()); //há duas formar de imprimir, passando a variável ou usando o método toString().

        //para exibir a posição de um elemento dentro da lista usar o método indexOf, será passado o objeto e ele retorna o índice(posição).
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        //Utilizado o mesmo método de add passando como argumentos a posição e o elemento
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        //o método de substituição utilizado é o .set que recebe a posição a ser substituída e o elemento do tipo Double.
        //o método indexOf retorna a posição e será passado o elemento a ser substituído, no caso, 6.0.
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //O método para saber se tem um elemento na lista é .contains
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); //será passado um objeto (nota 5.0) e retornará um boolean
        //retornou false pq a nota 5.0 foi substituída por 6.0 an list

        //os elementos são adicionados conforme a ordem de inserção, logo, basta imprimir os elementos da list.
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        //For each - for( : ); - sem chaves por apresentar apenas uma sentença
        for (Double nota : notas) System.out.println(nota); //para imprimir a list posicionando os elementos um em baixo do outro

        //para passar uma posição e retornar um elemento, usar o método .get
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); //3ª nota está no índice 2 (0 - 2)
        System.out.println(notas.toString());

        //para exibir a < nota não existe um método nativo no list, mas é possível utilizar da classe Collections o método .min
        //e passar uma collection. A nossa list é uma collection, logo, é passado notas.
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        /*
        Como o método .min da classe collection sabe que os elementos de notas existe a comparação para saber o que é menor ou maior?
        Os elementos de dentro da list é do tipo Double, e ao abrir a classe Double é possível ver que ele implementa uma interfacer
        chamada Comparable que faz a comparação e retorna quem é maior, menor ou quem vem primeiro e depois etc. Os do tipo int,string,
        long também implementam a interface Comparable.
        */

        //análogo ao anterior foi usado o método .max da Collections
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //não existe um método para retornar a soma, portanto, é possível utilizar o método iterator para poder iterar dentro da list
        //e a partir desta interação pegar os elementos e somar.
        //o laço de repetição da soma encerra quando retornar false

        Iterator<Double> iterator = notas.iterator(); //criar uma variável do padrão iterator e tipo Double/chamar o método iterator
        Double soma = 0d; //variável de controle fora do laço para colocar a soma quando for iterando e armazenando a soma
        while(iterator.hasNext()){ //identifica se tem ou não número próximo (true/false)
            Double next = iterator.next(); //se true, será armazenado o nº próximo nesta variável
            soma += next; //será somado o nº capturado com a variável soma
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //para saber a qauntidade de elementos utilizar o método .size que retorna um inteiro que será a qtde de eleentos da list
        System.out.println("Exiba a média das notas: " + (soma/notas.size())); //soma de tudo dividido pela quantidade de elementos da list

        //para remoção do elemento zero (0) existe o método .remove. É possível passar tanto a posição quanto o objeto
        System.out.println("Remova a nota 0: ");
        notas.remove(0d); //foi passado o objeto/ se retirar o d ficará como inteiro, e o int vai remover o elemento da posição zero, e não a nota 0.
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator(); //o nome da variável iterator1 é customizável
        while(iterator1.hasNext()) { //se iterator tem próximo (true/false)
            Double next = iterator1.next(); //armazenou o próximo na variável next
            if(next < 7) iterator1.remove(); //se o próximo elemento for < 7 retirar da lista
        }
        System.out.println(notas);

        //o método para apagar toda a lista se chama .clear
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        //outra alternativa, o método booleano .isEmpty() (true/false) para retornar se estiver ou não vazia
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}

/*
  ALGUMAS DAS FORMAS DE IMPORTAR/INICIALIZAR UMA LIST

  1.
  List notas = new ArrayList();
  //feita antes do java 5

  2.
  List<Double> notas - new ArrayList<>();
  //generics(double) (jdk 5)/Diamond Operator(<>) (jdk 7)

  3.
  List<Double> notas = new ArrayList<Double>(); //escolhida para aplicar no exercício
  //Diamond Operator(<Double>) (jdk 7) - não é obrigatório a repetição do Double entre <>

  4.
  ArrayList<Double> notas = new ArrayList<>();
  //instanciar a variável notas c/a implementação ArrayList/Não muito recomendado
  //É recomendado programar voltado para a interface e não para a implementação

  5.
  ArrayList<Double> notas = new ArrayList<>(asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
  //instanciar o ArrayList e passar como argumento
  //os elementos que queremos passar para a list notas.

  6.
  Inicia uma list de Double, iniciou a variável, mas não com a implementação ArrayList porque está sendo passado direto para dentro
  da list um Arrays.asList(). É uma forma válida, embora limitada porque não poderá adicionar mais elementos dentro dessa list nem retirar.

  List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
  notas.add(10d);
  System.out.println(notas);

  7.
  Essa forma torna a list imutável, não é possível adicionar nem remover, mas é possível utilizar outros métodos

  List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
  notas.add(1d); //ao adicionar o método add será informado que a list será imutável por esta forma
  notas.remove(5d);
  System.out.println(notas);

*/