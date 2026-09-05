package exercicio_03;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Alberto", 1000.00);
        ContaBancaria contaBancaria2 = new ContaBancaria("Elisa", -299);
        ContaBancaria contaBancaria3 = new ContaBancaria("Henrique", 20040.00);

        System.out.println("\n=============== BANCO MASTER =============== ");
        System.out.printf("%44s", "[By: Daniel Vorcaro]\n");
        System.out.println("");
        System.out.printf("%36s", "----- Contas Bancárias -----\n");

        contaBancaria1.infoConta();
        contaBancaria2.infoConta();
        contaBancaria3.infoConta();

        System.out.println("------------------------------------------");
        System.out.println("Testes:");

        contaBancaria1.sacar(2000.00);
        contaBancaria1.infoConta();

        contaBancaria2.depositar(2000);
        contaBancaria2.infoConta();
        contaBancaria3.sacar(30000.00);
        contaBancaria3.infoConta();
    }
}
