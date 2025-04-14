import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[4];
        String[] sobrenome = new String[4];
        
        for (int i = 0; i < 4; i++ ) {
            System.out.print("Digite o nome da pessoa"+ (i + 1) + ":");
            nome[i] = teclado.nextLine();
            System.out.print("Digite o sobrenome da pessoa"+ (i + 1) + ":");
            sobrenome[i] = teclado.nextLine();
        }
        
        //For para os nomes completos digitados
        for (int i = 0; i < 4; i++) {
            System.out.println(nome[i] + " " + sobrenome[i]);
        }
        teclado.close();
    }
}
