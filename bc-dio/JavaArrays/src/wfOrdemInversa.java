
/*
  - Array
  - Proposta: Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
  - Array unidimensional - uma linha com uma ou várias colunas
*/

public class wfOrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4}; //array/vetor do tipo int, com 6 elementos e posicionados entre 0 - 5.

        //System.out.println(vetor.length); //retorna o tamanho do vetor, mas para navegar não existe posição 6 (0 - 5)

        System.out.print("Vetor: ");

        int count = 0; //controla o loop
        while(count < (vetor.length)) { //a propriedade lenght retorna o tamanho do array 0 - 5
            System.out.print(vetor[count] + " "); //mostra cada elemento do array/vetor na posição de count
            count++;
        }

        System.out.print("\nVetor: "); //o \n pula uma linha
        //Entrada no for
        for(int i = (vetor.length - 1); i >= 0; i --) { //o -1 na propriedade lenght é por não existir a posição 6/ o i -- inverte
            System.out.print(vetor[i] + " ");
        }
    }
}

/*
  Passos:
  - Declarar os tipos (int) dos elementos (de mesmo tipo e aleatórios) que vão conter dentro do array/vetor, ou seja, entre colchetes []
  - A posição do array/vetor começa com zero 0 - 5 totalizando 6 elementos. A ordem e definida na sua criação e imutável.
  - Criar um laço e a cada interação/loop será percorrido no array para pegar cada elemento. Será usado o while, mas pode usar o for each.
  - Criar contador
  - Criar laço for para inverter a ordem das posições

*/