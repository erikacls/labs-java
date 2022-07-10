
/*

Classe de exemplo para o exercício das Aulas de Métodos #JavaMethods

Proposta: Calcule o valor final de um empréstimo a partir do valor solicitado, as taxas e parcelas influenciam.
          Defina arbitrariamente as faixas que influenciam nos valores.

Obs.:
     1.O método principal do empréstimo é o que calcula o valor final, será preciso um valor de entrada e uma quantidade de parcelas.
     2.A finalidade do exercício é mostrar que podemos chamar um método dentro do outro para trabalharem em conjunto.
     3.Como os demais, o uso dos métodos estão sendo feitos na class main.java (principal)

*/

public class Emprestimo {
    public static int getDuasParcelas() {
        return 2;
    }
    public static int getTresParcelas() {
        return 3;
    }
    public static double getTaxaDuasParcelas() {
        return 0.3;
    }
    public static double getTaxaTresParcelas() {
        return 0.45;
    }
    public static void calcular(double valor, int parcelas) { //método principal (valor entrada/ Qutd. parcelas)

        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas()); //Taxa de 30%
            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas()); //Taxa 45%
            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }

}