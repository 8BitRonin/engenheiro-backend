package fundamentos.metodos;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeEmEstoque;

    public Produto(String nomeProduto, double precoProduto, int quantidadeEmEstoque) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public void exibirIfoProduto() {
        System.out.println("\nProduto: %s%nPreço: R$ %.2f%nUnidades: %d%n".formatted(this.nomeProduto,
                this.precoProduto, this.quantidadeEmEstoque));
    }
}
