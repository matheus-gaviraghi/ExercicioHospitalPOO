package quadroDeMedicos;
import pessoas.Medico;

import java.util.Collections;
import java.util.List;

public final class Neuro extends Medico {

    private double cargaHorariaSemanal = 35;

    public Neuro(String nome, int idade){
        super("José", 45);
    }

    public Neuro(String nome, int idade, String registro){
        super(nome, idade, registro);
    }

    @Override
    public String realizarDiagnostico(List<String> sintomas) {
        String[] enxaquecaComAura = {"Dificuldade para falar", "Paralisia de um membro",
                "Vertigem", "Visão turva"};

        Collections.sort(sintomas);

        if(sintomas.size() == enxaquecaComAura.length) {
            for (int indice = 0; indice < enxaquecaComAura.length; indice++) {
                if (sintomas.get(indice) != enxaquecaComAura[indice]) {
                    break;
                } else if (indice + 1 == enxaquecaComAura.length) {
                    return "O paciente está com enxaqueca com aura e precisará de tratamento!";
                }
            }
        }
        return "Paciente realizará exames para verificar seu quadro!";
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Neurologista" + "\nCara horária semanal: "
                + cargaHorariaSemanal + "\nSalário: " + this.calcularSalario(cargaHorariaSemanal);
    }
}
