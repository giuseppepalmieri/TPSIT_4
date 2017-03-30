
package verificaproperzi;


public class Retta {
    
    private double a;
    private double b;
    private double c;
   
    public Retta(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String getTipo(){
        String tipo = "obliqua";
        if(this.a == 0){
           tipo = "orizzontale"; 
        }
        if(this.b == 0){
            tipo = "verticale";
        }
        return tipo;
    }
    
    public boolean appartiene(double x, double y){
        if((this.a*x+this.b*y+this.c) == 0){
            return true;
        }
        return false;
    }
    
    public String stampa(){
        String equazione = this.a + "x + " + this.b + "y + " + this.c + " = 0";
        if(a == 0){
            equazione = this.b + "y + " + this.c + " = 0";
        }
        if(b == 0){
            equazione = this.a + "x + " + this.c + " = 0";
        }
        if(c == 0){
            equazione = this.a + "x + " + this.b + "y = 0";
        }
        if((a == 0) && (c == 0)){
            equazione = this.b + "y = 0";
        }
        if((b == 0) && (c == 0)){
            equazione = this.a + "x = 0";
        }
        return equazione; 
    }
    
}
