import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int numero;
        int maior = 0;

        System.out.print("Digite o 1º número: ");
        numero = scanner.nextInt();
        maior = numero; 
        contador++;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            contador++;
        }

        System.out.println("O maior número digitado foi: " + maior);
        scanner.close();
    }
}

