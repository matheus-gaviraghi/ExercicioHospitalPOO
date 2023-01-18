package pessoas;

import java.util.Objects;

public class Funcionario extends Pessoa {
    // Atributo extra de Funcionário
    private String registro;

    // Construtores
    public Funcionario(String nome, int idade){
        super(nome, idade);
        this.registro = "Sem registro até o momento!";
    }

    public Funcionario(String nome, int idade, String registro){
        super(nome, idade);
        this.registro = registro;
    }

    // Getters e Setters dos atributos
    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    // Sobreescrita de métodos: toString() e equals()
    @Override
    public String toString(){
        return super.toString() + "\nRegistro: " + this.getRegistro();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario funcionarioComparado = (Funcionario) o;
        return Objects.equals(registro, funcionarioComparado.registro);
    }

}
