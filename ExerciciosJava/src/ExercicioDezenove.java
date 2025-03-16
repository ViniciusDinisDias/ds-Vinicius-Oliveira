import java.util.Scanner;
public class ExercicioDezenove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua altura (m): ");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        double pesoIdeal = (sexo == 'M' || sexo == 'm') ? (72.7 * altura - 58) : (62.1 * altura - 44.7);
        System.out.println("Peso ideal de " + nome + ": " + pesoIdeal + " kg");
        scanner.close();
    }
}
