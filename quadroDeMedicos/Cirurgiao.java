package quadroDeMedicos;
import pessoas.Medico;

import java.util.Collections;
import java.util.List;

public final class Cirurgiao extends Medico {
    private double cargaHorariaSemanal = 40;

    public Cirurgiao(String nome, int idade){
        super("José", 45);
    }

    public Cirurgiao(String nome, int idade, String registro){
        super(nome, idade, registro);
    }

    @Override
    public String realizarDiagnostico(List<String> sintomas) {

        String[] apendicite = {"Diarréia", "Dor intensa no abdômen", "Febre persistente"};

        Collections.sort(sintomas);

        if(sintomas.size() == apendicite.length) {
            for (int indice = 0; indice < apendicite.length; indice++) {
                if (sintomas.get(indice) != apendicite[indice]) {
                    break;
                } else if (indice + 1 == apendicite.length) {
                    return "O paciente está com apendicite e precisará ser submetido à cirurgia!";
                }
            }
        }
        return "Paciente realizará exames para verificar seu quadro!";
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Cirurgião" + "\nCara horária semanal: "
                + cargaHorariaSemanal + "\nSalário: " + this.calcularSalario(cargaHorariaSemanal);
    }
}
