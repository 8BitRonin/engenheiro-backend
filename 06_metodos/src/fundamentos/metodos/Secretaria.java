package fundamentos.metodos;

public class Secretaria {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNomeAluno("Maria");

        System.out.println("\nAluno: %s".formatted(aluno.getNomeAluno()));
    }
}
