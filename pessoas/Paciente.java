package pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Paciente extends Pessoa{

    private List<String> sintomas = new ArrayList<>();
    private String numeroConvenio;
    private String quadroClinico;

    public Paciente(String nome, int idade, String numeroConvenio) {
        super(nome, idade);
        this.numeroConvenio = numeroConvenio;
        this.quadroClinico = "Quadro clínico indefinido";
    }

    public List<String> sintomas() {
        return sintomas;
    }

    public void addSintoma(String sintoma) {
        this.sintomas.add(sintoma);
    }

    public String getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public String getQuadroClinico() {
        return quadroClinico;
    }

    public void setQuadroClinico(String quadroClinico) {
        this.quadroClinico = quadroClinico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente pacienteComparado = (Paciente) o;
        return Objects.equals(numeroConvenio, pacienteComparado.getNumeroConvenio());
    }

    @Override
    public String toString() {
        return super.toString() + "\nConvênio: " + this.numeroConvenio +
                "\nQuadro clínico: " + this.quadroClinico;
    }
}
