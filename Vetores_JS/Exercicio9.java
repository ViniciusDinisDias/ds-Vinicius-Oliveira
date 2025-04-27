public class Exercicio9 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valorEspecifico = 6; // valor específico para comparar

        System.out.println("Elementos maiores que " + valorEspecifico + ":");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > valorEspecifico) {
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }
    }
}
