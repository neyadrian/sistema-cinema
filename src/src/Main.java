import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String salas[][] = new String[10][10];

        for (int i = 0; i < salas.length; i++) {
            for (int j = 0; j < salas.length; j++) {
                salas[i][j] = "-";
            }
        }


        sc.close();
    }
}