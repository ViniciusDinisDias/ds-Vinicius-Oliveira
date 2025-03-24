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
public class Exercicio1Loop {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double numero1 = teclado.nextInt();
        System.out.println("Digite o segundo número:");
        double numero2 = teclado.nextInt();
        
        while (numero2 == 0)
        {
            System.out.println("VALOR INVÁLIDO! Digite um novo número: ");
            numero2 = teclado.nextDouble();
        }
        
        double divisao = numero1/numero2;
        System.out.printf("A divisão do primeiro valor pelo segundo valor é: %.2f ", divisao );
    }
}
