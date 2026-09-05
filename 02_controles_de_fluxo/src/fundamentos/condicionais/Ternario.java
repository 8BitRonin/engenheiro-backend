package fundamentos.condicionais;

public class Ternario {
    public static void main(String[] args) {

        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.printf("\n%d é %s", numero, resultado);
    }
}
