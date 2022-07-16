/*
  - Array
  - Proposta: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
            Imprima as consoantes.
*/

import java.util.Scanner;

public class dwfConsoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //para ler se é vogal ou consoante

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0; //variável/controlador que indica quantas consoantes vai possuir dentro do array

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next(); //objetiva pegar uma letra e armazenar na variável

            //Lógica que distingue consoante de vogal

            //uso do método do objeto String para fazer comparações com a letra de entrada, e retornará true (p/ igual) e false (p/ diferente)
            //!() - vai identificar quando não for uma das vogais
            if ( !(letra.equalsIgnoreCase("a") | //equalsIgnoreCase (método/String) não é sensitive case
                   letra.equalsIgnoreCase("e") |
                   letra.equalsIgnoreCase("i") |
                   letra.equalsIgnoreCase("o") |
                   letra.equalsIgnoreCase("u")) )  {

                //Quando não for vogal, pegar o array de consoantes e na posição do contador será igual à letra digitada
                consoantes[count] = letra;
                quantidadeConsoantes++; //se for true, será somado à quantidadeConsoantes
            }

            count++;

        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        //for - para cada elemento do array consoantes imprimir esse elemento - consoante
        for ( String consoante  :  consoantes ) { //foreach - for(tipo:array) {} + nova variável - consoante
            if ( consoante != null) //comparação entre tipos diferentes/lógica para ocultar o null dos espaços não ocupados
                System.out.print(consoante + " "); //para cada loop ler apenas consoante
        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);
    }
}

/*
  - abrir o fluxo do teclado com a classe scanner
  - criar um array [de 6 posições que é um objeto] do tipo string [poderia ser char] para armazenar apenas as consoantes,
    ignorando as vogais digitadas pelo usuário
  - independente de ocupar ou não as posições, o array terá sempre espaço para 6 elementos
  - String é um objeto do java, a posição não ocupada ficará marcada com null
  - criar variável que controla a quantidade de consoantes
  - criar o laço do {} while(); com seu contador
  - criar condicional para diferenciar consoante de vogal e adicionar na variável
  - imprimir as consoantes

  Obs.: Quanto ao null se fosse um array de int por default retornaria com valor zero, com double seria 0.0 etc.

*/