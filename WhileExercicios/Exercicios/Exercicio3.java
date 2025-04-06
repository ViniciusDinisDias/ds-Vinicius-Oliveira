import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = teclado.nextInt();
        int i = 1;

        System.out.println("\nNúmeros pares de 1 até " + numero + ":");
        while (i <= numero) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        i = 1; // reinicia o contador para os ímpares

        System.out.println("\n\nNúmeros ímpares de 1 até " + numero + ":");
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        teclado.close();
    }
}

    

