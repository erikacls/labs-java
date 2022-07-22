package PolSob04;

class ClasseFilha2  extends ClasseMae {

    /**
     A ClasseFilha2 faz um @override, sobrescreve.
     O método 1 e 2 fará o que foi passado em System.out.println()
     */
    @Override
    void metodo1() {
        System.out.println("Método 1 da Classe Filha 2");
    }
    @Override
    void metodo2() {
        System.out.println("Método 2 da Classe Filha 2");
    }

}