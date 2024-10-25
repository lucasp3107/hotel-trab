import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Quarto");
            System.out.println("2. Realizar Reserva");
            System.out.println("3. Check-in");
            System.out.println("4. Check-out");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Número do quarto: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Tipo de quarto (solteiro, casal, suite): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Preço diário: ");
                    double preco = scanner.nextDouble();
                    hotel.adicionarQuarto(new Quarto(numero, tipo, preco));
                    System.out.println("Quarto adicionado.");
                    break;

                case 2:
                    System.out.print("Nome do hóspede: ");
                    String nomeHospede = scanner.nextLine();
                    System.out.print("Data de check-in (yyyy-mm-dd): ");
                    LocalDate dataCheckIn = LocalDate.parse(scanner.nextLine());
                    System.out.print("Data de check-out (yyyy-mm-dd): ");
                    LocalDate dataCheckOut = LocalDate.parse(scanner.nextLine());
                    System.out.print("Número de quartos reservados: ");
                    int numQuartosReservados = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Tipo de quarto reservado: ");
                    String tipoQuartoReservado = scanner.nextLine();

                    hotel.realizarReserva(new Reserva(new Hospede(nomeHospede), dataCheckIn, dataCheckOut, numQuartosReservados, tipoQuartoReservado));
                    System.out.println("Reserva realizada.");
                    break;

                case 3:
                    System.out.print("Número do quarto para check-in: ");
                    int numeroCheckIn = scanner.nextInt();
                    hotel.checkIn(numeroCheckIn);
                    System.out.println("Check-in realizado.");
                    break;

                case 4:
                    System.out.print("Número do quarto para check-out: ");
                    int numeroCheckOut = scanner.nextInt();
                    hotel.checkOut(numeroCheckOut);
                    System.out.println("Check-out realizado.");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
