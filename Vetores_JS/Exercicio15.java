import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        // Preenchendo o vetor com 10 números inteiros
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Exibindo os elementos que estão nas posições ímpares
        System.out.println("\nElementos nas posições ímpares:");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.println("Índice " + i + ": " + vetor[i]);
        }

        scanner.close();
    }
}
