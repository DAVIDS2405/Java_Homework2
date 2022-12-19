public abstract class Figura {
    protected double area, perimetro;

    // int x, y;
    // double perimetro,area;

    // public void setX(int x) {
    //     this.x = x;
    // }

    // public void setY(int y) {
    //     this.y = y;
    // }

    //los calculos se realizaron desde esta clase padre

    protected abstract void calcular_perimetro ();
    protected abstract void calcular_area();
    

    //creacion de area para poder visualizar en pantalla
    public double getArea() {
        return area;
    }


    //se crea un setter y un geter para obtener el perimetro
    public double getPerimetro() {
        return perimetro;
    }

    
    

}
