/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ExercicioSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a distância percorrida(Km): ");
        double distancia = scanner.nextDouble();
        System.out.println("Distância percorrida: " + distancia + " Km");
        
        System.out.println("Digite o consumo do carro (km/l): ");
        double consumo = scanner.nextDouble();
        
        System.out.println("Digite o preço do combustível: ");
        double precoCombustivel = scanner.nextDouble();
        
        double quantLitros = distancia / consumo;
        double custoTotal = quantLitros * precoCombustivel;
        
        System.out.printf("O custo estimado com combvustível será de: R$ %.2f%n", custoTotal);
        
        scanner.close();  
    }
    
}
