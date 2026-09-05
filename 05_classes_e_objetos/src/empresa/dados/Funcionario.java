package empresa.dados;

public class Funcionario {

    String nomeFuncionario;
    double salarioFuncionario;

    public Funcionario(String nomeFuncionarioInit, double salarioFuncionarioInit){

        nomeFuncionario = nomeFuncionarioInit;
        salarioFuncionario = salarioFuncionarioInit;
        System.out.printf("\nFuncionário: %s%n", nomeFuncionario);
        System.out.printf("Salário: %.2f%n", salarioFuncionario);
    }
}
