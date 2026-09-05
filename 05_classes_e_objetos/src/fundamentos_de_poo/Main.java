package fundamentos_de_poo;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Henrique",
                "Analista de Sistemas", 30);

        Funcionario funcionario2 = new Funcionario("Jamila",
                "Veterinária", 24);

        Funcionario funcionario3 = new Funcionario();

        funcionario3.nomeFuncionario = "Let";
        funcionario3.cargoFuncionario = "Marketing";
        funcionario3.idadeFuncionario = 20;

        Funcionario funcionario4 = new Funcionario("Maria");

        System.out.printf("\nFuncionário: %s%n", funcionario1.nomeFuncionario);
        System.out.printf("Cargo: %s%n", funcionario1.cargoFuncionario);
        System.out.printf("Idade: %d%n", funcionario1.idadeFuncionario);

        System.out.printf("\nFuncionária: %s%n", funcionario2.nomeFuncionario);
        System.out.printf("Cargo: %s%n", funcionario2.cargoFuncionario);
        System.out.printf("Idade: %d%n", funcionario2.idadeFuncionario);

        System.out.printf("\nFuncionária: %s%n", funcionario3.nomeFuncionario);
        System.out.printf("Cargo: %s%n", funcionario3.cargoFuncionario);
        System.out.printf("Idade: %d%n", funcionario3.idadeFuncionario);

    }
}
