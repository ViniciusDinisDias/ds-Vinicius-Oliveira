package WhileExercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int lado = scanner.nextInt();

        int i = 0;

        while (i < lado) {
            int j = 0;
            while (j < lado) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

        scanner.close();
    }
    
}

