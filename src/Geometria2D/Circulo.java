package Geometria2D;

public class Circulo {

    double radio;
    private double Npi = 3.14;

    //Perimetro area y diametro

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double Area_Cir(Circulo){
        return Npi*Math.pow(radio,2);
    }

    public double Perimetro_Cir(Circulo){
        return Npi *(radio*2);
    }
    public double Diametro_Cir(Circulo){
        return 2*radio;
    }
}
