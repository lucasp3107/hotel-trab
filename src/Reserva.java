import java.time.LocalDate;

public class Reserva {
    private Hospede hospede;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    private int numeroQuartos;
    private String tipoQuarto;

    public Reserva(Hospede hospede, LocalDate dataCheckIn, LocalDate dataCheckOut, int numeroQuartos, String tipoQuarto) {
        this.hospede = hospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.numeroQuartos = numeroQuartos;
        this.tipoQuarto = tipoQuarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }
}
