import java.util.Scanner;

/*Crie um sistema para gerenciar assentos de uma sala de cinema.
Requisitos:
A sala deve ser representada por uma matriz de String ou char (ex: 10x10).
Inicialmente, todos os assentos estão "livres" (-).
O usuário deve poder escolher uma fileira e uma poltrona via Scanner.
Regra de Negócio: Se o assento estiver ocupado, o sistema deve avisar e pedir nova entrada. Se estiver livre, marque com X.
Evolução OO: Não faça tudo na main. Crie uma classe Cinema que possui a matriz como atributo privado (private) e métodos reservar(int fileira, int cadeira) e mostrarMapa().
*/

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