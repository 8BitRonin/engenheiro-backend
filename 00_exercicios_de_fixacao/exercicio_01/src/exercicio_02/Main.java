package exercicio_02;

public class Main {
    public static void main(String[] args) {
        Temperatura temperatura1 = new Temperatura(25.0);
        Temperatura temperatura2 = new Temperatura(-300);
        Temperatura temperatura3 = new Temperatura(-273.15);

        System.out.println("\n=============== CONVERSOR DE TEMPERATURA ===============");

        System.out.println("===== Teste 1: Temperatura válida =====");
        temperatura1.infoTemperatura();

        System.out.println("===== Teste 2: Temperatura inválida =====");
        temperatura2.infoTemperatura();

        System.out.println("===== Teste 3: Zero absoluto =====");
        temperatura3.infoTemperatura();

    }
}
