import java.util.Scanner;
public class NivelMedio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];

        // Preenchendo o vetor com 20 números inteiros
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Aplicando o algoritmo Bubble Sort
        bubbleSort(vetor);

        // Exibindo o vetor ordenado
        System.out.println("\nVetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Função para aplicar o algoritmo Bubble Sort
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;

        // Repetir até que o vetor esteja ordenado
        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            // Comparar elementos adjacentes e trocar se necessário
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Trocar os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocou = true;
                }
            }

            // Se não houve troca, o vetor já está ordenado
            if (!trocou) break;
        }
    }
}
