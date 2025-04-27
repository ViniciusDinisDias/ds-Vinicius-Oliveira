public class Exercicio3 {
    public static void main(String[] args) {
        int[] numeros = {2, 9, 15, 3, 5, 0, 1, 11, 6, 10};

        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
