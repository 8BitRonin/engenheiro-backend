package exercicio_04;

public class Funcionario {
    private String nomeFuncionario = "Desconhecido";
    private String cargoFuncionario = "Desconhecido";
    private double salarioFuncionario = 0.0;

    public Funcionario(String nomeFuncionario, String cargoFuncionario, double salarioFuncionario) {
        setNomeFuncionario(nomeFuncionario);
        setCargoFuncionario(cargoFuncionario);
        setSalarioFuncionario(salarioFuncionario);
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        if(nomeFuncionario != null && !nomeFuncionario.trim().isEmpty()) {
            this.nomeFuncionario = nomeFuncionario;
            return;
        }else {
            System.out.println("Erro: Nome do funcionário não pode ser vazio.");
        }
    }
    public void setCargoFuncionario(String cargoFuncionario) {
        if(cargoFuncionario != null && !cargoFuncionario.trim().isEmpty() ) {
            this.cargoFuncionario = cargoFuncionario;
            return;
        }else {
            System.out.println("Erro: Cargo do funcionário nãõ pode ser vazio.");
        }
    }
    public void setSalarioFuncionario(double salarioFuncionario) {
        if(salarioFuncionario > 0) {
            this.salarioFuncionario = salarioFuncionario;
            return;
        } else {
            System.out.println("Erro: Salário do funcionário não pode estar zerado ou negativado.");
        }
    }
    public String getNomeFuncionario() {
        return this.nomeFuncionario;
    }
    public String getCargoFuncionario() {
        return this.cargoFuncionario;
    }
    public double getSalarioFuncionario() {
        return this.salarioFuncionario;
    }
    public double bonusSalario(double porcentagem) {
        if(porcentagem > 0) {
            return this.salarioFuncionario * (1 + (porcentagem / 100.0));
        } else {
            return 0;
        }
    }
    public void funcionarioInfo() {
        System.out.println(("\nFuncionário: %s | Cargo: %s | Salário: R$ %.2f " +
                "| Salário com Bônus: %.2f ").formatted(getNomeFuncionario(),
                getCargoFuncionario(), getSalarioFuncionario(), bonusSalario(15)));
    }

}
