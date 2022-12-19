public class Menu {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        Cuadrado cuadrado = new Cuadrado();
        ColorTriangulo t1 = new ColorTriangulo("Azul", "Estilo x", 8.0, 12.0);
        ColorTriangulo t2 = new ColorTriangulo("Rojo", "Estilo y", 4.0, 3.0);
        //la subclase puede heredar atributos y metodos de su clase padre
        rectangulo.setX(20);
        rectangulo.setY(10);
        rectangulo.calcular_perimetro();
        rectangulo.calcular_area();
        System.out.println("Perimetro");
        System.out.println(rectangulo.getPerimetro());
        System.out.println("Area");
        System.out.println(rectangulo.getArea());
        System.out.println("");
        //cuadrados
        cuadrado.setX(4);
        cuadrado.setY(4);
        cuadrado.calcular_perimetro();
        cuadrado.calcular_area();
        System.out.println("Perimetro");
        System.out.println(cuadrado.getPerimetro());
        System.out.println("Area");
        System.out.println(cuadrado.getArea());
        System.out.println("");

        t1.mostrar_estilo();
        t1.mostararDimension();
        t1.MostrarColor();

        System.out.println("");
        t2.MostrarColor();
        t2.mostrar_estilo();
        t2.mostararDimension();
        
    }
    
}
