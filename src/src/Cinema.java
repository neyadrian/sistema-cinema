public class Cinema {

    private char[][] assentos;

    public Cinema(int linhas, int colunas) {
        assentos = new char[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                assentos[i][j] = '-';
            }
        }
    }

    public boolean reservar(int fileira, int cadeira) {

        fileira = fileira - 1;
        cadeira = cadeira - 1;

        if (assentos[fileira][cadeira] == 'X') {
            System.out.println("Assento já ocupado!");
            return false;
        }

        assentos[fileira][cadeira] = 'X';
        System.out.println("Assento reservado com sucesso!");
        return true;
    }

    public void mostrarMapa() {
        System.out.println("\nMapa de Assentos");
        for (int i = 0; i < assentos.length; i++) {
            for (int j =0; j < assentos.length; j++) {
                System.out.println(assentos[i][j] + " ");
            }
            System.out.println();
        }
    }

}
