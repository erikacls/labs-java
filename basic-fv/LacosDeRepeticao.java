/*

Estrutura de Laços de repetição - While/For

1. A ideia é repetir determinado trecho de código por uma determinada quantidade de vezes
2. O while tem o propósito de repetir um determinado trecho de código, enquanto a expressão passada para ele varia como verdadeira
3. A estrutura do for difere do while
4.break e continue quebram o fluxo de execução

*/

public class LacosDeRepeticao {
	public static void main(String[] args) {

		//Exemplo 6 - De 1 a 10 printar somente os números ímpares
		for (int i = 1; i <= 10; i++) {
			System.out.println("Item: " + i); //mostrará a passagem/leitura do continue
        	if (i % 2 == 0) { //encontrar nº par - divide por dois e verifica se o resto é zero garantindo que o nº é par
        		    continue; //redireciona a execução para a próxima interação, ou seja, ele não vai seguir a execução se encontrar nº par irá para o próximo da lista
        		}
        		System.out.println("Número ímpar: " +i);
        	}

		/*
		//Exemplo 6 - De 1 a 10 printar somente os números ímpares
		for (int i = 1; i <= 10; i++) {
        	if (i % 2 == 0) { //encontrar nº par - divide por dois e verifica se o resto é zero garantindo que o nº é par
        		    continue; //redireciona a execução para a próxima interação, ou seja, ele não vai seguir a execução se encontrar nº par irá para o próximo da lista
        		}
        		System.out.println("Número ímpar: " +i);
        	}
        	*/

		/*
		//Exemplo 5 - Encontrar o primeiro nº par de 1 - 10 e em seguida sair da interação do for
        for (int i = 1; i <= 10; i++) {
        	if (i % 2 == 0) { //encontrar nº par - divide por dois e verifica se o resto é zero garantindo que o nº é par
        		System.out.println("Número par: " +i);
        		break; //o break é uma palavra reservada que trata a quebra a interação, faz com que o fluxo de execução da aplicação saia do for
        	}
        }
        */

		/*
		//Exemplo 4 - printar nºs pares de 1 a 10
        for (int i = 1; i <= 10; i++) {
        	if (i % 2 == 0) { //encontrar nº par - divide por dois e verifica se o resto é zero garantindo que o nº é par
        		System.out.println("Número par: " +i);
        	}
        }
        */

		/*
		//Exemplo 3 - for tem estrutura diferente
		for (int i = 0; i < 10; i++) { //criar/inicializar variável que vai controlar interação; criar expressão repetição laços; incrementar valor da variável

			System.out.println("Codando Simples");
		}
		*/

		/*
		//Exemplo 2 - while
		int i = 0;

		while (i < 5) { //Expressão booleana, enquanto i < 5 (valor verdadeiro) imprimir "Codando Simples"
			System.out.println("Codando Simples");
			i = i + 1; //incrementar o valor de i para não entrar em loop infinito
		}
		*/
        
        /*
        //Exemplo 1

		//Instrução para imprimir 5 vezes a mensagem Codando Simples sem o while
		System.out.println("Codando Simples");
		System.out.println("Codando Simples");
		System.out.println("Codando Simples");
		System.out.println("Codando Simples");
		System.out.println("Codando Simples");
		*/
	}
}