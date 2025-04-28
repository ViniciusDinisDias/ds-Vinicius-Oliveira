package Vetores_JS;

public class Exercicio13 {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 15, 18, 8, 9, 6, 20, 25, 30};

        System.out.println("Elementos que são múltiplos de 3:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }
}
