public class Exercicio14 {
    public static void main(String[] args) {
        int[] vetor = {2, 7, 4, 6, 3, 8, 1, 9, 0, 5}; // vetor de exemplo

        System.out.println("Vetor original:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        // Substitui os elementos menores que 5 por 5
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 5) {
                vetor[i] = 5;
            }
        }

        System.out.println("\nVetor após substituição:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
