package fundamentos_de_poo;

public class Bolo {

    int quantidadeAcucar;
    public static void main(String[] args) {

        Bolo boloDeChocolate = new Bolo();

        boloDeChocolate.quantidadeAcucar = 200;

        Bolo boloDeBaunilha = new Bolo();

        boloDeBaunilha.quantidadeAcucar = 150;

        System.out.printf("\nQuantidade de açúcar no bolo de chocolate: %d%n", boloDeChocolate.quantidadeAcucar);
        System.out.printf("Quantidade de açúcar no bolo de baunilha: %d%n", boloDeBaunilha.quantidadeAcucar);
    }
}
