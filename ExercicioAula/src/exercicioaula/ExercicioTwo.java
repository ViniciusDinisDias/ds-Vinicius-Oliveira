/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioaula;

/**
 *
 * @author CAMARGO
 */
public class ExercicioTwo {
    public static void main(String[] args) {
        int DistanciaTotal;
        int TotalCombustivel;
        int ConsumoMedio;
        
        DistanciaTotal = 150; //Km
        TotalCombustivel = 15; //Litros
        
        ConsumoMedio = DistanciaTotal / TotalCombustivel;
        System.out.println("O consumo médio de combustível é: " + ConsumoMedio + "Litros a cada 10 Km");
    }
}
