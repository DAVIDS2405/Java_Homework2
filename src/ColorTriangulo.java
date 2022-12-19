public class ColorTriangulo extends Triangulo{
    String color;

    ColorTriangulo(String c, String s, double b, double h){
        super(c,b,h);
        color = c;
    }

    public String getColor() {
        return color;
    }
    
    void MostrarColor(){
        System.out.println("El color es: " + color);
    }
}
