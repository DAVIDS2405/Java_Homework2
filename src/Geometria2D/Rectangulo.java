package Geometria2D;

public class Rectangulo {
    double  base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double Area_Rec(Rectangulo){
        return (base * altura)/2 ;
    }
    public double Perimetro_Rec(Rectangulo){
        return (2 * base)+ (2 * altura);
    }
    public double Diagonal_Rec(Rectangulo){
        double total;
        total = Math.pow(altura,2) + Math.pow(base,2);
        return lado*Math.sqrt(total,2);
    }


}