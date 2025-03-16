import java.util.Scanner;
public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("Antecessor: " + (numero - 1));
        scanner.close();
    }
}
