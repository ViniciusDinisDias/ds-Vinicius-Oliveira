import java.util.Scanner;
public class Exercicio9Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        // Leitura e validação do número
        do {
            System.out.print("Digite um número entre 1 e 10: ");
            numero = teclado.nextInt();
        } while (numero < 1 || numero > 10);

        // Tabuada dele
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
