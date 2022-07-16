
/*
  - Array Multidimensional
  - Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 - 9
*/

import java.util.Random;

public class forMudimen {

    public static void main(String[] args) {

        Random random = new Random();

        //criar um array multidimensional, uma matriz
        int[][] M = new int[4][4]; // Linha[4] e coluna[4]

        //Navegar dentro da matriz geral
        for(int i = 0; i < M.length; i++) { //pega a primeira linha dentro da matriz geral
            for( int j = 0; j < M[i].length; j++) { //percorre a linha
                M[i][j] = random.nextInt(9); //percorrer linha [i], posição [j] coluna e colocar um número aleatório
            }
        }

        //Mostra os elementos inseridos dentro da matriz

        System.out.println("Matriz: ");

        //For Each - for( : ){};
        for (int[] linha : M  ) { //Percorre a linha
            for (int coluna : linha ) { //pegar cada elemento dessa coluna para imprimir
                System.out.print(coluna + " "); //a coluna representa o elemento
            }
            System.out.println(); //vai pular linha no fluxo até completar toda a matriz M
        }
    }
}

/*
  Representação da matriz 4x4

  X X X X
  X X X X
  X X X X
  X X X X

  Cada linha vai representar um array unidimensional
  Cada coluna representa os elementos de dentro desse array
  Cada elemento, neste caso, será representado por um número (int) aleatório entre 0 - 9
  No exemplo, tem 4 arrays
  Para cada elemento [x] poderia ter um outro array, é plenamente possível.

  O For Each - vai pegar a matriz geral, percorrer por cada linha dessa matriz para pegar cada elemento dessa linha
  Cada linha dessa matriz é um array
*/