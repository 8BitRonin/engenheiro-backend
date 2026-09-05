package fundamentos.metodos;

public class FolhaDePagamento {
    public static void exibirValor(int a) {
        System.out.println("O valor do inteiro é %d%n".formatted(a));
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Arnaldo", 5000.00);
        System.out.println(funcionario.obterInfo());
        funcionario.aumentarSalario(3000.00);
        System.out.print(funcionario.obterInfo());

        funcionario.alterarQualquerSalario(funcionario, 9000.00);
        System.out.print(funcionario.obterInfo());

        exibirValor(10);

    }
}
