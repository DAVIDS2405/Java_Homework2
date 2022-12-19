import java.util.Scanner;

public class Menu {
    private static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        // Rectangulo rectangulo = new Rectangulo();
        // Cuadrado cuadrado = new Cuadrado();
        // ColorTriangulo t1 = new ColorTriangulo("Azul", "Estilo x", 8.0, 12.0);
        // ColorTriangulo t2 = new ColorTriangulo("Rojo", "Estilo y", 4.0, 3.0);
        // //la subclase puede heredar atributos y metodos de su clase padre
        // rectangulo.setX(20);
        // rectangulo.setY(10);
        // rectangulo.calcular_perimetro();
        // rectangulo.calcular_area();
        // System.out.println("Perimetro");
        // System.out.println(rectangulo.getPerimetro());
        // System.out.println("Area");
        // System.out.println(rectangulo.getArea());
        // System.out.println("");
        // //cuadrados
        // cuadrado.setX(4);
        // cuadrado.setY(4);
        // cuadrado.calcular_perimetro();
        // cuadrado.calcular_area();
        // System.out.println("Perimetro");
        // System.out.println(cuadrado.getPerimetro());
        // System.out.println("Area");
        // System.out.println(cuadrado.getArea());
        // System.out.println("");

        // t1.mostrar_estilo();
        // t1.mostararDimension();
        // t1.MostrarColor();

        // System.out.println("");
        // t2.MostrarColor();
        // t2.mostrar_estilo();
        // t2.mostararDimension();


        // System.out.println("");
        // System.out.println(cuadrado.calcular_area());
        // System.out.println(cuadrado.calcular_perimetro());

        int opcion = menu();
        while (opcion != 4){
            if (opcion == 1){
                
                System.out.println( "ingrese la base de su triangulo");
                double longitudBase = sn.nextDouble();

                System.out.println( "ingrese la altura de su triangulo");
                double longitudAltura = sn.nextDouble();

                System.out.println("ingrese el valor del lado 1");
                double longitudLado1 = sn.nextDouble();

                System.out.println("ingrese el valor del lado 2");
                double longitudLado2 = sn.nextDouble();
                System.out.println("ingrese el valor del lado 3");
                double longitudLado3 = sn.nextDouble();

                
                 Triangulo triangulo = new Triangulo(longitudBase, longitudAltura, longitudLado1, longitudLado2, longitudLado3);
                 System.out.println(triangulo.getArea());
                 System.out.println(triangulo.getPerimetro());
                 

            }
            else if (opcion == 2){
                System.out.println("ingrese la base del rectangulo");
                double longitudBase = sn.nextDouble();
        
                System.out.println("ingrese la altura del rectangulo");
                double longitudAltura = sn.nextDouble();
        
                Rectangulo rectangulo = new Rectangulo(longitudBase, longitudAltura);
                System.out.println(rectangulo.getArea());
                System.out.println(rectangulo.getPerimetro());

            }
            else if (opcion == 3){
            System.out.println("ingrese el valor del lado del cuadrado");
            double longitudlado = sn.nextDouble();

            Cuadrado cuadrado = new Cuadrado(longitudlado);
            System.out.println(cuadrado.getArea());
            System.out.println(cuadrado.getPerimetro());

            }

            opcion = menu();
        }

        
        sn.close();
        
    }


    private static int menu(){
        int opcion = 0;
        while (opcion < 1 || opcion >4){
            System.out.println("1.- Triangulo \n" +"2.- Rectangulo \n" + "3.- Cuadrado \n" + "4.- Salir");
            opcion = sn.nextInt();
            
        }
        return opcion;
       
    }
    
}
