import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cinema cinema = new Cinema(10,10);

        int op;

        do {
            cinema.mostrarMapa();

            System.out.println("\n----- Menu -----");
            System.out.println("1 - Reservar assento");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();

            if(op == 1) {

                boolean reservado = false;

                while (!reservado) {
                    System.out.print("Digite a fileira (1-10): ");
                    int fileira = sc.nextInt();

                    System.out.print("Digite a cadeira (1-10): ");
                    int cadeira = sc.nextInt();

                    reservado = cinema.reservar(fileira, cadeira);
                }
            }
        } while (op != 0);

        sc.close();
    }
}