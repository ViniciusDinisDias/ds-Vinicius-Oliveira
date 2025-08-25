/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conectabanco;
import java.util.Scanner;


/**
 *
 * @author CAROLAR
 */
public class ConectaBanco {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("\n====Menu====");
        System.out.println("1 - Inserir Aluno");
        System.out.println("2 - Consultar Alunos");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opção:");
        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite o código do aluno: ");
                int codigo = sc.nextInt();
                sc.nextLine(); // limpar buffer
                System.out.println("Digite o nome do aluno: ");
                String nome = sc.nextLine();

                Inserir_Dados.InserirAluno(String.valueOf(codigo), nome);
                break;

            case 2:
                Consulta.Consultar_Dados();
                break;

            case 0:
                System.out.println("Parando");
                break;

            default:
                System.out.println("Opção inválida");
        }
    } while (opcao != 0);

    sc.close();
}

