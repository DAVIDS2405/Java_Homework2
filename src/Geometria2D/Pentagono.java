package Geometria2D;

public class Pentagono {
    double lado, apotema;
    private int numlados=5;
    private int alfa=36;

    public Pentagono(double lado) {
        this.lado = lado;
    }


    public double Area_Pent(Pentagono){
        double ap;


        return (base * altura)/2 ;
    }
    public double Perimetro_Pent(Pentagono){
        return numlados * lado;
    }
    public double Apotema_Pent(Pentagono){
        return Math.sqrt((Math.pow(lado,2)) - (Math.pow(alfa,2)),2);
}
