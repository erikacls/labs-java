/*

Classe de exemplo para o exercício da aula 4 de conversão - casting

Proposta: criar variáveis de vários tipos diferentes para assim realizar casting(conversões).

Obs.:

- coversões podem ser feitas entre qualquer tipo de dado
- Downcast é sempre explícito, é preciso informar para qual valor está convertendo
- Upcast - é sempre implícito, não causa perda de informações e sobra espaço.

*/

public class convCasting {

	public static void main(String[] args) {

		//Downcast - short > byte
		byte b1;
		short s1 = 1000; //se tranformou em -24
		b1 = (byte) s1; 
		/*
		- conversão de um short para um byte e o short > byte fazendo um downcast - redução da capacidade de representação do short 
        - ocasionará perda de informação pq o byte suporta valores menores
		*/

		//Upcast - long > int
		long l1;
		int i1 = 10;
		l1 = i1; //inteiro colocado no long - promoção, logo, sem perdas de informações - sobra espaço de armazenamento

		//Downcast - long > int
		int i2;
		long l2 = 1000000000000000000L; //fora do limite máximo suportado por um int e retornará um valor negativo significativo
		i2 = (int) l2; //long -> int, log haverá perdas de infor.

		//Downcast - long > int
		int i3;
		long l3 = 10000L; //valor cabe dentro de um int, logo, não haverá perdas
		i3 = (int) l3;

		//Upcast
		double d1;
		float f1 = 10.5f; //valor float promovido para double, sobra espaço de representação
		d1 = f1;

		//Downcast
		float f2;
		float f3;
		double d2 = 10000.58d; //valor cabe dentro do float (f2)
		f2 = (float) d2;
		double d3 = 10000.5888888888888888888888888888888888888888888888888888888888888888888888888888888888888d; //float não suporta essa quantidade de casas decimais, haverá perdas de inf.
        f3 = (float) d3;

		//Downcast
		int i4;
		float f4 = 11.5697f;
		i4 = (int) f4; //valor fracionado para int pode ocasionar perda de informações (truncar/ignorar o valor fracionado e só usa a parte inteira. Só o valor 11 será convertido)

		System.out.println("b1:" + b1);
		System.out.println("l1:" + l1);
		System.out.println("i2:" + i2);
		System.out.println("i3:" + i3);
		System.out.println("d1:" + d1);
		System.out.println("f2:" + f2);
		System.out.println("f3:" + f3);
		System.out.println("i4:" + i4);

		//Downcast - double > byte
		b1 = (byte) d3; //informado o tipo de destino - retornará apenas 16

		System.out.println("b1:" + b1);

	}


}