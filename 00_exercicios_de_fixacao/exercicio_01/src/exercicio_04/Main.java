package exercicio_04;

public class Main {
    public static void main(String[] args) {

        /*EXERCÍCIO 8: Funcionario
        Crie uma classe que represente um funcionário com informações de nome, cargo e salário.
        A classe deve possuir um método que calcule o salário com um bônus de 15%. Implemente validações
        apropriadas para todos os atributos, getters e setters, e um método que exiba as informações do
        funcionário incluindo o salário com bônus.
        Teste com pelo menos 3 cenários diferentes.*/

        Funcionario funcionario = new Funcionario("Henrique", "Analista de Sistemas",
                5500.00);
        Funcionario funcionario1 = new Funcionario("Érika", "Diretora geral",
                40000.00);
        Funcionario funcionario2 = new Funcionario("Prado", "Vice-presidente",
                50000.00);

        funcionario.funcionarioInfo();
        double salarioComBonus = funcionario.bonusSalario(15);
        System.out.println("Salário de %s com bonus: R$ %.2f".formatted(funcionario.getNomeFuncionario(),
                salarioComBonus));

        funcionario1.funcionarioInfo();
        double salarioComBonus1 = funcionario1.bonusSalario(20);
        System.out.println("Salário de %s com bonus: R$ %.2f".formatted(funcionario1.getNomeFuncionario(),
                salarioComBonus1));

        funcionario2.funcionarioInfo();
        double salarioComBonus2 = funcionario2.bonusSalario(30);
        System.out.println("Salário de %s com bonus: R$ %.2f".formatted(funcionario2.getNomeFuncionario(),
                salarioComBonus2));
    }
}
