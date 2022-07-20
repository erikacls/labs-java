/*
  Estrutura de Dados - Arrays - Desafio 3
  Proposta: O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma
            coleção de dados em um bloco de memória.

            Desenvolva um programa que guarde em um vetor nomes de funcionários de uma empresa.  Deve-se permitir que, ao indicar o
            índice do vetor, seja indicado qual funcionário está armazenado dentro dessa memória.

            Entrada
            As primeiras 5 linhas da entrada deverá contar o vetor NOMES com 5 espaços na memoria, a última linha deverá conter a
            posição escolhida do vetor.

            Saída
            A saída deverá retornar o nome de acordo com a posição do vetor escolhida anteriormente, conforme exemplo abaixo.

            Entrada | Saída
            João      Joana

            Maria
            Carlos
            Karla
            Joana

            4

           Entrada | Saída
           Julia     Rafael
           Kleber
           Rafael
           Felipe
           Adriana
           2
*/

// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class estDadosArraysD3 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        //String[] nomes = new String[];
        for (int i = 0; i < nomes.length; i++)
        {
    //complete os espaços em branco com sua solução para o problema
            nomes[i] = input.nextLine();
            //nomes[ ] = input.nextLine();
        }

        int pos = input.nextInt();
        System.out.println("" + nomes[pos]);
        //System.out.println(            );

    }
}
