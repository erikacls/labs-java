/*

Manipulando variáveis/Tipos primitivos

Obs.:

1. Quanto maior o tipo de dado, maior o consumo de memória para armazenar essa informação
2. O java em uma operação sempre vai armazenar a informação no tipo que possuir maior capacidade, como o double comparado com o int

*/

class ManipulandoVariaveis {
	public static void main(String[] args) { //método ponto-de-entrada (start)

		//ex casting 2
		double valorDouble = 14.78;
		float valorFloat = 15.3f;

		valorFloat = (float) valorDouble; //atribuição do valor double no float com casting, porque a capacidade de armazenamento do float é menor que double

		System.out.println("Float: " + valorFloat); //não perde precisão porque o float tem capacidade de guardar casa decimal
		
		/*
		//ex casting 1
		int tipoInteiro = 10; //não armazena casas decimais diretamente, precisa de conversão com o casting mas perde precisão
		float tipoFloat = 15.6f;

		tipoInteiro = (int)tipoFloat; //atribuição de valor do float para um inteiro fazendo um casting

		System.out.println("valor do float: " + tipoFloat);
		System.out.println("valor do inteiro: " + tipoInteiro); //perde a precisão da casa decimal .6 por não ter capacidade de manter número decimal
        */

		/*
		char letra = 'a'; //Tipo char - armazena apenas um caractere

		System.out.println("Letra " + letra);
		*/

		/*
		boolean permitido = true; //tipo booleano - criação de uma flag com true or false (dois valores)

		System.out.println("É permitido? " + permitido);
		*/

		/*
		int quantidadeDoProduto = 100;
		double valorDoProduto = 3.65; //double > int - capacidade de aramazenamento, logo retornará um resultado do tipo double
        
        System.out.println("Quantidade: " + quantidadeDoProduto);
        System.out.println("valorDoProduto: " + valorDoProduto);

		double resultado = quantidadeDoProduto * valorDoProduto; //operação multiplicação

		System.out.println("Resultado: " + resultado);
		*/

		/*
		long quantidade = 100; //é variação de int com maior capacidade de armazenamento

		System.out.println(quantidade);
		*/

		/*
		float salario = 14500.88f; //armazena valor com casas decimais, pontos flutuantes mas com capacidade menor que double

		System.out.println(salario);
		*/

		/*
		double salario = 14500.88; //armazenar valor com casas decimais

		System.out.println(salario);
		*/

		/*
		int idade; //declaração de variável com tipo inteiro e nome 
		idade = 18; //atribuição de valor a variável
		
		System.out.println(idade); //printa mensagem no console/tela
		*/

	}
}