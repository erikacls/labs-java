
/*
  - Do While
  - Proposta: Faça um programa que leia 5 números o informe o maior número e a média desses números
*/

import java.util.Scanner;

public class dowMaiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //dados de entrada dos números com a classe Scanner

        int numero;
        int maior = 0; //zero porque não tem o maior número
        int soma = 0; //média - armazena a soma de todos os números adicionados

        int count = 0; //começa com 0 porque ainda não fez o laço

        do { //independente se é true/false vai passar pelo do, porque é onde será executado os dados de entrada.

            System.out.println("Número: "); //será pedido o número
            numero = scan.nextInt(); //armazenamento na variável do número recebido

            soma = soma + numero;

            if (numero > maior) maior = numero; //a variável maior terá o mesmo valor da variável número

            count = count + 1; //contagem dos valores para armazenar na variável count, sendo < 5 cairá no loop do while

            //System.out.println("Maior: " + maior); //se desejar ver o maior durante a execução do laço

        } while(count < 5); //condição - true para entrar no while e seguir nova solicitação de número, contagem até 5 e parar.

            System.out.println("Maior: " + maior); //imprime quando encerra o laço do while por isso está fora
            System.out.println("Média: " + (soma/5)); //cálculo da média
    }
}

/*
  Crie um laço que peça 5 números
   1. abrir o fluxo com Scanner
   2. criar a variável número
   3. pedir esse número 5x, portanto inserir o comando dentro do laço do while
   4. criar o laço do while: do {} while(); condicionado a true/false
   5. como saber se entrou 5x no laço? criar um contador (variável) que aumente a unidade até completar o laço (5x)
   6. para informar o maior número cria-se outra variável para armazená-lo
   7. criar uma condicional if dentro do laço com a lógica para saber se o número é maior e exibir na tela
   8. para saber a média, cria-se uma variável e o cálculo para execução
*/