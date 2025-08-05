import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ler o número de genes a serem analisados
        System.out.print("Digite o número de genes: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // limpar a quebra de linha

        // 2. Criar o array para armazenar os genes
        String[] genes = new String[N];

        // 3. Ler os N genes
        System.out.println("Digite os genes:");
        for (int i = 0; i < N; i++) {
            genes[i] = scanner.nextLine();
        }

        // 4. Ler o gene a ser analisado
        System.out.print("Digite o gene que deseja analisar: ");
        String geneAlvo = scanner.nextLine();

        // 5. Contar quantas vezes o gene alvo aparece no array
        int contador = 0;
        for (int i = 0; i < N; i++) {
            if (genes[i].equals(geneAlvo)) {
                contador++;
            }
        }

        // 6. Verificar o resultado e imprimir a mensagem correta
        if (contador == 0) {
            System.out.println("Sumiuu!");
        } else if (contador == 1) {
            System.out.println("Ainda não é o suficiente");
        } else {
            System.out.println("Achei o danado!");
        }

        scanner.close();
    }
}
