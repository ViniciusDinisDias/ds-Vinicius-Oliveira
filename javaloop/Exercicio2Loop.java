import java.util.Scanner;

public class Exercicio2Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, soma, media;
        char novocalculo;

        do {
            System.out.println("Digite a primeira nota: ");
            nota1 = teclado.nextDouble();

            while (nota1 < 0 || nota1 > 10) {
                System.out.println("NOTA INVÁLIDA! Digite a primeira nota (0 a 10): ");
                nota1 = teclado.nextDouble();
            }

            System.out.println("Digite a segunda nota: ");
            nota2 = teclado.nextDouble();

            while (nota2 < 0 || nota2 > 10) {
                System.out.println("NOTA INVÁLIDA! Digite a segunda nota (0 a 10): ");
                nota2 = teclado.nextDouble();
            }

            soma = nota1 + nota2;
            media = soma / 2;

            System.out.printf("A média das notas é: %.2f%n", media);

            System.out.println("Deseja fazer um novo cálculo S/N?");
            novocalculo = teclado.next().toUpperCase().charAt(0);

        } while (novocalculo == 'S'); // Repete se o usuário digitar 'S'

        teclado.close();
    }
}
