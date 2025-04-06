import java.util.Scanner;
public class Exercicio7Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N;

        // Garante que N seja maior que 0
        do {
            System.out.print("Digite um valor N (maior que 0): ");
            N = teclado.nextInt();
        } while (N <= 0);

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

    }
}
