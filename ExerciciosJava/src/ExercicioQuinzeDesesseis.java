import java.util.Scanner;
public class ExercicioQuinzeDesesseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário atual: ");
        double salario = scanner.nextDouble();
        System.out.println("Digite o percentual de reajuste: ");
        double percentual = scanner.nextDouble();
        double novoSalario = salario + (salario * percentual / 100);
        System.out.println("Novo salário: R$ " + novoSalario);
        scanner.close();
    }
}
