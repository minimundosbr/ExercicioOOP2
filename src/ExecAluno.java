public class ExecAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Josefino");
        aluno.insereNotas(10);
        aluno.insereNotas(9);
        aluno.insereNotas(3);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Somatória de notas do aluno: " + aluno.getNota());

        aluno.calculaMedia();

    }
}
