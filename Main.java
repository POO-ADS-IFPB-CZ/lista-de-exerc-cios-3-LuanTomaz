public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "001");
        aluno1.cadastrarNota(8.0);
        aluno1.cadastrarNota(7.5);
        aluno1.cadastrarNota(6.0);
        aluno1.cadastrarNota(9.0);

        Aluno aluno2 = new Aluno("Maria", "002");
        aluno2.cadastrarNota(5.0);
        aluno2.cadastrarNota(6.0);
        aluno2.cadastrarNota(7.0);
        aluno2.cadastrarNota(6.5);

        Turma turma = new Turma();
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        System.out.println("Aprovados:");
        for (Aluno aluno : turma.listarAprovados()) {
            System.out.println(aluno.getNome());
        }

        System.out.println("Reprovados:");
        for (Aluno aluno : turma.listarReprovados()) {
            System.out.println(aluno.getNome());
        }
    }
}
