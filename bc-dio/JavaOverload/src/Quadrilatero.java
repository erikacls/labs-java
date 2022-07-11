/*

Aula 2 #JavaMethods

Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
Obs: Use sobrecarga (Overload)

1. Mantém-se o nome do método area e altera a sua lista de parâmetros, ou seja, muda a sua assinatura.
2. Assinatura = nome + lista de parâmetros
3. A sobrecarga é chamada na class main.java

Obs.: Não é só o nome do parâmetro que muda a assinatura do método, mas o tipo de dado. Em especial quando coincide com
      o número de parâmetros entre duas sobrecargas.
      Todos são do tipo double, enquanto quantidades diferentes. O losango foi alterado para float porque coincide em quantidade
      nos parâmetros (dois) com o retângulo.

*/

//Temos quatro sobrecargas para o método de calcular a área
public class Quadrilatero {

    //área do quadrado/ass = nome + 1 parâmetro/sobrecraga 1
    public static void area(double lado) { //quadrado possui todos os lados iguais, logo, passar apenas um lado
        System.out.println("Área do quadrado:" + lado * lado);
    }

    //área do retângulo/ass = nome + 2 parâmetros/sobrecarga 2
    public static void area(double lado1, double lado2) { //os lados são iguais aos pares, passar dois lados
        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    //área do trapézio/ass = nome + 3 parâmetros/sobrecarga 3
    public static void area(double baseMaior, double baseMenor, double altura) { //passar três informações
        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }
    //área do losango
    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }
}