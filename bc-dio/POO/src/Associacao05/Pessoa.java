package Associacao05;

/**
   A ideia é que uma pessoa tem um enderçeo específico que pertence a essa pessoa. Se essa Pessoa deixa de existir conse-
   quentemente esse Endereço também deixa de existir. Temos no exemplo, uma classe Pessoa e um dos seus atributos é do
   tipo Endereco que é outra classe.
   Conceitualmente isso é uma Associação do tipo composição, pois, essa Pessoa é composta de um Endereco. E esse endereco
   só pertence a essa Pessoa.
   A criação feita no código da Agregação é idêntica à Associação, a questão é só o comportamento. Se o comportamento foi
   de forma agregada ou composta. Tem a ver com o negócio que está almejando resolver.
 */

class Pessoa {
    Endereco endereco;
}