package Vetores_JS;

public class Exercicio12 {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 5, 19, 8, 10, 3, 16, 25, 14};

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = soma / (double) numeros.length;

        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                contador++;
            }
        }

        // Exibir o resultado
        System.out.println("A média dos elementos é: " + media);
        System.out.println("Número de elementos maiores que a média: " + contador);
    }
}
