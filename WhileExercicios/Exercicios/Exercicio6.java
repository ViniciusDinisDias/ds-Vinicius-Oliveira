package WhileExercicios;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int maior = 0;
        int segundoMaior = 0;

        while (contador < 10) {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            if (contador == 0) {
                maior = numero;
            } else if (contador == 1) {
                if (numero > maior) {
                    segundoMaior = maior;
                    maior = numero;
                } else {
                    segundoMaior = numero;
                }
            } else {
                if (numero > maior) {
                    segundoMaior = maior;
                    maior = numero;
                } else if (numero > segundoMaior) {
                    segundoMaior = numero;
                }
            }

            contador++;
        }

        System.out.println("Os dois maiores números digitados são: " + maior + " e " + segundoMaior);

        scanner.close();
    }
}