import java.util.Arrays;
public class Exercicio11 {
    public static void main(String[] args) {
        int[] numeros = {10, 8, 12, 28, 4, 11, 23, 41, 2, 5};

        System.out.println("Vetor antes da ordenação:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Ordenando o vetor em ordem crescente
        Arrays.sort(numeros);

        System.out.println("\nVetor em ordem crescente: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
