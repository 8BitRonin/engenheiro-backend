package fundamentos.variaveis;

public class Var {
    public static void main(String[] args) {

        var numero = 10; // Inferência (dedução) de tipo
        // var usuario = new Usuario(); Inferência di tipo Usuario
        int numero2 = numero;

        System.out.println("\nValor de número: " + numero);
    }
}
