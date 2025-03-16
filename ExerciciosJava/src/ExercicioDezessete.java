import java.util.Scanner;
public class ExercicioDezessete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        double custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
        System.out.println("Custo final ao consumidor: R$ " + custoFinal);
        scanner.close();
    }
}
