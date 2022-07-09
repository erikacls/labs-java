class Argumentos2 {

    public static void main (String[] args){

        System.out.println("Olá Mundo " + args[0]);
    }
}

/*
- Java é compilada/interpretada
- Todo programa Java executado pela linha de comando recebe parâmetros/argumentos - args
- args é um array/coleção de String[] podemos acessar qualquer posição dessa string
- acessar index 0
- compilação: javac Argumentos2.java | cria Argumentos.class
- execução: java Argumentos2 ComoVaiVocê ou "Como vocês estão?"
*/