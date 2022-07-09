/*
Estrutura condicional - If e Else

A ideia é fazer uma tomada de decisão sobre qual fluxo deve tomar

obs.:

1. O else não é obrigatório, no caso da condicional não for verdadeira ele continuará o fluxo da aplicação
2. Quando ter mais de uma possibilidade encadear preferencialmente entre if e else

*/

public class CondicionalIfElse {

	public static void main(String[] args) {
		
        //Exemplo 3

        //aprovado >= 7
        //exame >=5 e <7
        //reprovado <5

        double nota = 5.5;

        if (nota >= 7) {
        	System.out.println("Parabéns! Você foi aprovado!"); //vai ignorar a linha porque o valor não condiz
        } else if (nota >= 5 && nota < 7) { //vai executar
        	System.out.println("Você está de recuperação!");
        } else { //vai ignorar
        	System.out.println("Estude mais! Você foi reprovado.");
        }

        /*   
        //Exemplo 2
        //Na estrutura dos if no exemplo será processada todas as linhas, mesmo após ter avaliado e executado a aprovação.
        //Em termos de performance isso não é interessante, apesar de funcionar. A forma para tratar é utilizando o else.
        
        
        //aprovado >= 7
        //exame >=5 e <7
        //reprovado <5

        double nota = 7.5;

        if (nota >= 7) {
        	System.out.println("Parabéns! Você foi aprovado!");
        }
        if (nota >= 5 && nota < 7) {
        	System.out.println("Você está de recuperação!");
        }
        if (nota < 5) {
        	System.out.println("Estude mais! Você foi reprovado.");
        }
        */

        /* 
        //Exemplo 1
		double preco = 10;

		if (preco > 0) {
			System.out.println("Produto cadastrado com sucesso");
		} else {
			System.out.println("Não foi possível cadastrar o produto");
		}
		*/
	}
}