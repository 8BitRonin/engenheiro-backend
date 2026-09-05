package big.decimal.operacoes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperacoesExemplo {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("100.0");
        BigDecimal b = new BigDecimal("30.0");

        // Soma:
        BigDecimal soma = a.add(b);

        // Subtração:
        BigDecimal sub = a.subtract(b);

        // Multiplicação:
        BigDecimal multi = a.multiply(new BigDecimal("2"));

        // Divisão (Sempre especificar as casas e o modo de arredondamento):
        BigDecimal div = a.divide(b, 2, RoundingMode.HALF_UP); // 3.33

        // Comparação com compareTo():
        // Retorna: 1 (maior), 0 (igual), -1 (menor)
        if(a.compareTo(b) > 0) {
            System.out.println("A é maior que B.");
        }
    }
}
