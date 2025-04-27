public class Exercicio10 {
    public static void main(String[] args) {
        int[] numeros = {-1, -2, 3, -4, -5, 6, -7, -8, 9, 10};

        System.out.println("Vetor antes da substituição:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }

        System.out.println("\nVetor após a substituição:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
