
/**
 Classe de exemplos para o exercício das Aulas de Herança do paradigma de Orientação a Objetos.
 Análise do comportamento de Polimorfismo e Sobrescrita
 */

package PolSob04;

/**Classe criada para execução*/
class exApp {

    public static void main(String[] args) {

        /**
           Foi criado um vetor [] do tipo ClasseMae chamado de classes contendo três (3) objetos dentro dele: o primeiro
           objeto do tipo ClasseFilha1(), o segundo do tipo ClasseFilha2() e um terceiro do próprio tipo ClasseMae().
         */
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        /**
           - Feito um ForEach ( : ){} para percorrer os três objetos e chamar o método 1 de cada um deles. O que aconteceu
           no primeiro for? O método 1 está presente na ClasseMae e foi sobrescrito na ClasseFilha1 e na ClasseFilha2. E
           quando ele passou em new ClasseFilha1() fez o polimorfismo, porque o objeto em questão era ClasseFilha1(), mas
           o tipo que esse for está iterando é do tipo ClasseMae, ou seja, inferiu em tempo de execução dizendo que apesar
           do tipo ser ClasseMae no momento em que executa será ClasseFilha1, então chama o método1(), mas não de ClasseMae
           e sim de ClassFilha1, por isso ocorreu um comportamento polimórfico (polimorfismo). O método1() se comportou
           de acordo com o tipo de dado, a instância corrente (no momento de execução) do tipo ClasseFilha1.
           - Em new ClasseFilha2() ocorre outro comportamento polimórfico.
           - Para a ClasseMae não acontece o comportamento polimórfico porque o tipo é igual ao objeto e new ClasseMae(). Ele
             simplesmente chamou o metodo1 da ClasseMae.
           - Polimorfismo ocorre quando se tem os objetos diferentes. É sempre trabalhado com o tipo de dados da  ClasseMae
             mas com instancias da ClasseFilha.
         */

        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        /**
           O metodo2 está na ClasseMae, na ClasseFilha1 não tem metodo2. Enquanto, na ClasseFilha2 possui. O que vai
           acontecer? No primeiro caso, em new ClasseFilha1 não terá comportamento polimórfico, porque apesar de ter o
           tipo de dado, o metodo2 não é o da ClasseMae. E new ClasseFIlha2 vai ter polimorfismo, porque foi sobrescrito
           provendo esse comportamento polimórfico através dessa sobrescrita. E em new ClasseMae() não tem porque é a
           própria classe.
         */

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        /**
           Aqui não ouve polimorfismo, mas sim uma sobrescrita pura. Porque está sendo trabalhado diretamente com a
           ClasseFilha2. Está sendo instanciado o objeto dela, new ClasseFilha2 e chamando o metodo2 que é quem foi
           sobrescrito. Foi chamado o metodo2 que foi sobrescrito, mudando a implementação dele da ClasseMae e usando
           o da ClasseFilha2.
           Se for trabalhado diretamente com tipo como no exemplo, não vai ter polimorfismo e sim exatamente uma sobrescrita.
           Foi sobrescrito o metodo2 na ClasseFilha2 e usado. O que estava na ClasseMae não foi usado.
         */

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }

}