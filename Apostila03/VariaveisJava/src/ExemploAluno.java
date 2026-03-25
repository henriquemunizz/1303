public class ExemploAluno {

    //método main (enter)
    public static void main(String[] args) {

        //Criar um objeto do tipo estudante
        Aluno estudante = new Aluno();

        //Atribuir valores para os atributos
        estudante.id = 123;
        estudante.matriculado = true;
        estudante.nome = "Henrique";
        estudante.idade = 19;
        estudante.nomeCurso = "TDSP";
        estudante.valorMensalidade = 0;
        estudante.turma = 'V';

        //Exibir os valores dos atributos do objeto aluno
        System.out.println("Id: " + estudante.id);
        System.out.println("Matriculado: " + estudante.matriculado);
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Curso: " + estudante.nomeCurso);
        System.out.println("Mensalidade: " + estudante.valorMensalidade);
        System.out.println("Turma: " + estudante.turma);

        //Criar um outro aluno, atribuir valores para 2 propriedades

        Aluno estudanteDois = new Aluno();
        estudanteDois.nome = "Rafael";
        estudanteDois.idade = 18;

        System.out.println("Nome: " + estudanteDois.nome);
        System.out.println("Idade: " + estudanteDois.idade);
    }
}
