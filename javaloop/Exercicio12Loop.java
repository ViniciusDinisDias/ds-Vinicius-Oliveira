/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

/**
 *
 * @author CAMARGO
 */
public class Exercicio12Loop {
    public static void main(String[] args) {
        int primeiro = 0, segundo = 1, proximo;
        
        System.out.println(primeiro + " " + segundo + " ");
        
        while(true) {
            proximo = primeiro + segundo;
            System.out.println(proximo + " ");
            if (proximo > 500) {
                break;
            }
            
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
