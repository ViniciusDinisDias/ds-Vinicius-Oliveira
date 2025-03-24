/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacondicional;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class JavaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        
        for (int i = 0; i<= numero; i++)
        {
        System.out.println("O número é: " + i);
        }
        
        }
        
    
}
