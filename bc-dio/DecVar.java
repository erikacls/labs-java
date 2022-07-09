class DecVar {

    public static void main(String[] args) {

    int i;
    //int i; //repetida
    int I;
    //int 1a; não pode começar com números
    int _1a; //não é boa prática
    int $aq; //não é boa prática

    //variáveis dentro de métodos devem ser iniializadas, ou seja, provido seu valor inicial
    i = 5;
    I = 10;
    _1a = 20;
    $aq = 7;

    final int j = 10; //constante
    //j = 15; erro porque não é possível mudar j
    int asrn24678md;
    int asrn2$4678_md = 10; //$ e _ não são boas práticas
    //int asrn2$46%78_md = 10 erro caracteres especiais

     asrn24678md = 100;
     asrn2$4678_md = 10;

     int quantidadeProduto = 50; //notação camelo ok
     int QuantidadeProduto; //notação indevida
     final int NUMERO_TENTATIVAS = 5; //notação camelo não existe para final
     final int numeroTentativas = 5; //notação indevida
     int QUANTIDADE_OPCOES = 25; //notação indevida
     //int qtdProd; notação camelo ok mas sem expressividade

      //exibição das variáveis
      System.out.println(i);
      System.out.println(I);
      System.out.println(_1a);
      System.out.println($aq);

      System.out.println(j);
      System.out.println(asrn24678md);
      System.out.println(asrn2$4678_md);

      System.out.println(quantidadeProduto);
      System.out.println(NUMERO_TENTATIVAS);
      System.out.println(QUANTIDADE_OPCOES);


    }
}
