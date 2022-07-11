
/*
  Classe de exemplo para o exercício da Aula 3 - return #JavaMethods

  Os métodos não são void, mas double. Antes tinha o System.out.println para mostrar o resultado da operação da área das figuras.
  Agora retornará o valor desejado com o uso da palavra reservada return (instrução de interrupção) com double que representa cada
  uma das áreas.

  Como fazer para chamar o método area e armazenar o valor retornado para usar em um segundo momento? É o que está na Main.java
*/

public class Quadrilatero {
    public static double area(double lado) {
        return lado * lado;
    }
    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }
    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior+baseMenor)*altura) / 2;
    }

    //É possível se ter um método void com retorno, basta ter uma lógica que possibilite isso.
    public static void xpto() {
        System.out.println("Antes");
        return;
    }

    //o retorno do método deve ser compatível com o que está na sua definição
    public static double abc() { //se manter um long ao invés do double para o valor 1.6 geraria erro
        return 1.6; //no caso de manter um long seria necessário alterar para o valor 1
    }
}
