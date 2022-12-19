public class DosDimensiones {
    private double base, altura; 

    DosDimensiones(){
        base = altura = 0.0;
    }

    DosDimensiones(double a, double b){
        base = b;
        altura = a;
    }
    DosDimensiones (double x){
        base = altura = x;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        this.base = b;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double a) {
        this.altura = a;
    }

    public void mostararDimension(){
        System.out.println("la base es: "+ base + "la altura es" + altura);
    }

    
}
