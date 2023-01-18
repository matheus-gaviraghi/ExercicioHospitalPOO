package quadroDeMedicos;

import pessoas.Medico;
import pessoas.Paciente;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ClinicoGeral extends Medico {

    private double cargaHorariaSemanal = 50;

    public ClinicoGeral(String nome, int idade){
        super("José", 45);
    }

    public ClinicoGeral(String nome, int idade, String registro){
        super(nome, idade, registro);
    }

    @Override
    public String realizarDiagnostico(List<String> sintomas) {

        String[] enxaqueca = {"Dor de cabeça", "Dor nos olhos", "Enjôo"};
        String[] estomatite = {"Aftas na boca", "Febre", "Manchas vermelhas na boca", "Inchaço"};

        Collections.sort(sintomas);

        if(sintomas.size() == enxaqueca.length){
            for(int indice=0; indice<enxaqueca.length; indice++){
                if(sintomas.get(indice) != enxaqueca[indice]){
                    break;
                } else if(indice+1 == enxaqueca.length){
                    return "O paciente está com enxaqueca!";
                }
            }
        } else if (sintomas.size() == estomatite.length) {
            for(int indice=0; indice<estomatite.length; indice++){
                if(sintomas.get(indice) != estomatite[indice]){
                    break;
                } else if(indice+1 == estomatite.length){
                    return "O paciente está com estomatite!";
                }
            }
        }

        return "Paciente realizará exames para verificar seu quadro!";
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Clinico Geral" + "\nCara horária semanal: "
                + cargaHorariaSemanal + "\nSalário: " + this.calcularSalario(cargaHorariaSemanal);
    }
}
