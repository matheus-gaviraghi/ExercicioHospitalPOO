package utilidades;

public class Sala {
    private String nomeSala;
    private int andarDaSala;
    private boolean salaReservada;
    private String dataReserva;

    public Sala(String nomeSala, int andarDaSala){
        this.nomeSala = nomeSala;
        this.andarDaSala = andarDaSala;
    }

    public void reservar(int dia, int mes, int ano){
        this.salaReservada = true;
        this.dataReserva = dia + "/" + mes + "/" + ano;
    }

    public void liberarSala(){
        this.salaReservada = false;
        this.dataReserva = "00/00/0000";
    }


    // Getters e Setters dos atributos de Sala
    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public int getAndarDaSala() {
        return andarDaSala;
    }

    public void setAndarDaSala(int andarDaSala) {
        this.andarDaSala = andarDaSala;
    }

    public boolean isSalaReservada() {
        return salaReservada;
    }

    public String getDataReserva() {
        return dataReserva;
    }

}
