package exercicio_03;

public class ContaBancaria {
    private String titular = "Desconhecido";
    private double saldo = 0.0;

    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }
    public void setTitular(String titular) {
        if(titular == null || titular.trim().isEmpty()){
            System.out.println("\nErro: Titular não pode ser vazio");
            return;
        }else {
            this.titular = titular.trim();
        }
    }
    public void setSaldo(double saldo) {
        if(saldo < 0) {
            System.out.println("\nErro: Saldo não pode estar negativado");
            return;
        }else {
            this.saldo = saldo;
        }
    }
    public String getTitular() {
        return this.titular;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void depositar(double valor) {
        if(valor <= 0) {
            System.out.println("Erro: Deposite um valor acima de zero.");
            return;
        } else {
            this.saldo += valor;
        }
    }
    public void sacar(double valor) {
        if(valor > this.saldo || valor <= 0) {
            System.out.println("\nErro: Seu saldo é insuficiente para essa operação ou você colocou um valor zero" +
                    " ou abaixo de zero.");
            return;
        }else {
            this.saldo -= valor;
        }
    }
    public void infoConta() {
        System.out.println("Titular: %-10s | Saldo: R$ %.2f".formatted(getTitular(), getSaldo()));
    }
}
