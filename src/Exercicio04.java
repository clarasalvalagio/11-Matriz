import java.util.Random;
import java.util.Scanner;

public class Exercicio04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] mes = {"Janeiro", "Fevereiro", "Março",
                "Abril", "Maio", "Junho"};
        String[] categoria = new String[3];
        double[][] venda = new double[categoria.length][mes.length];
        double total, media;
        double maiorVenda = 0;
        int indiceMes = 0;

        // leitura das categorias
        for(int i = 0; i < categoria.length; i++) {
            System.out.print("Categoria: ");
            categoria[i] = sc.nextLine();
        }

        // geração das vendas
        for(int i = 0; i < venda.length; i++) {
            for(int j = 0; j < venda[i].length; j++) {
                venda[i][j] = random.nextDouble(1, 20);
                System.out.print(String.format("%.2f", venda[i][j]) + "\t");
            }
            System.out.println();
        }

        // impressão do total e média das vendas por categoria
        System.out.println("Total de vendas por categoria");
        for(int i = 0; i < venda.length; i++) {
            total = 0;
            for(int j = 0; j < venda[i].length; j++) {
                total += venda[i][j];
            }
            media = total / mes.length;  // media = total / venda[i].length
            System.out.print(categoria[i] + "  |  ");
            System.out.print(String.format("R$ %.2f", total) + "  |  ");
            System.out.println(String.format("R$ %.2f", media));
        }

        // mês com a maior total de vendas
        System.out.println("\n\nMês com o maior total de vendas");
        for(int j = 0; j < mes.length; j++) {
            total = 0;
            for(int i = 0; i < venda.length; i++) {
                total += venda[i][j];
            }
            if(total > maiorVenda) {
                maiorVenda = total;
                indiceMes = j;
            }
        }
        System.out.println(String.format("Maior total de vendas mensal R$ %.2f", maiorVenda));
        System.out.println("Mês com o maior total de vendas --> " + mes[indiceMes]);
    }
}
