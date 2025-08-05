import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notasAntonio = new int[4];
        int[] notasCharles = new int[4];
        int[] notasTotais = new int[8];

        System.out.println("Digite as notas do primeiro avaliador: ");
        for (int i = 0; i < 4; i++) {
            notasAntonio[i] = scanner.nextInt();
        }

        System.out.println("Digite as notas do segundo avaliador: ");
        for (int i = 0; i < 4; i++) {
            notasCharles[i] = scanner.nextInt();
        }

        int i = 0, j = 0, k = 0;
        while (i < 4 && j < 4) {
            if (notasAntonio[i] < notasCharles[j]) {
                notasTotais[k++] = notasAntonio[i++];
            } else {
                notasTotais[k++] = notasCharles[j++];
            }
        }
        while (i < 4) {
            notasTotais[k++] = notasAntonio[i++];
        }
        while (j < 4) {
            notasTotais[k++] = notasCharles[j++];
        }

        int soma = 0;
        for (int nota : notasTotais) {
            soma += nota;
        }
        int media = soma / 8;

        for (int nota : notasTotais) {
            System.out.print(nota);
        }
        System.out.println("-" + media);
    }
}