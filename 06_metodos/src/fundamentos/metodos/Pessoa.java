package fundamentos.metodos;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return this.nome;
    }
    public int getIdade(int idade) {
        return this.idade = idade;
    }
    public String setNome() {
        if(this.nome instanceof String) {
            return "Nome: %s".formatted(this.nome);
        }
        else {
            return "Nome não pode estar vazio";
        }
    }
    public void setIdade(int idade) {
        if(this.idade > 0 && this.idade < 150) {
            this.idade = idade;
        }
    }
    public void obterInfoPessoa() {
        System.out.println("\nNome: %s%n".formatted(this.nome));
        System.out.println("Idade: %d%n".formatted(this.idade));
    }
}
