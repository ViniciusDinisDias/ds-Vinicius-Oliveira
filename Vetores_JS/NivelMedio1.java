import java.util.Scanner;
public class NivelMedio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];

        // Preenchendo o vetor com 20 números inteiros
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Pedir ao usuário o número que deseja buscar
        System.out.print("\nDigite o número que deseja buscar: ");
        int numeroBuscar = scanner.nextInt();

        // Executando a busca linear
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBuscar) {
                System.out.println("Número " + numeroBuscar + " encontrado na posição " + i);
                encontrado = true;
                break;
            }
        }

        // Caso o número não tenha sido encontrado
        if (!encontrado) {
            System.out.println("Número " + numeroBuscar + " não encontrado no vetor.");
        }

        scanner.close();
    }
}
