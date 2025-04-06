import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos na sala: ");
        int alunos = teclado.nextInt();
        int i = 1;
        double somanotas = 0;

        while( i <= alunos) {
            System.out.printf("Digite a nota do %dº aluno: ", i);
            double notas = teclado.nextDouble();
            somanotas+= notas;
            i+=1;
        }

        double mediasala = somanotas/alunos;
        System.out.println("Media da sala: " + mediasala);

        teclado.close();
    }
}
