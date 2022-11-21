public class Vehiculos {

    //ATTRIBUTES
    String Placa;
    String Tipo_De_Vehiculo;
    String Motor_De_Vehiculo;
    String Color;
    String Marca;
    int Precio;
    String Modelo;
    int Ruedas_Elices_Aletas_Vehiculo;
    

    //METHODS
    public  void encender_vehiculo(){

    }
    public void apagar_de_vehiculo(){

    }
    public void acelera_de_vehiculo(){

    }
    public void frenar_de_vehiculo(){

    }

    //CONSTRUCTOR
    
    //GETTER AND SETTER
    public String getPlaca() {
        return Placa;
    }
    public Vehiculos(String placa, String tipo_De_Vehiculo, String motor_De_Vehiculo, String color, String marca,
            int precio, String modelo, int ruedas_Elices_Aletas_Vehiculo) {
        Placa = placa;
        Tipo_De_Vehiculo = tipo_De_Vehiculo;
        Motor_De_Vehiculo = motor_De_Vehiculo;
        Color = color;
        Marca = marca;
        Precio = precio;
        Modelo = modelo;
        Ruedas_Elices_Aletas_Vehiculo = ruedas_Elices_Aletas_Vehiculo;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public String getTipo_De_Vehiculo() {
        return Tipo_De_Vehiculo;
    }
    public void setTipo_De_Vehiculo(String tipo_De_Vehiculo) {
        Tipo_De_Vehiculo = tipo_De_Vehiculo;
    }
    public String getMotor_De_Vehiculo() {
        return Motor_De_Vehiculo;
    }
    public void setMotor_De_Vehiculo(String motor_De_Vehiculo) {
        Motor_De_Vehiculo = motor_De_Vehiculo;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    
    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public int getRudas_Elices_Aletas_Vehiculo() {
        return Ruedas_Elices_Aletas_Vehiculo;
    }
    public void setRudas_Elices_Aletas_Vehiculo(int rudas_Elices_Aletas_Vehiculo) {
        Ruedas_Elices_Aletas_Vehiculo = rudas_Elices_Aletas_Vehiculo;
    }
    
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    
    //Funtion for menu 


    public void Ver_Vehiculos(){
        System.out.println("");
        System.out.println("Marca " + getMarca());
        System.out.println("Modelo " + getModelo());
        System.out.println("Precio " + getPrecio());
        System.out.println("Color " + getColor());
        System.out.println("Tipo de vehiculo" + getTipo_De_Vehiculo());
        System.out.println("Motor del vehiculo " + getMotor_De_Vehiculo());
        System.out.println("Rudas Elices o Aletas " + getRudas_Elices_Aletas_Vehiculo());
        System.out.println("");
    }
   
    
}
