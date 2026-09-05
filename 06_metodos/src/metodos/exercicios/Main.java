package metodos.exercicios;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("FIAT", "UNO", 2010);

        carro.infoCarro();

        Pessoa pessoa = new Pessoa("Regina", 37);

        pessoa.infoPessoa();

        Produto produto = new Produto("Notebook", 3500.00);
        Produto produto1 = new Produto("Lápis", -100);
        Produto produto2 = new Produto("", 200);

        produto.infoProduto();
        produto1.infoProduto();
        produto2.infoProduto();

    }
}
