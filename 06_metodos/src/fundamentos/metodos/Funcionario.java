package fundamentos.metodos;

public class Funcionario {
    private String nomeFuncionario;
    private double salarioFuncionario;

    public Funcionario(String nomeFuncionarioInt, double salarioFuncionarioInt) {
        nomeFuncionario = nomeFuncionarioInt;
        salarioFuncionario = salarioFuncionarioInt;
    }
    public  String obterInfo() {
        return "\nFuncionário: %s%nSalário: %.2f%n".formatted(nomeFuncionario, salarioFuncionario);
    }
    public void aumentarSalario(double aumento) {
        salarioFuncionario += aumento;
    }
    public void alterarQualquerSalario(Funcionario func, double salarioNovo) {
        func.salarioFuncionario = salarioNovo;
    }
}
