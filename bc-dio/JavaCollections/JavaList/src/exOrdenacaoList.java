/*
  Ordenação List
  Proposta: Dadas as seguintes informações sobre os meus gatos, crie uma lista (de gatos) e ordene esta lista exibindo
  os atributos (nome - idade (meses) - cor):

            Gato 1 = nome: Jon, idade: 18, cor: preto;
            Gato 2 = nome: Simba, idade: 6, cor: tigrado;
            Gato 3 = nome: Jon, idade: 12, cor: amarelo.

            Sugestão inicial: criar uma classe gato e uma lista do tipo gato
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exOrdenacaoList {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<Gato>(){{ //iniciar e importar a lista Gato/criar ArrayList()
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};
        System.out.println(meusGatos);
        //meusGatos.sort(Comparator.comparing(Gato::getNome));

        //Trabalhar com List, sempre que adicionar é na ordem de inserção desde que não peça para mudar a ordem
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        //Como embaralhar uma list? É possível utilizar a classe collection e o método .shuffle()
        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos); //passar a lista no método
        System.out.println(meusGatos);

        /*
          1. Foi usado o Comparable na classe Double, para deixar organizado e saber quem vem primeiro ou depois.
          2. Neste exemplo, será inserido o comparable na classe Gato para dizer que a ordem natural é comparar os
             gatos de acordo com os nomes.

          1. Comparar de acordo com a ordem natural
          2. uma list armazena de acordo com a ordem de inserção
        */

        /*
          1. Na list, existe o método .sort para fazer comparação e ordenação após passar o Comparator, mas como na ordem
             natural já está sendo utilizado o comparable, não será possível utilizar o método Comparator.
          2. O collection tem o método .sort e recebe uma list que para ser organizada, tem que ter o método Comparable
             que já está implementado.
        */

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos); //será passado a lista de gatos c/elementos do tipo gato e organizado de acorso com o comparable
        System.out.println(meusGatos);

        /*
          - A seguir será utilizado o Comparator para a ordenação. Como o comparable já foi sobrescrito, para fazer novas comparações
            tem que utilizar o Comparator. A cada ordenação vai mudando.
          - Para implementar o comparator criar uma classe e passar em .sort
        */

        System.out.println("--\tOrdem Idade\t---");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
        //Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor()); //imprimir por ordem de cor
        System.out.println(meusGatos);

        /*
          - Ordenar por nome, cor e idade significa:
            1. Ordenar por nome e se forem iguais, olhar as cores dos gatos;
            2. Se as cores dos gatos forem iguais, olhar pela idade dos gatos;
            3. Mas se nome, cor e idade forem iguais, os gatos são iguais. Logo, não precisa ordenar.
          - Inserir essa lógica dentro da classe ComparatorNomeCorIdade.
        */

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        //Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}
    /*
      - Criar a class
      - Implementar a interface comparable para organizar de acordo com a ordem natural uma list/classe/ alt+enter (intellij)
      - O comparable obriga a sobrescrever o método compareTo() que retornará um índice que vai sendo organizado na ordem,
        mas neste caso a comparação será entre nomes, logo é string. Portanto, será utilizado o método da própria string
        que é o compareToIgnoreCase() que fará essa comparação retornando um índice. Logo, quando for interger será diferente
        para sobrescrever
    */
class Gato implements Comparable<Gato>{
    private String nome; //atributo
    private Integer idade; //atributo
    private String cor; //atributo

    //Criar o construtor
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    //Criar o Getter por ter utilizado o private
    public String getNome() { //getter
        return nome;
    }
    public Integer getIdade() { //getter
        return idade;
    }
    public String getCor() { //getter
        return cor;
    }

