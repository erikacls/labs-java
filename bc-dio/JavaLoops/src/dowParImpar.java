
/*
  - For
  - Proposta: Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a
    quantidade de números impares.
*/

import java.util.Scanner;

public class dowParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0; //vai receber depois um número conforme condicional if

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {

            System.out.println("Número: ");
            numero = scan.nextInt();

            //se o resto da divisão do número por dois for zero, o número é par, caso contrário ímpar
            if (numero % 2 == 0 ) quantPares++; //quantPares + 1, se essa condição for verdadeira soma-se a variável quantPares
            else quantImpares++; //se for diferente de zero é ímpar e somará +1

            count++;

        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}

/*
  1. main
  2. Scanner para dados de entrada via teclado
  3. criar variável e comandos para a quantidade de vezes que peça os números
  4. criar contador
  5. criar laço do {} while(); mais a condição
  6. incrementar o contador para controlar a repetição do laço, caso contrário o loop será infinito
  7. criar duas variáveis para números pares e ímpares
  8. criar condicional para incrementar as variáveis dos números pares e ímpares
*/