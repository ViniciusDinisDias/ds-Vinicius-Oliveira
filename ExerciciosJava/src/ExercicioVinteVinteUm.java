import java.util.Scanner;
public class ExercicioVinteVinteUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços dos combustíveis
        double precoAlcool = 2.90;
        double precoGasolina = 3.30;

        // Entrada de dados
        System.out.print("Digite o tipo de combustível (A para álcool, G para gasolina): ");
        char tipoCombustivel = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de litros: ");
        double litros = scanner.nextDouble();

        double precoPorLitro, desconto = 0;

        // Verifica o tipo de combustível e aplica o desconto correspondente
        if (tipoCombustivel == 'A') {
            precoPorLitro = precoAlcool;
            desconto = (litros <= 20) ? 0.03 : 0.05;
        } else if (tipoCombustivel == 'G') {
            precoPorLitro = precoGasolina;
            desconto = (litros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.println("Tipo de combustível inválido!");
            return;
        }

        // Cálculo do valor a pagar
        double totalSemDesconto = litros * precoPorLitro;
        double valorDesconto = totalSemDesconto * desconto;
        double totalPagar = totalSemDesconto - valorDesconto;

        // Exibição do resultado
        System.out.printf("Valor a ser pago: R$ %.2f%n", totalPagar);

        scanner.close();
    }
}
