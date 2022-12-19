public class Triangulo extends Figura{  //DosDimensiones  {
    // private String estilo;
    // Triangulo(){
    //     super();
    //     estilo = "ninguno";
    // }
    

    // Triangulo (String s, double b, double h){
    //     super(b,h);
    //     estilo = s;
    // }

    // Triangulo(double x){
    //     super(x);
    //     estilo = "Estilo Nuevo";
    // }

    // double area (){
    //     return getAltura() * getBase() / 2;
    // }
    // void mostrar_estilo(){
    //     System.out.println("El triangulo tiene " + estilo);
    // }   

    private double base, altura,lado1,lado2,lado3;
    public Triangulo (double base, double altura, double lado1, double lado2, double lado3){
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        calcular_area();
        calcular_perimetro();
    }
   

    @Override
    protected void calcular_area(){
         area = (base * altura)/2 ;
    }
    @Override
    protected void calcular_perimetro(){
        perimetro = lado1 + lado2 + lado3;
        
    }
}
