
/*
  - Ordenação Set
  - Proposta: Dadas as seguintes informações sobre minhas séries favoritas, crie um conjunto e ordene este conjunto
            exibindo o nome, genero e tempo de episódio:

            Série 1 = nome: got, genero: fantasia, tempoEpisodio: 60;
            Série 2 = nome: dark, genero: drama, tempoEpisodio: 60;
            Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25.

            Sugestão: criar uma classe de cada série para inserir os atributos nome, genereo e tempo de episódio.
*/

import java.util.*;

public class exOrdSet {

    public static void main(String[] args) {

        /*
          Será criado o Set de Serie, nomear e iniciar o HashSet (ordem aleatória). Entre chaves, usar o add e instanciar
          a Serie com os atributos.
        */
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<Serie>(){{ //inicia o HashSet
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " //For each( : )
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        /*
          Utilizar o LinkedHashSet
        */
        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        /*
          Para organizar de acordo com a ordem natural que no caso é o TempoEpisodio, utilizar a implementação TreeSet.
          Para não gerar erros deverá criar um comparable para a class Serie e a ordem natural que diz comparar por
          TempoEpisodio. Como o tempo de dark e got são iguais, irá ordenar por genero. Por coincidencia no teste, o d
          veio na frente do g.
        */
        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        /*
        Utilizar a classe Comparator e ao invés de receber uma lista em TreeSet, será colocado o Comparator e também
        criada a classe ComparatorNomeGeneroTempoEpisodio para implementar o Comparator.
        Adicionar elementos no TreeSet com o add ou pelo método .addall que recebe uma collection, será passada minhasSeries.
        Quando minhasSeries for adicionada em minhasSeries3 será organizada por nome, genero e tempo de episódio. E como os
        nomes são diferentes os demais atributos foram ignorados, como por exemplo,o tempo de episódio que são iguais entre
        got e dark. Se os nomes fossem iguais ia testar por genero..
        */
        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()); //passar a classe ComparatorNomeGeneroTempoEpisodio
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodio());

        //Exercícios

        //System.out.println("--\tOrdem gênero\t--");
        //System.out.println("--\tOrdem Tempo Episódio\t--");
    }
}

    /*
      Classe Serie
      Implementar o Comparable e ordenar Serie implementando o método/compareTo
    */
class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    //Construtor
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    //Getters (selecionar os 3 atributos)
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    //Sobrescrever toString()
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    /*
      Sobrescrever os métodos equals() e hashCode(), quando está sendo utilizado implementações que no nome tem a palavra hash.
      A própria IDE faz isso, com alt + isert pedir para sobrescrever dizendo querer que faça as comparações do hashCode, como
      nome, genero e TempoEpisodio. Enquanto, o equals faz a verificação se o objeto que está sendo pesquisado possui o hashCode
      dentro da classe.
    */

    @Override
    //sobrescrever o método equals()
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    //sobrescrever o método hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    /*
      - Está sendo trabalhado com integer. A saída tem que ser 25 min, mas como fazer a comparação de Dark e Got se são iguais?
      O Set não recebe objetos iguais, portanto, deverá inserir um critério de desempate.
        1. Quando comparar com tempo e for igual, comparar com genero;
        2. Quando o tempoEpisodio for diferente de zero retorna o tempoEpisodio, senão retorna genero;
    */
    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }
}

    /*
      Criar a classe ComparatorNomeGeneroTempoEpisodio
      Implementar o Comparator de Serie e o método compare
      Sera comparado por nome, genero e tempo de episódio.
        1. Se os nomes das séries forem diferentes, será comparado por nome;
        2. Se os nomes forem iguais, tentar o desempate com o genero;
        3. Se generos forem diferentes, compara por genero;
        4. Se nomes e generos forem iguais, comparar pelo tempo de episódio;
        5. Se o tempo de episódios forem iguais e o restante também como consequência, a série é a mesma.
      Colocar a classe ComparatorNomeGeneroTempoEpisodio no construtor do TreeSet
    */
class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

/*
  - Criar a classe Serie e inserir os atributos nome, genero e TempoEpisodio;
  - Construtor;
  - Guetters;
  - Sobrescrever os métodos equals() e hashCode();
*/