public class Exercicio8 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int constante = 2;

        System.out.println("Numeros após multiplicação por " + constante + ":");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * constante;
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
    }
}
