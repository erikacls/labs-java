/*
  - For
  - Proposta: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
            O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo
            abaixo:

            Tabuada de 5:
            5 X 1 = 5
            5 X 2 = 10
            ...
            5 X 10 = 50
*/

import java.util.Scanner;

public class forTabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i = i + 1) { // contador iniciado + operação + incrementos
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}

/*
  Passos:
  - ponto de entrada main ()
  -  import classe scanner (entrada de dados)
  - definição de variável e captura dos dados
  - criar loop for ( : : ) {};
    - Inserir nos parâmetros contador i com um valor começando com 1
    - definição do contador onde i <= 10 (Qtd de vezes)
    - incrementar o contador i++ ou i = i + 1 (controle do laço for incrementando +1)
    - trascrição da multiplicação da tabuada
*/