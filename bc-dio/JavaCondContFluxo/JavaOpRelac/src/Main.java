/*
   Classe de exemplo para o exercício da Aula 1 de Operadores lógicos e relacionais, Controle de fluxo e Blocos.

   Proposta: Criar um simples projeto no IntelliJ para realizar as comparações dos slide anterior, além de utilizar
   os demais tipos de dados não apresentados.

   1.Nem todo comparador seja ele relacional de tamanho ou de similaridade podem ser aplicados a todos os tipos
   de dados.
   2.Algumas operações, embora possuam tipos de dados distintos possuem semelhanças.
   3.String é uma classe e objetos são criados de classes. Ter cuidado ao usar operadores de similaridade com classes
     e objetos
 */

public class Main {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        //Tipos de dados do bloco 1 - inteiro

        //comparadores relacionais de similaridades
        System.out.println("i1 == i2 " + (i1 == i2)); //false
        System.out.println("i1 != i2 " + (i1 != i2)); //true
        //comparadores relacionais de tamanho
        System.out.println("i1 > i2 " + (i1 > i2)); //false
        System.out.println("i1 <= i2 " + (i1 <= i2)); //true

        //Tipos de dados bloco 2 - float

        //comparadores relacionais de similaridades
        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        //comparadores relacionais de tamanhos
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 < f2 " + (f1 < f2));

        //Tipos de dados bloco 3 - char

        //comparadores relacionais de similaridades
        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        //comparadores relacionais de tamanhos
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        //Tipos de dados bloco 4 - strings

        //comparadores relacionais de similaridades
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
        //comparadores relacionais de tamanhos - erro
        //System.out.println(s1 >= s2);
        //System.out.println(s1 < s2);

        //Tipos de dados bloco 5 - booleanos

        //comparadores relacionais de similaridades
        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        //comparadores relacionais de tamanhos - erro
        //System.out.println(b1 > b2); //true é > false? lógica inválida
        //System.out.println(b1 <= i1);

        //Tipos de dados bloco 6 - string, char

        //comparadores relacionais de tamanho/similaridade
        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " + (d1 == h1));
        //comparadores relacionais de similaridade - erro
        //System.out.println(s2 != c1); //string e char - inválido e apesar do char ser string, no seu mais baixo nível é um código numérico
        //System.out.println(s3 != i1); //string e int - inválido


        ////Tipos de dados bloco 7 - long, byte, short

        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l2 >= i1 " + (l2 >= i1));
        System.out.println("y1 != h1 " + (y1 != h1)); //apesar dos tipos de dados distintos são numéricos
    }
}
