public class Exercicio6 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Elementos nas posições pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }
    }
}
