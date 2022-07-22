package Visib08.Pack02.Pack03.Pack04;

/**
 * Class03 não herda de Class01, para ter acesso a ela deve ter uma associação para obter visibilidade a algumas das coisas
 * de lá.
 * Terá acesso aos atributos/métodos 2 e 3, apesar de Class03 não ser uma subclasse está no mesmo pacote, portanto, terá acesso
 * quando protegido em Class01.
 */

class Class03 {

    Class01 class01;

    void metodo() {

        //atributo2 e 3

        //metodo2 e 3
    }
}