/*
  - For
  - Proposta: Faça um programa que calcule o fatorial (decomposição de um número multiplicando) de um número inteiro
            fornecido pelo usuário.

            Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)

   - Quando se deparar com uma situação em que precisar utilizar um contador optar pelo laço For
   - Quando se deparar com laços infinitos como while(true) e break utilizar apenas o while
   - O do while é quando precisa executar um programa pelo menos uma vez antes de conferir se a sentença é true/false
*/

import java.util.Scanner;

public class forFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1; //parte do 1 para não resultar em zero a cada laço

        System.out.print(fatorial +"! = ");
        //o início depende do fatorial/loop será inválido quando for menor que 1/usar o decremento.
        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i; //multiplica pelo i porque é o número que está sendo alterado
        }

        System.out.println(multiplicacao);
    }

}