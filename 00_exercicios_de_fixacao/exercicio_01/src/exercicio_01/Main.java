package exercicio_01;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Clean Code", "Robert C. Martin",
                464);
        Livro livro2 = new Livro("H", "B", -50);
        Livro livro3 = new Livro("", "", 200);

        livro1.infoLivro();
        livro2.infoLivro();
        livro3.infoLivro();
    }
}