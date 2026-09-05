package exercicio_01;

public class Livro {
    private String titulo = "Sem título";
    private String autor = "Desconhecido";
    private int paginas = 0;
    
    public Livro(String titulo, String autor, int paginas) {
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
    }
    public void setTitulo(String titulo) {
        if(titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Erro: Título não pode estar vazio.");
            return;
        }else {
            this.titulo = titulo.trim();
        }
    }
    public void setAutor(String autor) {
        if(autor == null || autor.trim().isEmpty()) {
            System.out.println("Erro: Autor nãõ pode estar vazio.");
            return;
        }else {
            this.autor = autor.trim();

        }
    }
    public void setPaginas(int paginas) {
        if(paginas <= 0) {
            System.out.println("Erro: Páginas precisa ser maior que zero.");
            return;
        }else {
            this.paginas = paginas;

        }
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getPaginas() {
        return this.paginas;
    }
    public void infoLivro() {
        System.out.println("\nTítulo: %s%nAutor: %s%nPáginas: %d%n".formatted(getTitulo(), getAutor(), getPaginas()));
    }

} 



