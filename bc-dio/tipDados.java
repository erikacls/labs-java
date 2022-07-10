/*

Classe de exemplo para o exercício da aula 2 de variáveis, tipos de dados e operadores aritméticos

Proposta: criar duas variáveis para cada tipo de dado apresentado

*/

public class tipDados {

	public static void main(String[] args) {

		//INTEIROS

		byte b1 = 10;
		byte b2 = 20;

		short s1 = 20000;
		//short s2 = 40000; //erro - ultrapassa o limite máximo da capacidade do short

		//int i1 = -10000000000; //erro - limite inferior, o valor negativo está muito a baixo do menor valor negativo que um inteiro possa suportar
		int i2 = 28500;
        
        //o L no final diferencia o int de long que tem capacidade de armazenamento maior
		long l1 = 1000000000000000000L;
		long l2 = 2004005000500055000L;
        
        //VARIAVEIS REAIS/RACIONAIS/NºS FRACIONADOS

		//float f1 = 4.5; //erro - sem o f no final, a linguagem java interpreta que é um valor double. O d > f em armazenamento, logo 4.5 não cabe no float porque é um double.
		float f2 = 10.68f; //definição correta de float f ou F

		double d1 = 85.69; //por padrão não precisa definir com d no final
		double d2 = 99.04d;

        //TIPOS DE DADOS TEXTUAIS

		char c1 = 'w'; //caractere de forma explícita
		//char c2 = 'Tw'; //erro - porque tem dois caracteres
		char c3 = '\u0057'; //unicode de um determinado caractere implícito - w

		//TIPO DE DADO COMPOSTO, MAS COMO PRIMITIVO PORQUE É COMUM MANIPULAR TEXTOS
		String st1 = "Fulano";
		String st2 = "Cicrano";
		String st3 = "ag dgb se se et t KNBJBJBB &*&%& 75894389";

		//String dt1 = "09/02/1981"; //apesar de estar definida como string, mas existe outro tipo de dado para datas

		boolean bo1 = true;
		boolean bo2 = false;
        
        //Exibição dos valores
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s1);
		System.out.println(i2);
		System.out.println(b1);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(f2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(c1);
		System.out.println(c3);
		System.out.println(st2);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(bo1);
		System.out.println(bo2);
	}
}