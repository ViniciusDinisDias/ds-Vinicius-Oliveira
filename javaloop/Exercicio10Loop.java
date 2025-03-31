/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

/**
 *
 * @author CAMARGO
 */
public class Exercicio10Loop {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        double taxaA = 0.03;
        double taxaB = 0.015;
        int anos = 0;
        
        while (popA < popB) {
            popA += popA * taxaA;
            popB += popB * taxaB;
            anos++; // conta os anos
        }
        
        System.out.println("Serão necessários " + anos + " anos para a população de A ultrapassar a de B. ");
        
    }
}
