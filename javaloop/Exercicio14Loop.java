import java.util.Scanner;

public class Exercicio14Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Você deve inserir pelo menos um número.");
            return;
        }

        int menor, maior;
        int soma = 0;

        System.out.print("Digite o 1º número: ");
        int numero = scanner.nextInt();
        menor = maior = numero;
        soma = numero;

        for (int i = 2; i <= n; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();
            soma += numero;

            if (numero < menor) {
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("\nMenor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);


    }
}
