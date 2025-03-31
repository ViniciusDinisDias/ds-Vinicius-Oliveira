/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Exercicio11Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o número de termos da sequência de Fibonacci: ");
        int n = teclado.nextInt();
        
        int primeiro = 1;
        int segundo = 1;
        int proximo;
        
        System.out.println(primeiro + " " + segundo + " ");
        
        for (int i = 3; i<= n; i++) {
            proximo = primeiro + segundo;
            System.out.println(proximo + "");
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
