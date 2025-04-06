import java.util.Scanner;

public class Exercicio15Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Você deve inserir pelo menos um número.");
            return;
        }

        int menor = 0, maior = 0, soma = 0;
        int numero = 0;

        for (int i = 1; i <= n; i++) {
            boolean valido = false;

            while (!valido) {
                System.out.print("Digite o " + i + "º número (entre 0 e 1000): ");
                numero = scanner.nextInt();

                if (numero >= 0 && numero <= 1000) {
                    valido = true;
                } else {
                    System.out.println("Número inválido! Digite um valor entre 0 e 1000.");
                }
            }

            if (i == 1) {
                menor = maior = numero;
            } else {
                if (numero < menor) menor = numero;
                if (numero > maior) maior = numero;
            }

            soma += numero;
        }

        System.out.println("\nMenor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);


    }
}
