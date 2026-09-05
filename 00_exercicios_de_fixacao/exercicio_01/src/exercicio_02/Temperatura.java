package exercicio_02;

public class Temperatura {
    private static final double ZERO_ABSOLUTO = -273.15;
    private double celsius = 0.0;

    public Temperatura(double celsius) {
        setCelsius(celsius);
    }
    public void setCelsius(double celsius) {
        if(celsius < ZERO_ABSOLUTO) {
            System.out.println("\nErro: Temperatura não pode ser menor que %.2f".formatted(ZERO_ABSOLUTO));
            return;
        }else {
            this.celsius = celsius;
        }
    }
    public double getCelsius() {
        return this.celsius;
    }
    public double getFahrenheit() {
        return getCelsius() * 9/5 + 32;
    }
    public void infoTemperatura() {
        System.out.println("%.2f°C | %.2f°F".formatted(getCelsius(), getFahrenheit()));
    }
}
