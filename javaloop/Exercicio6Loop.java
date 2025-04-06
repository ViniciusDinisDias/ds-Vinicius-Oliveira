import java.util.Scanner;

public class Exercicio6Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor N (maior que 0): ");
        int N = teclado.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
