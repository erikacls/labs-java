package Class01;

/**
   Classe de exemplo para os exercícios 1 – 4 de Orientação a Objetos.

   Parte 1: Crie a classe "Class.Carro";

   Parte 2: evolua o exercicio 1 e defina 3 atributos para sua classe "Class.Carro": cor, modelo e capacidade do tanque;

   Parte 3: evolua o conceito do exercício 2 e defina 1 método para calcular o valor total para encher o tanque.
            Este deve receber como parâmetro o valor da gasolina. Faça também duas sobrecargas do construtor;

   Parte 4: evolua o conceito do exercício 3 criando objetos da classe "Class.Carro". Use os métodos set/get, quando
            aplicáveis, para definir os valores dos atributos e exibir estes valores "get". Passe também uma
            mensagem para o cálculo do total pra encher o tanque.
 */

class Carro {

    ///atributos (tipos de dados)
    String cor;
    String modelo;
    int capacidadeTanque;

    //métodos

    /**
     construtor - deve estar sempre abixo dos atributos seguidos dos get/set e por fim a lógica de negócio
     sobrecarga - é ter o mesmo método com assinaturas (nome + parâmetros) diferentes.

     Sobrecarga 1: 1ª forma de criar objetos - o construtor mais simples possui apenas o nome da classe (ambos devem
     ter o mesmo nome) e sem parâmetros
     */

    Carro() {

    }

    /**
     Sobrecarga 2: 2ª forma de criar objetos
     construtor que solicite um estado inicial para esse Class.Carro inserindo parâmetros que serão os atributos da classe
     o this tem a ver com o objeto, e é uma forma de diferenciar o que pertence ou não ao objeto. Por exemplo, o this
     tira uma ambiguidade. No caso a seguir, seta um atributo que está em uma classe e vai pertencer a um objeto. E neste
     atributo capacidadeTanque estou colocando o parâmetro capacidadeTanque.
     O atributo do objeto a ser trabalhado difere do parâmetro que está sendo utilizado para colocar dentro do atributo.
     */

    Carro(String cor, String modelo, int capacidadeTanque) { //3 parâmetros acrescentados
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    /**
      set/get - colocando e pegando valores de todos os atributos
      set - usado para setar/colocar um valor num atributo
      get - pegar/retornar/devolver algo
      Obs.: ambos podem ferir a questão do encapsulamento (proteção dos dados)
    */

    void setCor(String cor) { //passa () um valor para o método setCor/a ideia é guardar um valor, por isso void
        this.cor = cor; //com esta linha coloca o valor no atributo
    }

    String getCor() { //retornar a cor do carro
        return cor; //se o atributo cor é string, o método também deve ser compatível
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    //set do Tanque
    void setCapacidadeTanque(int capacidadeTanque) { //set - passa o valor com tipo int compatível com o atributo
        this.capacidadeTanque = capacidadeTanque;
    }

    //get do Tanque
    int getCapacidadeTanque() { //retornará um int e não precisa de parâmetros
        return capacidadeTanque;
    }

    /**
      lógica de negócio implementada - método que calcula o total do Tanque
      Na classe Class.Carro temos a capacidadeTanque e o valorCombustivel pode mudar.
    */
    double totalValorTanque(double valorCombustivel) { //valor monetário usar Double
        return capacidadeTanque * valorCombustivel; //ex. 10*2= R$ 20,00 para encher o tanque
    }
}

