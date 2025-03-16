import java.util.Scanner;
public class ExerciciosSeteOitoNoveDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o consumo do carro (Km/l): ");
        double consumo = scanner.nextDouble();
        System.out.println("Digite a distância da viagem (Km): ");
        double distancia = scanner.nextDouble();
        System.out.println("Digite o preço do combustível (R$/l): ");
        double preco = scanner.nextDouble();
        double custoViagem = (distancia / consumo) * preco;
        System.out.println("Custo da viagem: R$ " + custoViagem);
        scanner.close();
    }
}
