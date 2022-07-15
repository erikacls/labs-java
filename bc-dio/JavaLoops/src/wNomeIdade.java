
/*
  - While
  - Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando
    a sua idade.
  - Pare o programa inserindo o valor 0 no campo nome
  - Para o leia - criar o fluxo de entrada através do teclado usando Scanner (ver leitura e escrita de arquivo em java)
*/

import java.util.Scanner;

public class wNomeIdade {

    public static void main(String[] args) {

        //Para fazer o import da classe Scanner basta selecioná-la e pressionar alt + enter
        Scanner scan = new Scanner(System.in); //representado pela classe Scanner e sua atribuição System.in

        //os dois valores pedidos
        String nome;
        int idade;

        //Para ler será utilizado o fluxo do scanner
        while(true) { //a proposta é criar o loop e ao inserir 0 n campo "Nome:" interromper

            System.out.println("Nome: ");
            nome = scan.next(); //será atribuído o Nome na variável nome, e utilizado o método next que retornará uma string que será atribuída na variável nome
            if (nome.equals("0")) break; //vai parar e sai do laço, e poderá continuar executando se tiver algo fora

            System.out.println("Idade: ");
            idade = scan.nextInt(); //mesmo lógica, mas será retornado inteiro.
        }
            System.out.println("Continuação fora do laço..."); //execução fora do laço
    }
}

/*
 main
 classe scanner
 definição de variáveis
 impressão e método next.
 envolver comandos no laço do while {}, com parâmetro true ou false
 implementar condicional - se nome for igual a zero, parar o loop (ele sairá do laço)
 impressão fora do laço
*/