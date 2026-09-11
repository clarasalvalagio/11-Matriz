import java.util.Random;

public class Exercicio07 {
    static void main() {
        Random random = new Random();
        int[][] m = new int[3][3];
        int aux, coluna;

        // preencher e imprimir a matriz
        System.out.println("Matriz original");
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length; j++) {
                m[i][j] = random.nextInt(1, 26);
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        // troca as diagonais
        coluna = m.length - 1;
        for(int i = 0; i < m.length; i++, coluna--) {
            aux = m[i][i];
            m[i][i] = m[i][coluna];
            m[i][coluna] = aux;
        }

        // imprimir a matriz
        System.out.println("Matriz com as diagonais invertidas");
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
