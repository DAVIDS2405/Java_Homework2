package Geometria2D;

public class Cuadrado {
    double lado;

    //perimetro area diamtetro

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double Area_Cuad(Cuadrado cuadrado){
        return Math.pow(lado,2);
    }
    public double Perimetro_Cuad(Cuadrado cuadro){
        return 4*lado;
    }
    public double Diagonal_Cuad(Cuadrado cuadrado){
        return lado*Math.sqrt(2.0);
    }


}
