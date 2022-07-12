
/*

 Classe de exemplo para o exercício da Aula 2 de Operadores lógicos e relacionais, Controle de fluxo e Blocos.

*/

public class Main {

    public static void main(String[] args) {

        //variáveis booleanas
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        //Operações Lógicas

        //op. log. conjunção (and/e/&&) ambos V -> V
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        //op log. disjunção (or/ou/||) ambos F -> F
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        //op. log. disjunção exclusiva (xor/^) VV -> F, FF -> F, VF -> V, FV -> V
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        //op. log. negação (inversão/!) V -> F, F -> V
        System.out.println(!b1);
        System.out.println(!b2);

        //Nem sempre um resultado booleano é obtido apenas a partir de operandos booleanos e operações lógicas

        //Neste trecho teremos operadores aritméticos, relacionais e lógicos (cria-se expressões) com resultados booleanos
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        //Execução dos parênteses mais internos e depois as mais externas
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        //Boas Práticas - Criação de variáveis intermediárias para facilitar o entendimento e o reuso dos resultados

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)); //simplificada por recebeAuxilio

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        //usado sempre que desejar saber se a pessoa tem o direito de receber o auxílio
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);

    }
}