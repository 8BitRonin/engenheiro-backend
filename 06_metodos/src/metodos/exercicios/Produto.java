package metodos.exercicios;

public class Produto {
    private String nomeProduto = "Sem nome";
    private double precoProduto = 0.0;

    public Produto(String nomeProduto, double precoProduto) {
        setNomeProduto(nomeProduto);
        setPrecoProduto(precoProduto);
    }
    public void setNomeProduto(String nomeProduto) {
        if(nomeProduto == null || nomeProduto.trim().isEmpty()) {
            System.out.println("Erro: O campo nome do produto não pode ser vazio.");
            return;
        }else {
            this.nomeProduto = nomeProduto.trim();
        }
    }
    public void setPrecoProduto(double precoProduto) {
        if(precoProduto <= 0) {
            System.out.println("Erro: Preço deve ser maior que zero.");
            return;
        }else {
            this.precoProduto = precoProduto;
        }
    }
    public String getNomeProduto() {
        return this.nomeProduto;
    }
    public double getPrecoProduto() {
        return this.precoProduto;
    }
    public void infoProduto() {
        System.out.println("========== Informações do produto ==========");
        System.out.println("Produto: %s%nPreço: %.2f R$%n".formatted(getNomeProduto(), getPrecoProduto()));
    }
}
