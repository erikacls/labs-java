package Visib08.Pack02.Pack03.Pack04;

/**
 * Class02 é uma subclasse/subtipo e tem acesso a algumas coisas que estão em Class01, como o atributo 2 e 3.
 * Não tem acesso ao atributo 1 da Class01 porque ele é privado, pertencente somente a ela.
 * Segue a mesma lógica de acesso quanto aos métodos 2 e 3 da Class01, possui acesso por ser protegido e público
 * A Class02 é uma versão mais específica, tem acesso direto a Class01
 */

class Class02 extends Class01 {

    //atributos próprios

    void metodo() {

        //atributo2 e 3
    }

        //metodo2 e 3
}