    //Sobrescrever o toString() para não imprimir o endereço de memória
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    /*
      - Implementado para sobrescrever o método compareTo()
      - Ordenação através dos nomes dos gatos
      - O método compareTo() retorna um int que vai sendo organizado na ordem, mas o nome é uma ‘string’. Como resolver?
      - A ‘string’ tem um método .compareToignoreCase() que faz a comparação retornando um índice: quando retornar zero
        significa que:
        1. O gato que está a ser comparado com outro, possuem nomes são iguais;
        2. Se retornar 1 o gato que estou comparando tem que ficar depois, pois é maior que o outro gato;
        3. se retorna -1 o gato que estou comparando é menor que o gato que está a ser comparado.
      - Foi utilizado o this porque está dentro da classe Gato
    */

        @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome()); //poderia ser a alterantiva compareTo() também
    }
}

//criar classe e implementar a interface comparator que vai comparar Gato
class ComparatorIdade implements Comparator<Gato> { //alt+enter parai mplementar o método compare/comparar por idade (int)
    @Override
    public int compare(Gato g1, Gato g2) { //gato 1 e gato 2, pq é uma classe externa
        return Integer.compare(g1.getIdade(), g2.getIdade());
        //será passado 2 int (g1 e g2) com retorno de 1 int (0, 1 ou -1) p/comparar e ordenar a list
    }
}

    /*
      - Está sendo comparado as cores (strings) dos gatos, Logo:
        1. Se forem iguais retorna o número 0;
        2. Se o g1 > g2 retornará 1;
        3. Se g1 < g2 retorna -1.
      - A partir dos números de retorno será feito o ordenamento.
*/
class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

    /*
      - Será criado para a lógica, variáveis temporárias;
      - Se todos forem iguais, os gatos são iguais.
     */
class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome()); //comparação entre strings
        if (nome != 0) return nome; //se o retorno for 1 ou -1 ordenar por nome, pq ambos serão diferentes retornando o nome.

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor()); //se os nomes forem iguais, ordenar por cor. É o 2º critério de desempate.
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade()); //se nomes e cores forem iguais, ordenar por idade.
    }
}

/*
  1. Criar uma classe Gato (dentro do mesmo script por ser pequena) com os atributos nome, idade e cor;
  2. Criar o construtor (alt + insert) com os atributos;
  3. Criar o Getter (alt + insert) para utilização porque está definido como private na classe Gato;
  4. Criar uma List para inserir os gatos, importar e criar um ArrayList();
  5. Entre chaves inserir os atributos e imprimir para testar;
  4. Sobreescrever com ToString() (alt + insert) dentro da classe Gato para não imprimir o endereço de memória impresso
     anteriormente no teste de impressão;
  5. A list adiciona por padrão pela ordem de inserção, a não ser que seja solicitado a mudança da ordem;
  6. Na ordem aleatória utilizar .shuffle da classe collection e passar o nome da List, pois não há método da List para tal;
  7. Imprimir para testar a ordem aleatória;
  8. A organização pela ordem natural, será usado o comparable na classe Gato para compará-los de acordo com os nomes;
  9. Implementação da interface comparable na classe Gato comparando Gato;
  10. Com o cursor do mouse em Comparable usar alt + enter para implementar os métodos CompareTO() na classe;
  11. Sobrescrever o CompareTo(), com o objetivo de ordenar através da comparação dos nomes dos gatos;
  12. Utilizar em Ordem idade, o método .sort de Collections passando desta vez o comparator como argumento e;
  13. Chamar o .sort que recebe um Comparator;
  14. Criar o ComparatorIdade e implementar a interface comparator que vai comparar Gato por idade (Int);
  15. Será necessário implementar o método compare() e passar g1 e g2 porque se trata de uma classe externa;
  16. O próprio Interger possui o método .compare(x,y) para fazer a comparação para retornar um int (0, 1 ou -1);
  17. Passar a classe comparatorIdade() no método .sort e para cada vez que for feita a ordenação será mudado;
  18. Criar as classes ComparatorCor e ComparatorNomeCorIdade e implementar a interface comparator de Gato e sobrescrever;
  19. Como a cor do gato é do tipo String, utilizar o mesmo método do nome;
  20.
*/