package fundamentos_de_poo;

public class Funcionario {

    String nomeFuncionario;
    String cargoFuncionario;
    int idadeFuncionario;

    /*Construtor*/
    Funcionario(String nomeFuncionarioInit, String cargoFuncionarioInit, int idadeFuncionarioInit) {

        nomeFuncionario = nomeFuncionarioInit;
        cargoFuncionario = cargoFuncionarioInit;
        idadeFuncionario = idadeFuncionarioInit;
    }
    /*Construtor Default*/
    Funcionario() {
    }

    /*Sobrecarga de construtores*/
    Funcionario(String nomeFuncionarioInit) {
        nomeFuncionario = nomeFuncionarioInit;
    }
}
