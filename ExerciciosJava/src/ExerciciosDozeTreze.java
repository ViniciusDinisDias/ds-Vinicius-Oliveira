import java.util.Scanner;
public class ExerciciosDozeTreze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade em anos: ");
        int anos = scanner.nextInt();
        System.out.println("Digite os meses: ");
        int meses = scanner.nextInt();
        System.out.println("Digite os dias: ");
        int dias = scanner.nextInt();
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Idade em dias: " + idadeEmDias);
        scanner.close();
    }
}
