
/*
  - Array
  - Proposta: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) e armazene-os num vetor.
    Ao final mostre os números e os seus sucessores.
*/

import java.util.Random;

public class forNumAleatorios {

    public static void main(String[] args) {

        Random random = new Random(); //classe random que gera números aleatórios

        //A sintaxe int numerosAleatorios[] também funciona
        int[] numerosAleatorios = new int[20]; //array para guardar os números aleatórios e a posição

        //criar o laço for( : : ){}; para inserir os 20 números no array de números aleatórios
        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100); //Cria a variável numero para guardar o número gerado pela classe random/limite 100
            numerosAleatorios[i] = numero; //numero gerado pelo random
        }

        System.out.print("Numeros Aleatorios: ");
        //For Each - for( : ){}; - mais recomendado o uso para imprimir/output
        for (int numero : numerosAleatorios) { //cada elemento : array
            System.out.print(numero + " "); //imprime cada elemento
        }

        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        //For Each - for( : ){};
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " "); //imprime os antecessores
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        //For Each - for( : ){};
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " "); //imprime os sucessores
        }
    }
}

/*
  - O for each possui algumas limitações, não é possível ter acesso a uma posição específica do elemento dentro do array
*/