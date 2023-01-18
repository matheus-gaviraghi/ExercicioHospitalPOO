package utilidades;

public class Atendimento {
    private String horarioInicio;
    private Sala salaConsulta;

    public Atendimento(int hora, int min){
        this.horarioInicio = hora + "h" + min + "min";
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    private String getInfosSalaConsulta(){
        return "Nome da sala: " + salaConsulta.getNomeSala() +
                ", Andar da sala: " + salaConsulta.getAndarDaSala();
    }

    public void organizarSalaConsulta(Sala salaConsulta, int dia, int mes, int ano){
        if(salaConsulta.isSalaReservada()){
            System.out.println("A sala desejada já está reservada! Favor aguardar até a sala ser liberada!");
        } else{
            salaConsulta.reservar(dia, mes, ano);
        }
    }
}
