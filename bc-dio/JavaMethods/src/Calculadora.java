
/*
Classe de exemplo para o exercício das Aulas de Métodos #JavaMethods

Proposta: Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.

Criação dos 4 métodos para realizar 4 operações básicas (adição, subtração, multiplicação e divisão)

public - define a visibilidade
static - o tipo é o modificador do método
void - sem retorno
nome do método com seus parâmetros

Obs.: Usá-los na class principal main.java (local para execução)

*/

public class Calculadora {

    //método soma
    public static void soma(double numero1, double numero2) { //público, estático e void (não vai ter retorno)
        double resultado = numero1 + numero2; //o resultado será armazenado na variável temporária - resultado
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }
    //método subtracao
    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }
    //método multiplicacao
    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }
    //método divisao
    public static void  divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }
}