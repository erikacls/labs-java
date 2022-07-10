/*

Classe de exemplo para o exercício da aula 3 de operadores aritméticos

Proposta: Crie expressões em que as precedências influenciem nos resultados

*/

public class OpAritmeticos {

	public static void main(String[] args) {

		System.out.println("PrePos");
		prePos();
		System.out.println("Aritmético");
		aritmetico();
		System.out.println("Atribuição");
		atribuicao();
		System.out.println("Precedência");
		precedencia();

	}

    private static void prePos() {

    	//Atribuições simples
    	int k = 10; //iniciar a variável k para fazer o pre e pós-fixado

        int i = ++k; //prefixado - somar para depois atribuir unidade em i, ou seja, i recebe 11
	    int j = k--; //primeiro atribuir o k ao j para depois subtrair. O j receberá 11, mas o k depois se transformará e 10 
	    int x = k; //comprova o recebimento de k da operação anterior

	    System.out.println("i:" + i);
	    System.out.println("j:" + j);
	    System.out.println("x:" + x);

    }

    private static void aritmetico() {

        //Atribuições simples
    	int a = 10;
    	int b = 20;
    	int c = 30;
    	int d = 40;
    	int e = 50;

        //Armazenamento em variáveis de resultado
    	int r1 = a+b; //30
    	int r2 = c-a; //20
    	int r3 = d+b; //800
    	int r4 = e/a; //5
    	int r5 = c%b; //o resto dessa divisão será 10

    	System.out.println("a+b " + r1);
    	System.out.println("c-a " + r2);
    	System.out.println("d+b " + r3);
    	System.out.println("e/a " + r4);
    	System.out.println("c%b " + r5); //mod

    }

    private static void atribuicao() {

        //Atribuições simples
    	int i = 1500;
	    short j = 15;
	    long l = 500L;
	    int k = 35;
	    float f = 3.5f; //expressividade que o valor é float
	    double d = f; //atribuição de variáveis, onde f foi definida na linha anterior

	    System.out.println("d:" + d); //mostrar que d recebeu o valor de f

	    //Atribuição composta
	    i += 5; // i = i + 5 resultará em 1505
	    j -= 3; // j = j - 3
	    d /= 2.7d; // d = d / 2.7d
	    l *= 3; // l = l * 3 resultará em 1500
	    k %= 2; // k = k % 2 recebe o resto da divisão 35/2 = 1

	    System.out.println("i:" + i);
	    System.out.println("j:" + j);
	    System.out.println("d:" + d);
	    System.out.println("l:" + l);
	    System.out.println("k:" + k);

	    i = k = j; //atribuição composta por atribuições simples.O k recebe j e i recebe k. O j = 12, logo k e i ficaram com o mesmo valor.

	    System.out.println("k:" + k);
	    System.out.println("i:" + i);

    }
    
    //mesclar aritméticos + pre e pós-fixados + atribuições
    private static void precedencia() {

    	int i = 10;
	    int j = 20;
	    int k = 30;

	    //consultar tabela de precedência
	    int a = i++ + --j * k; //10 + 19 * 30 -> 10 + 570 -> 580

	    System.out.println("i++ + --j * k: " + a); //só após esta execução o i vai para 11

	    System.out.println("i: " + i); //11

	    int b = k / --i % 3 + 1; //30 / 10 % 3 + 1 -> 1

	    System.out.println("k / --1 % 3 + 1: " + b);

	    System.out.println("i: " + i); //10

	    int c = 2;

	    //atribuição composta com outras atribuições compostas
	    c *= i += 5; //c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 + 5; -> c = 2 * 15; c = 30

	    System.out.println("c *= i += 5: " + c);
    }
}