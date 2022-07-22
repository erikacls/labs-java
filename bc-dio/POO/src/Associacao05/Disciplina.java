package Associacao05;

/**
   Agregação
   A Disciplina tem um dos seus atributos com a classe Aluno. Se a Disciplina deixar de existir, não necessariamente a
   classe Aluno deixa de existir. Ele pode existir não necessariamente dentro dessa Disciplina.
   A criação feita no código da Agregação é idêntica à Associação, a questão é só o comportamento.
 */

class Disciplina {
    Aluno aluno;
}
