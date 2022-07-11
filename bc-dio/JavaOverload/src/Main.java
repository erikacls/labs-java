/*

Aula 2 #JavaMethods

Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
Obs: Use sobrecarga (Overload)

obs.: De acordo com a quantidade de parâmetros que vamos passando a linguagem Java vai conseguir determinar
qual área quero calcular

 */

public class Main {

    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Exercício quadrilátero");

        Quadrilatero.area(3); //pego a classe seguindo do ponto e passo uma mensagem para o método área - quadrado
        Quadrilatero.area(5d,5d); //retângulo com 2 doubles
        Quadrilatero.area(7,8,9); //trapézio
        Quadrilatero.area(5f,5f); //losango com 2 floats
    }
}