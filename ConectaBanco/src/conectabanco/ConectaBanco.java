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
        // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      int opcao;
      
      do {
          System.out.println("\n====Menu====");
          System.out.println("1 - Inserir Aluno");
          System.out.println("1 - Consultar Alunos");
          System.out.println("0 - Sair");
          System.out.println("Escolha uma opção:");
          opcao = sc.nextInt();
          sc.nextLine();
          
          switch (opcao){
              case 1:
                  System.out.println("Digite o código do aluno");
                  
                  int codigo = sc.nextInt();
                  System.out.println("Digite o nome do aluno: ");
                  String nome = sc.nextLine();
                  Inserir_Dados.InserirAluno(codigo_aluno, nome_aluno);
                  break;
                  
              case 2:
                  Consultar.Consultardados();
                  break;
                  
              case 0:
                  System.out.println("Parando");
                  
                  default: 
                      System.out.println("Opção inválida");
          
            } 
        } while (opcao != 0);
                
      sc.close();
    }
} 


