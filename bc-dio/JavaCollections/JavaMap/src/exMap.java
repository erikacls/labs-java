/*
  Proposta: Dada os modelos dos carros e seus respectivos consumos na estrada, faça:

            modelo = gol - consumo = 14,4km/l;
            modelo = uno - consumo = 15,6 km/l;
            modelo = mobi - consumo = 16,1 km/l;
            modelo = hb20 - consumo = 14,5 km/l;
            modelo = kwid - consumo = 15,6 km/l.

            modelo: chave; consumo:valor

            Formas de iniciar um Map

            Map carrosPopulares2020 = new HashMap(); //antes do java 5
            Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
            HashMap<String, Double> carrosPopulares = new HashMap<>();
            Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)
 */

import java.util.*;

public class exMap {

    public static void main(String[] args) {

        /*
        Criar e importar um Map definindo o tipo da chave e do valor respectivamente. Nomeá-lo e iniciar um HashMap inserindo entre
        chaves modelos (chaves) e Consumos (valor). Neste caso, não há como utilizar o método .add, portanto, ao trabalhar com Map
        o método é o put passando chave - valor. Lembrando que não é possível no Map ter chaves duplicadas, eles são de valor único,
        enquanto os valores podem ser duplicados. O armazenamento será aleatório devido ao uso do HashMap, e não da forma como foi
        inserido.
        */
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<String, Double>() {{ //argumentos definidos
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString()); //é possível utilizar c/ toString ou só passando a variável carrosPopulares

        /*
        Como não é possível ter chaves repetidas, será utilizado o método put para fazer a substituição. Por exemplo, se já possuir
        a chave gol irá sobrescrever o seu valor. Não há como add, apenas como alterar porque a chave já existe.
        */
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        /*
          tucson é o modelo, logo, o modelo é a chave. Então, o método é carrosPopulares.containsKey() e passa o objeto
          para saber se está no dicionário de carros.
        */
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        /*
          Para ser possível passar uma chave e retornar um valor utilizar .get() e passar o objeto (chave)
        */
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        /*
          como no Set não há método para que seja possível mostrar
        */
        //System.out.println("Exiba o terceiro modelo adicionado: ");

        /*
          Para exibir os modelos existe o método .keySet() que retornará um Set que será de String, porque os modelos no
          caso as chaves é do tipo String.
        */

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet(); //colocar em uma variável para ver que retorna um Set
        System.out.println(modelos);

        /*
          Para os consumos (valores) existe o método .values que retorna uma Collection<Double>
        */
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        /*
          - Neste caso, é preciso saber qual é o carro e o valor da chave que é mais eficiente, ou seja, o carro que faz mais
            kms por litro. Como será retornado o maior valor referente a uma chave?
          - Collections.max recebe uma Collection. E qual o método que nos retorna uma Collection? carrosPopulares.values que
            retorna com todos os consumos.
          - Como saber o carro que faz um consumo mais eficiente? Como trabalhar com chave e valor de forma separada? Utilizando
            o método especial entrySet() que retorna um Set e seus elementos são do tipo entry.
          - Da interface Entry (k, v) que encontra-se dentro de interface Map, precisamos do getKey() e getValue()
        */
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values()); //variável
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); //variável
        String modeloMaisEficiente = ""; //criar uma variável de controle

        /*
          Estamos trabalhando com Set, por mais que tenha chaves - valores dentro do Set.
          Se o primeiro elemento que for pego dentro do Set de entries, o valor for igual ao consumo mais eficiente é possível
          dizer que o modelo mais eficiente é igual a chave referente a esse entry, ou seja, a esse valor.
          Se existir mais modelos resultando com o mesmo consumo mais eficente seria impresso várias vezes
        */
        for (Map.Entry<String, Double> entry : entries) { //nomeado entry, com elementos inserido dentro do set de entries
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        /*
          - Neste caso é preciso trabalhar com a chave e o valor separadamente. O método .values retorna uma Collection de
            valores e o método .keySet retorna um Set com os modelos. Apesar de trabalhar com chave e valor separadamente
            precisam ter ligação. Como fazer?
          - ver qual o menor consumo utilizando a classe Collections.min() passando a collection carrosPopulares.values()
          - utilizar o método entrySet() que vai retorna um Set, e dentro dele poder manipular chaves e valores separadamente
          - Será feito um laço de repetição - For each ( : );
            - Se o valor de entry for igual ao consumo menos eficiente será dito que a chave conectada a este valor também é
              um modelo menos eficiente.
        */
        System.out.println("Exiba o modelo menos econômico e seu consumo: " );

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values()); //inserir em uma variável
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) { //chamar de entry
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        /*
          Podendo trabalhar com o Set só dos consumos, é possível fazer o iterator. É possível chamar o iterator porque o
          retorno dos carrosPopulares é um Collection.
        */
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d; //variável criada para guardar a soma
        while(iterator.hasNext()){ //Enquanto, iterator tem próximo
            soma += iterator.next(); //será somado com o iterator.next
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        //soma divido pela quantidade
        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        /*
          Fazer outro iterator, para remover os carros que tinham consumo igual a 15,6
        */
        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);


        //Utilizar a implementação LinkedHashMap<>
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<String, Double>() {{ //argumentos definidos
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        //O modelo é a chave que será ordenada pelo TreeMap<>, como a chave é String será ordenada em ordem alfabética
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1); //criar TreeMap
        System.out.println(carrosPopulares2.toString());

        //com o método .clear()
        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        //com o método que retorna um boolean - isEmpty()
        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}