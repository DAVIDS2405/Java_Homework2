package Geometria3D;

import java.util.Scanner;

public class Casquete {
    Scanner sc =  new Scanner(System.in);
    
    //Atributtes

    private double Radio_Circulo;
    private double Radio_Casquete;
    private double Altura_Casquete;
    private final double  Pi = 3.14;
    


    //constructor
    
    public Casquete(double radio_Circulo, double radio_Casquete, double altura_Casquete) {
        Radio_Circulo = radio_Circulo;
        Radio_Casquete = radio_Casquete;
        Altura_Casquete = altura_Casquete;
    }
    

    //methods

    public  double Calcular_Area_Casquete( double RadioCirculo, double AlturaCasquete ){
        Radio_Circulo = RadioCirculo;
        Altura_Casquete = AlturaCasquete;
        return  2 * Pi * Radio_Circulo * Altura_Casquete;
    }
    


}
