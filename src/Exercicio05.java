import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int linha, coluna;

        System.out.print("Total de linhas --> ");
        linha = sc.nextInt();
        System.out.print("Total de colunas --> ");
        coluna = sc.nextInt();

        int[][] c = new int[linha][coluna];
        int[][] ct = new int[coluna][linha];

        // preencher a matriz C
        System.out.println("Matriz original");
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c[i].length; j++) {
                c[i][j] = random.nextInt(1, 10);
                System.out.print(c[i][j] + "\t");
                ct[j][i] = c[i][j];
            }
            System.out.println();
        }

        // impressão da matriz transposta
        System.out.println("\nMatriz transposta");
        for(int i = 0; i < ct.length; i++) {
            for(int j = 0; j < ct[i].length; j++) {
                System.out.print(ct[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
