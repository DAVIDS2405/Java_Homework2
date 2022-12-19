
public class Cuadrado extends Figura {
    private double lado; 
    public Cuadrado (double lado){
        this.lado = lado;
        calcular_area();
        calcular_perimetro();
    }

    @Override
    protected void calcular_area(){
         area = lado * lado;
    }
    @Override
    protected void calcular_perimetro() {
        perimetro = lado * 4;
        
    }
    
}
