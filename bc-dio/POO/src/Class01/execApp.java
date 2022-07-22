package Class01;

/**
 * Classe de exemplo para os exercícios 1 – 4 de Orientação a Objetos.
 */
class execApp {

    /**método - ponto de entrada para a app iniciar*/
    public static void main(String[] args) {

        /**
         Exemplo 1
         criação do objeto carro1 do tipo Class.Carro (classe)
           chama um construtor simples (default/padrão) sem parâmetros, ele vai criar/instanciar/armazenar/vincular o
           objeto a variavel carro1.
           Foi criado o objeto vazio para depois ir colocando os valores nele
         */

        //construtor default/padrão
        Carro carro1 = new Carro();

        //chama os métodos
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        //exibe os valores citados usando o get e chama o método totalValorTanque
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39)); //6.39*59=?

        /**
           Exemplo 2
           Criado um objeto passando valores como parâmetro para ele no seu construtor, utilizando a sobrecarga.
           A sobrecarga não é só de construtor, mas também em métodos que não sejam construtores.
           Há somente um método simples com uma lógica de negócio, devido a isso foi explorado a sobrecarga no construtor.
         */

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}