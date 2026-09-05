package fundamentos.metodos;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Caderno Espiral", 21.00, 1000);

        produto.exibirIfoProduto();

        System.out.println("------------------------------------------------");


        Carro carro1 = new Carro();
        carro1.marcaDoCarro = "Fiat";
        carro1.modeloDoCarro = "Uno";
        carro1.anoDoCarro = 1999;

        Carro carro2 = new Carro("Honda", "CIV");
        Carro carro3 = new Carro("Fiat", "Palio", 2000);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();

    }
}
