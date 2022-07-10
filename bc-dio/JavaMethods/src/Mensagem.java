
/*
 Classe de exemplo para o exercício das Aulas de Métodos #JavaMethods

 Proposta: A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.

 Obs.: A execução dos métodos criados recebem chamadas da class principal main.java

 */

public class Mensagem {
    public static void obterMensagem(int hora) { //métodos recebem os parâmetros que forem necessários ou nem recebê-los se for o caso.

        //Foi criado vários métodos e chamados um dentro do outro para trabalharem em conjunto e atingir um objetivo final, como exibir uma mensagem de saudação baseada na hora do dia
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora Inválida.");
                break;
        }
    }

    //Segue a seguir os três métodos criados para exibição das mensagens
    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }
    public static void mensagemBoaTarde() {
        System.out.println("Bom tarde!");
    }
    public static void mensagemBoaNoite() {
        System.out.println("Bom noite!");
    }
}