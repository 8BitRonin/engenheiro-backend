package big.decimal.sintaxe;

import java.math.BigDecimal;

public class DeclaracaoExemplo {
    public static void main(String[] args) {
        // Forma correta: Passando como String no construtor:
        BigDecimal saldo1 = new BigDecimal("1000.50");

        // Forma correta: Usando BigDecimal.valueOf():
        BigDecimal saldo2 = BigDecimal.valueOf(1000.50);

        // Constantes úteis:
        BigDecimal zero = BigDecimal.ZERO; // 0
        BigDecimal um = BigDecimal.ONE; // 1
        BigDecimal dez = BigDecimal.TEN; // 10

    }
}
