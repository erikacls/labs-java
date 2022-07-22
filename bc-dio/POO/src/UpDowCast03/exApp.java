/**
   Classe de exemplos para o exercício das Aulas de Herança do paradigma de Orientação a Objetos.

   Parte 1: crie as classes "Funcionario", "Gerente", "Vendedor" e "Faxineiro". Realize upcasts e downcasts.
            Análise do comportamento de Polimorfismo e Sobrescrita
 */

package UpDowCast03;

class exApp {

    public static void main(String[] args) {

        /**
           Foi pego a classe Funcionario e criado a variável funcionario dentro desse método do tipo Funcionario. Criei
           um objeto Funcionario() (com new) e guardei na variável Funcionario... Foi pego a classe Funcionário e instanciado
           o objeto dela Funcionario(), não teve upcast nem downcast.
         */
        Funcionario funcionario = new Funcionario();

        /**
           - Neste caso ocorreram upcasts: Gerente(), Vendedor() e Faxineiro() são subtipos de Funcionario. Foi definido
             três variáveis diferentes, como gerente, vendedor e faxineiro e todas do mesmo tipo - classe Funcionario, a
             classe mãe, ou seja, o supertipo das classes Gerente(), Vendedor() e Faxineiro().

           - O upcast é sempre implícito, não é necessário de forma explícita dizer para quem estou querendo fazer esse
             upcast. Entre os operadores de atribuição e new não precisou dizer quem era o meu tipo de dado alvo. Por exemplo,
             se a classe Gerente() é filha de Funcionario querendo transformar Gerente() -> Funcionario não tem problemas.

           - Funcionario é a superclasse e Gerente() subtipo dela, por exemplo. Estou subindo quando faço o upcast de
             Gerente() para Funcionario. Existem coisas em Gerente() que também tem em Funcionario. Então, o que tiver Gerente()
             vai conseguir copiar. O que não tiver ficará presente apenas no objeto Gerente, não haverá perda de dados.

           - Upcast facilita na aplicação do polimorfismo
         */
        Funcionario gerente = new Gerente(); //upcast 1
        Funcionario vendedor = new Vendedor(); //upcast 2
        Funcionario faxineiro = new Faxineiro(); //upcast 3

        /** Downcast - no caso existe uma classe Funcionario()[mãe] e estou tentando transformá-la em classe filha, ou seja,
            Vendedor, neste caso será explícito. Tem que colocar para quem eu quero fazer o downcast entre operadores de
            atribuição e new.
            Há dados em Funcionario() e em Vendedor que não necessariamente tem em Funcionario(), porque é uma subclasse.
            O que está em ambas daria certo, mas o que fazer com o que só existe de informações em Vendedor? Não há como
            saber e por isso gera erro no downcast. Vendedor não é um objeto, mas uma classe, um tipo de dado. Por isso,
            o downcast deve ser evitado em POO, apesar do conceito válido.
         */
        //Gerente gerente_ = new Funcionario(); //Forma incorreta downcast, não está explícito
        //Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}