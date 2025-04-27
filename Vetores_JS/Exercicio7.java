public class Exercicio7 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        System.out.println("Média dos elementos: " + media);
    }
}
