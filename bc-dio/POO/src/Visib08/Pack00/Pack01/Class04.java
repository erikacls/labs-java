package Visib08.Pack00.Pack01;

import Visib08.Pack02.Pack03.Pack04.Class01;

/**
 * A Class04 não herda da Class01 e nem encontra-se no mesmo pacote. Portanto, se faz necessário alguma associação para
 * ter acesso a algumas coisas que estão definidas na Class01.
 * Terá acesso somente ao atributo3 e metodo3, ambos públicos.
 */

class Class04 {

    Class01 class01;

    void metodo() {

        //atributo3

        //metodo3
    }
}