import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel() {
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void realizarReserva(Reserva reserva) {
        reservas.add(reserva);
        for (Quarto quarto : quartos) {
            if (quarto.getTipo().equals(reserva.getTipoQuarto()) && quarto.isDisponivel() && reserva.getNumeroQuartos() > 0) {
                quarto.setDisponivel(false);
                reserva.getNumeroQuartos();
                break;
            }
        }
    }

    public void checkIn(int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto) {
                quarto.setDisponivel(false);
                break;
            }
        }
    }

    public void checkOut(int numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numeroQuarto) {
                quarto.setDisponivel(true);
                break;
            }
        }
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}
