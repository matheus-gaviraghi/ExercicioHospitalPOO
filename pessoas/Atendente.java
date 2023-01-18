package pessoas;

import utilidades.Atendimento;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Atendente extends Funcionario {
    private int quantidadePacientesAtendidos;
    private Atendimento atendimento;

    // Construtores
    public Atendente(String nome, int idade){
        super(nome, idade);
        this.quantidadePacientesAtendidos = 0;
    }

    public Atendente(String nome, int idade, String registro){
        super(nome, idade, registro);
        this.quantidadePacientesAtendidos = 0;
    }

    // Getter do atributo de Atendente
    public int getQuantidadePacientesAtendidos() {
        return quantidadePacientesAtendidos;
    }

    public void addPacienteAtendido() {
        this.quantidadePacientesAtendidos += 1;
    }

    public void iniciarAtendimento(){
        ZoneId idRegiao = ZoneId.systemDefault();
        LocalDateTime timeZone = LocalDateTime.now(idRegiao);

        atendimento = new Atendimento(timeZone.getHour(), timeZone.getMinute());
    }

    public Atendimento getAtendimento(){
        return this.atendimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCargo: Atendente" + "\nInformações do atendimento: \nHorário de início: " +
                atendimento.getHorarioInicio() + "\nQuantidade de pacientes atendidos: " + getQuantidadePacientesAtendidos();
    }
}
