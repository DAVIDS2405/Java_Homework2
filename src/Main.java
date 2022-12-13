import java.util.Scanner;

import Geometria3D.Casquete;

public class Main {
    private static Casquete casquete = new Casquete(0, 0, 0);
     private static Scanner sn = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int opcion = menu_principal();

        while (opcion != 3){

            if (opcion == 1){
                int opcion2 = menu_Geometria2D();
                while (opcion2 !=11){


                    opcion2 = menu_Geometria2D();
                }
            }

            else{

                int opcion3 = menu_Geometria3D();

            }




            opcion = menu_principal();
        }
        
        
        
       
    }

    private static int menu_principal(){
        int opcion = 0;
        while (opcion < 1 || opcion > 3){
            System.out.println("Menu Geometria");
            System.out.println("1.- Figuras 2D");
            System.out.println("2.- Figuras 3D");
            System.out.println("3.- Salir");
            System.out.println("ingrese una opcion ");
            opcion = sn.nextInt();

            if (opcion < 1 || opcion > 3){
                System.out.println("Ingrese valores entre 1 y 3");
            }
        }
        return opcion;
    }

    private static int menu_Geometria2D (){
        int opcion = 0;
        while (opcion < 1 || opcion > 11){
            System.out.println("Menu Geometria");
            System.out.println("1.- Triangulo");
            System.out.println("2.- Cuadrado");
            System.out.println("3.- Circulo");
            System.out.println("4.- Rectangulo");
            System.out.println("5.- Pentagono");
            System.out.println("6.- Hexagono");
            System.out.println("7.- Heptagono");
            System.out.println("8.- Octogono");
            System.out.println("9.- Decagono");
            System.out.println("10.- Endecagono");
            System.out.println("11.- Salir");
            System.out.println("ingrese una opcion ");
            opcion = sn.nextInt();

            if (opcion < 1 || opcion > 11){
                System.out.println("Ingrese valores entre 1 y 3");
            }
        }
        return opcion;
    }

    private static int menu_Geometria3D (){
        int opcion = 0;
        while (opcion < 1 || opcion > 11){
            System.out.println("Menu Geometria");
            System.out.println("1.- Casquete");
            System.out.println("2.- Cilindros");
            System.out.println("3.- Cono");
            System.out.println("4.- Cubo");
            System.out.println("5.- Esfera");
            System.out.println("6.- Octahedro");
            System.out.println("7.- Piramide");
            System.out.println("8.- Prisma");
            System.out.println("9.- Prisa_Triangular");
            System.out.println("10.- Tetrahedro");
            System.out.println("11.- Salir");
            System.out.println("ingrese una opcion ");
            opcion = sn.nextInt();

            if (opcion < 1 || opcion > 11){
                System.out.println("Ingrese valores entre 1 y 3");
            }
        }
        return opcion;
    }

    
}
