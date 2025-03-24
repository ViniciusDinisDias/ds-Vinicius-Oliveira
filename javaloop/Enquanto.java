/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacondicional;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Enquanto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        
        while (numero <=10)
        {
            System.out.println(numero++);
        }
            
    }
}
