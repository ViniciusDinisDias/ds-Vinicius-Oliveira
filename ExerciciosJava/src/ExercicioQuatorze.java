import java.util.Scanner;
public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();
        System.out.println("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();
        System.out.println("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();
        System.out.println("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();
        System.out.println("Percentual de votos brancos: " + ((double) votosBrancos / totalEleitores * 100) + "%");
        System.out.println("Percentual de votos nulos: " + ((double) votosNulos / totalEleitores * 100) + "%");
        System.out.println("Percentual de votos válidos: " + ((double) votosValidos / totalEleitores * 100) + "%");
        scanner.close();
    }
}
