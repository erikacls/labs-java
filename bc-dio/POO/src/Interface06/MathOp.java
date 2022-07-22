
/**
   Interface de exemplo para o exercício das Aulas de Orientação a Objetos.
 */

package Interface06;

/**
   Definição da ‘interface’
   As 4 operações básicas com dois operandos
   Esses métodos não possuem corpo, ou seja, chaves {} é uma forma simples de se trabalhar com os métodos na interface
   A partir da versão 8 do Java há a possibilidade de métodos (complementação) defaults nas interfaces, antes não existia
   a possibilidade de existirem métodos com implementações, eram, portanto, sempre métodos vazios como o definido. E geralmente
   os métodos vazios combrem as necessidades.
 */
interface MathOp {

    void soma(double operando1, double operando2);

    void subtracao(double operando1, double operando2);

    void multiplicacao(double operando1, double operando2);

    void divisao(double operando1, double operando2);
}