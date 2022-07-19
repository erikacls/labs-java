/*
  Proposta: Crie uma conjunto contendo as cores do arco-íris e:

            a) Exiba todas as cores o arco-íris uma abaixo da outra;
            b) A quantidade de cores que o arco-íris tem;
            c) Exiba as cores em ordem alfabética;
            d) Exiba as cores na ordem inversa da que foi informada;
            e) Exiba todas as cores que começam com a letra ”v”;
            f) Remova todas as cores que não começam com a letra “v”;
            g) Limpe o conjunto;
            h) Confira se o conjunto está vazio.

            Dica (d) - A ordem inversa da que foi formada, é preciso criar uma list e passar como argumento dentro do
            construtor o Set com as cores do arco-iris, e utilizar um método que faz essa reversão. Não é dito o Set que
            será usado nem o método da classe Collections que será usado para organizar a list.
            Dica (e) - Existe um método que faz a exibição de todas as cores que começam com a letra "v".
*/

import java.util.*;

public class exPropSet01 {
    public static void main(String[] args) {
        System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}