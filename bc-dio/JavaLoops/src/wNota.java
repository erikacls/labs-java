
/*
  - Loop while
  - Proposta: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e
    continue pedindo até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class wNota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //classe Scanner (leitor) que pede entrada de dados por teclado, pode usar outras se desejar.

        int nota;

        System.out.println("Nota: "); //o valor pedido será atribuído na variável nota
        nota = scan.nextInt(); //se a nota for válida 0 - 10 será executado e não vai entrar no while

        //loop de repetição para caso a nota seja inválida
        while(nota < 0 | nota > 10) { //condição para entrar no while, se retornar true.
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt(); //solicita novamente uma nota válida 0 - 10
        }
    }
}