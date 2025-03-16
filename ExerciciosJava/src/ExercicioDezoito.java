import java.util.Scanner;
public class ExercicioDezoito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();
        System.out.println("Digite o valor total das vendas: ");
        double totalVendas = scanner.nextDouble();
        System.out.println("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();
        System.out.println("Digite a comissão por carro vendido: ");
        double comissaoPorCarro = scanner.nextDouble();
        double salarioFinal = salarioFixo + (carrosVendidos * comissaoPorCarro) + (totalVendas * 0.05);
        System.out.println("Salário final: R$ " + salarioFinal);
        scanner.close();
    }
}
