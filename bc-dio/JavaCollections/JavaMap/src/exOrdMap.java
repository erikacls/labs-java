
/*
  - Ordenação Map - Ordenar elementos dentro de um Map

  - Proposta: Dadas as seguintes informações sobre os meus livros favoritos e os seus autores,
              Crie um dicionário e ordene este dicionário, exibindo (Nome Autor - Nome Livro):

              1. Autor = Hawking, Stephen  - Livro = nome: uma Breve História do Tempo. páginas: 256;
              2. Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, páginas: 408;
              3. Autor = Harari, Yuval Noah - Livro = 21 Lições Para o Século XXI, páginas: 432.
*/

import java.util.*;

public class exOrdMap {

    public static void main(String[] args) {

        /*
          - Criar a classe Livro e inserir os atributos nome e páginas, construtor, getters
          - Como será trabalhado com HashMap, LinkedHashMap e TreeMap sobrescrever os métodos equals, hashcode
          - HashMap usado na ordem aleatória
          - Para trabalhar com elementos de forma separada utilizar .entrySet() e fazer um for each ( : ) para imprimir
            a chave e do valor apenas o nome.
        */
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<String, Livro>() {{ //Tipo String/Valor Livro/Import Map/objeto meusLivros
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256)); //inicia Livro
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        /*
          Ordem de inserção é LinkedHashMap
        */
        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>() {{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        /*
          Significa dizer ordenar de acordo com as chaves, utilizando a implementação TreeMap e passar como argumento
          meusLivros1 e pedir para imprimir.
        */
        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        /*
          Os nomes dos livros estão no valor, logo, será trabalhado com TreeSet porque é necessário passar o Comparator.
          Criar um Set, o tipo dos elementos dentro do Set será Map.Entry<chave, valor> e nomeado como meusLivros3. O Set
          será um TreeSet para ordenar em ordem alfabética dos nomes dos livros. Antes passar no construtor um comparator,

        */
        System.out.println("--\tOrdem alfabética nomes dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet()); //populada
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        //System.out.println("--\tOrdem número de página\t--"); //Pra você

    }
}
//class
class Livro {
    private String nome;
    private Integer paginas;

    //constructors
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    //sobrescrever os métodos equals, hashcode e tostring
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    //sobrescrever para não aparecer o endereço de memória
    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
/*
  - O objetivo é comparar por nome
  - Está sendo comparado o Set<Map.Entry<String, Livro>>
  - Será implementado o método compare
  - Nome é valor
*/
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
/*
  1. Criar a classe de livros e inserir os tributos nome e páginas;
  2. Criar o construtor;
  3. Criar os Getters;
  4. Sobrescrever os métodos equals, hashcode e tostring
  5. Criar no construtor o comparator para comparar o Set
  6. Implementar o método no comparator
*/