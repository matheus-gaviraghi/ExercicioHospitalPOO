package pessoas;

public abstract class Pessoa {

    // Atributos de classesGerais.Pessoa
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters dos atributos de Pessoa
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Sobreescrita do método toString()
    @Override
    public String toString() {
        return "Informações sobre esta pessoa: \nNome: " + this.getNome()
                + "\nIdade: " + this.getIdade() + " anos";
    }
}
