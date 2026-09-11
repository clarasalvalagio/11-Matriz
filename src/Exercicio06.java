import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int lina, linb, cola, colb;

        System.out.print("Total de linhas de A: ");
        lina = sc.nextInt();
        System.out.print("Total de colunas de A: ");
        cola = sc.nextInt();
        System.out.print("Total de colunas de B: ");
        colb = sc.nextInt();
        linb = cola;

        int[][] a = new int[lina][cola];
        int[][] b = new int[linb][colb];
    }
}
