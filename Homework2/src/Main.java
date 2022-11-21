import java.util.Scanner;


public class Main {
    //array que nos permite ingresar nuestros vehiculos
     static Vehiculos vehiculo[] = new Vehiculos[5];
    //Main
    public static void main(String[] args) throws Exception {

        int opcion = menu();
        while(opcion != 3){
            if (opcion == 1){
                System.out.println("");
                System.out.println("Vehiculos a ingresar");
                //funcion para llenar los vehiculos
                Llenar_Vehiculos();
                System.out.println("");

            }

            else if (opcion == 2){
                System.out.println("");
                System.out.println("Datos de los vehiculos ingresados");
                //funcion para mostrar nuestros vehiculos
                mostrar_vehiculos();
                System.out.println("");
                
            }
            else if (opcion == 3){
                System.exit(0);
            }
            //Nuevamente regresamos al menu principal para seguir hasta que se ingrese el numero 3
            opcion = menu();
        }

        
    }

    //Menu para poder ver y acceder a las opciones para ingresar vehiculo como verlos
    public static int menu() {
        Scanner sn = new Scanner(System.in);
        int opcion = 0;
        while ((opcion > 3) || (opcion < 1)){
            System.out.println("Menu de vehiculos");
            System.out.println("1.- Ingresar un vehiculo");
            System.out.println("2.- Ver los vehiculos");
            System.out.println("3.- Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = sn.nextInt();
            if ((opcion > 3) || (opcion < 1)){
                System.out.println("Ingrese un valor entre 1 y 3");
            }
        }
        return opcion;
        
    }

    //Permite ingresar vehiculos a nuestro array predefinido arriba
    public static void Llenar_Vehiculos(){
        String Marca_Vehiculo, Modelo_Vehiculo, Color_Vehiculo, Tipo_Vehiculo, Motor_Vehiculo, Placa_Vehiculo;
        int  Precio_Vehiculo, Ruedas_Elices_Aletas;
        Scanner sn = new Scanner(System.in);
        
        //Pedimos los datos
        for(int i = 0; i < vehiculo.length; i++){
            System.out.println("");
            System.out.println("Vehiculo Nº" + (i+1));
            System.out.println("Placa");
            Placa_Vehiculo = sn.nextLine();
            System.out.print("Marca ");
            Marca_Vehiculo = sn.nextLine();
            System.out.print("Modelo ");
            Modelo_Vehiculo = sn.nextLine();
            System.out.print("Color ");
            Color_Vehiculo = sn.nextLine();
            System.out.print("Tipo de vehiculo ");
            Tipo_Vehiculo = sn.nextLine();
            System.out.print("Motor ");
            Motor_Vehiculo = sn.nextLine();
            System.out.print("Precio ");
            Precio_Vehiculo = sn.nextInt();
            System.out.print("Numero de ruedas, elices o aletas del vehiculo ");
            Ruedas_Elices_Aletas = sn.nextInt();
            sn.nextLine();
            System.out.println("");


            //Creamos un objeto vehiculos y lo ingresamos dentro de nuestro array
            vehiculo[i] = new Vehiculos(Placa_Vehiculo,Tipo_Vehiculo, Motor_Vehiculo,Color_Vehiculo,Marca_Vehiculo,Precio_Vehiculo,Modelo_Vehiculo,Ruedas_Elices_Aletas);
        }
          
    } 

    //Mostrar datos de los vehiculos
    public static void mostrar_vehiculos(){
        for (Vehiculos imprimir_vehiculos: vehiculo){
            imprimir_vehiculos.Ver_Vehiculos();
        }
    }

}

