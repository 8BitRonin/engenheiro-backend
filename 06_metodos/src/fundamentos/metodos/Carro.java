package fundamentos.metodos;

public class Carro {
    public String marcaDoCarro;
    public String modeloDoCarro;
    public int anoDoCarro;

    public Carro() {
    }
    public Carro(String marcaDoCarro, String modeloDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
    }
    public Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;
    }
    public void exibirDetalhes() {
        System.out.println("Marca: %s%nModelo: %s%nAno: %d%n".formatted(this.marcaDoCarro,
                this.modeloDoCarro, this.anoDoCarro));
    }
}
