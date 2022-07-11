/*
  Classe de exemplo para o exercício da Aula 3 - return #JavaMethods #JavaOverload

  Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. Agora faça o smétodos retornarem valores.

  Na primeira versão, os métodos apenas escreviam no console, porque todos eram void. Agora, que o retorno dos métodos
  sejam compatíveis com os parâmetros que serão passados. Antes era passado para fazer a sobrecarga como tipos
  primitivos diferentes e inteiros mais especificamente. Agora esses métodos das áreas devem retornar tipos compatíveis
  com esses parâmetros.

  As chamadas são iguais a v1 da aula 2, entretanto agora temos a capacidade de armazenar estes valores em variáveis, porque
  esses métodos retornam valores, doubles.

  Nesta classe inserimos as mensagens que antes estavam dentro dos métodos das áreas. Quem mostra agora as mensagens não é mais
  o método da área e sim o System.out.println da Main.java

*/

public class Main {

    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }
}