public class Figura {

    int x, y;
    double perimetro,area;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    //los calculos se realizaron desde esta clase padre

    public void calcular_perimetro (){
        perimetro = 2*x + 2*y;
    }
    public void calcular_area(){
        area = x*y;
    }

    

    //creacion de area para poder visualizar en pantalla
    public double getArea() {
        return area;
    }


    //se crea un setter y un geter para obtener el perimetro
    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    

}
