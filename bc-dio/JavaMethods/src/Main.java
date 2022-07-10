
/*
 Classe principal dos exercícios das Aulas de Métodos #JavaMethods

 Proposta: Crie uma aplicação que resolva as seguintes situações:

 1.Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
 2.A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
 3.Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. Defina arbitrariamente as faixas que influenciam nos valores.

 O que possibilita chamar um método diretamente da classe? a palavra static neste caso.

*/

public class Main {

    public static void main(String[] args) {

        // Calculadora para executar as 4 operações
        System.out.println("Exercício calculadora");
        //chamadas ou passar mensagens aos métodos
        Calculadora.soma(3, 6); //chamada de um método diretamente a partir da class Calculadora inserindo o nome do métodos e passamos os parâmetros.
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        //passagem do valor inicial e na chamada de um método também é comum chamar outro método com parâmetro
        System.out.println("Exercício emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas()); //o retorno do método das parcelas (return 2) será passado para o método Emprestimo.calcular
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}