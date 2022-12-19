//hijo de figura extends palabra reservada para crear subclases
public class Rectangulo extends Figura{

    private double base, altura;
    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
        calcular_area();
        calcular_perimetro();
    }

    @Override
    protected void calcular_area(){
        area = base * altura;
    }
    
    @Override
    protected void calcular_perimetro() {
        perimetro = base * 2 + altura * 2;
    }
    

    
    
    
}
