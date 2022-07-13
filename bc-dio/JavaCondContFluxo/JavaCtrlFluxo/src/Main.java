
/*
  Classe de exemplo para o exercício da Aula 3 de Operadores lógicos e relacionais, Controle de fluxo e Blocos.

  Proposta 1: Criar u simples projeto no IntelliJ e criar variáveis e expressões para usar nas estruturas if e switch
  Com if, exiba o nome do mês do ano de acordo com seu número(um para jan, dois para fev etc.). Evite o efeito "flecha”.
  Faça também outro if que verifique se o mês é julho, dezembro ou janeiro, para assim exibir o texto “Férias”.

  Proposta 2: Com switch use String para a partir do dia da semana, exibir seu número (um domingo, dois segunda etc.).
  Ainda no switch, faça outro exemplo onde, se uma variável inteira for entre 1 e 3 exibir o texto “Certo”.
  Se for 4 exibir “Errado”, se for 5 “Talvez”. Pra demais valores exibir “Valor indefinido”.

  Obs.: Usar o último else de um if para comportamento padrão é errado, deve ser excepcional para dizer que algo deu errado.

*/

public class Main {

    public static void main(String[] args) {

        //Métodos

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor(); //criar variáveis intermediárias para melhorar a legibilidade do if

        switchSemana();
        switchNumero();
        switchFerias();
    }

    //ifFlecha() - Efeito flecha - identação para a direita consumindo espaço na tela
    // Código mal projetado, esse efeito deve ser evitado - resolver com POO e padrões de projetos
    //não se deve usar comportamentos padrão/default de ifs e switchs para que ele assuma um comportamento de negócio esperado
    // e sim ser uma exceção dizendo que algo deu errado para que não seja assumido um valor, embora inválido.
    //Foi retirado o else (do mês 12) como padrão e o if testará até o mês 12. Se for será impresso na tela dezembro senão
    //será dado o comportamento inesperado "Mês indefinido".
    private static void ifFlecha() {

        int mes = 20; //valor não previsto
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    //ifSemFlecha() - if else alinha todos a esquerda
    private static void ifSemFlecha() {

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else {
            System.out.println("Dezembro");
        }
//      } else if (mes == 12) {
//            System.out.println("Dezembro");
//      } else {
//            System.out.println("Mês indefinido");
//      }
    }

    //ifFerias() - envolve apenas a variável mes, logo, o uso do switch seria mais adequado
    //os valores possíveis que essa variavel pode ter podem ser muitos, portanto, usar o switch nestas condições é mais apropriado
    private static void ifFerias() {

        String mes = "julho"; //variável mes
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Férias");
        }
    }

    //ifMenor() - finalidade de melhorar os ifs usando variáves intermediárias em vez de expressões muito extensas
    private static void ifMenor() {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        //expressão muito extensa deve ser evitado
        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        //criação de duas variáveis intermediárias - salarioBaixo e muitosDependentes
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        //opção se tiver mais de duas variáveis para testar e guardar mais valores
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Funcionário deve receber auxílio.");
        } else {
            System.out.println("Funcionário não deve receber auxílio.");
        }
    }

    //switchSemana - usando uma variável dia, ou seja, um valor exato e visa saber quais valores essa variável pode assumir
    //Segue todos os testes realizados usando o switch, mais apropriado em vez do if.
    //break interrompe a execução
    //Nunca usar o default de um switch para ter um comportamento padrão, e sim usado para dizer que algo está errado com o valor que deseja testar
    private static void switchSemana() {

        String dia = "mgmgjmg";
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                //System.out.println(1);
                System.out.println("Dia inválido"); //não existe o dia definido
                break;
        }
    }

    //switchNumero() - um valor exato 4
    //finalidade de englobar no teste mais de um valor para dar uma resposta sem interromper a cada case a execução com break
    //o intuito no exemplo é interromper quando for um dos 3 casos (1,2 e 3) e não um de cada vez
    //para utilizar isso no if deveria ser criado agrupamentos - não é recomendado
    private static void switchNumero() {

        int numero = 4;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }

    //switchFerias() - similar ao número, as ao invés de inteiro é String seguindo a mesma ideia
    //se for dezembro, julho ou janeiro estamos de férias, caso contrário não estaremos.
    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês Indefinido");
                break;
        }
    }
}