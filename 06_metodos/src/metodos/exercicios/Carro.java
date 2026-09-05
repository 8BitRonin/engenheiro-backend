package metodos.exercicios;

public class Carro {
    // ========== Definindo uma Constante para o número não ficar solto ==========
    private  static final int ANO_MINIMO = 1886;

    // ========== Atributos privados para a utilização de get e set ========3==
    private String marcaCarro = "Desconhecida";
    private String modeloCarro = "Desconhecida";
    private int anoCarro = 0;

    // ========== Construtor ==========
    public Carro(String marcaCarro, String modeloCarro, int anoCarro) {
        setMarcaCarro(marcaCarro);
        setModeloCarro(modeloCarro);
        setAnoCarro(anoCarro);
    }
    // ========== STTERS ==========
    public void setMarcaCarro(String marcaCarro) {
        if(marcaCarro == null || marcaCarro.trim().isEmpty()) {
            System.out.println("Erro: marca não pode ser vazia.");
            return;
        } else{
            this.marcaCarro = marcaCarro.trim();
        }
    }
    public void setModeloCarro(String modeloCarro) {
        if(modeloCarro == null || modeloCarro.trim().isEmpty()) {
            System.out.println("Erro: modelo não pode ser vazio.");
            return;
        }else {
            this.modeloCarro = modeloCarro.trim();
        }
    }
    public void setAnoCarro(int anoCarro) {
        if(anoCarro < ANO_MINIMO){
            System.out.println("Erro: ano mínimo é " + ANO_MINIMO);
            return;
        }else {
            this.anoCarro = anoCarro;
        }
    }
    // ========== GETTERS ==========
    public String getMarcaCarro() {
        return this.marcaCarro;
    }
    public String getModeloCarro() {
        return this.modeloCarro;
    }
    public int getAnoCarro() {
        return this.anoCarro;
    }
    // ========== Método de Apresentação ==========
    public void infoCarro() {
        System.out.println("\n========== INFORMAÇÕES DO CARRO ==========");
        System.out.println("\nMarca: %s%nModelo: %s%nAno: %d%n".formatted(getMarcaCarro(), getModeloCarro(),
                getAnoCarro()));
    }
}
