package metodos.exercicios;

public class Pessoa {
    private static final int IDADE_MAXIMA = 150;

    private String nomePessoa = "Desconhecido";
    private int idadePessoa = 0;

    public Pessoa(String nomePessoa, int idadePessoa) {
        setNomePessoa(nomePessoa);
        setIdadePessoa(idadePessoa);

    }
    public void setNomePessoa(String nomePessoa) {
        if(nomePessoa == null || nomePessoa.trim().isEmpty()) {
            System.out.println("\nErro: O campo nome não pode estar vazio.");
            return;
        }else {
            this.nomePessoa = nomePessoa.trim();
        }
    }
    public void setIdadePessoa(int idadePessoa) {
        if(idadePessoa < 0 || idadePessoa > IDADE_MAXIMA) {
            System.out.println("Erro: Entre com uma idade válida");
            return;
        }else {
            this.idadePessoa = idadePessoa;
        }
    }
    public String getNomePessoa() {
        return this.nomePessoa;
    }
    public int getIdadePessoa() {
        return this.idadePessoa;
    }
    public void infoPessoa(){
        System.out.println("========== Informações da pessoa ==========");
        System.out.println("Nome: %s%nIdade: %d%n".formatted(getNomePessoa(),getIdadePessoa()));
    }

}
