import java.util.Random;

public class Exercicio02 {
    static void main() {
        Random random = new Random();
        int[][] m = new int[5][5];
        int maior = Integer.MIN_VALUE; // maior = 0

        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length; j++) {
                m[i][j] = random.nextInt(0, 30);
                if(m[i][j] > maior) {
                    maior = m[i][j];
                }
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("maior = " + maior);

        // imprimir a localização do maior valor
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m.length; j++) {
                if(m[i][j] == maior) {
                    System.out.println("linha = " + (i + 1) + ", coluna = " + (j + 1));
                }
            }
        }
    }
}