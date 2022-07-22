/**
   Proposta: Apenas para praticar, crie uma interface chamada "OperacaoMatematica". Crie também 4 métodos das operações
   básicas: soma, subtração, multiplicação e divisão.
*/

package Interface06;

/**
   A classe Calc implementa a interface MathOp, e sobrescreveu, ou ainda, proveu todas as implementações de todos os métodos:
   soma, subtracao, multiplicacao e divisao.
   A filosofia de uma interface obriga a um terceiro implementar os métodos que será chamado dentro de algum processamento.
   Como os métodos foram implementados não importa, só se sabe que será necessário para utilizá-los. Como eles estão funcionando
   internamente é transparente.
   Se precisar de algum comportamento parão (jdk 8+) na interface é possível obter uma implementação de uma método dentro da
   interface.
 */

class Calc implements MathOp {

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " + operando1 + operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtracao: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("multiplicacao: " + operando1 * operando2);
    }

    @Override
    public void divisao(double operando1, double operando2) {
       System.out.println("multiplicacao: " + operando1 / operando2);
    }
}