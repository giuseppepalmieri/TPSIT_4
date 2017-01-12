/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persone;

/**
 *
 * @author Studente
 */
public class Persone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1, p2;
        int a;
        p1=new Persona("Marco");
        p2=new Persona("Anna");
        p1.come_ti_chiami();
        p1.saluta();
        p2.come_ti_chiami();
        p2.saluta();
                
        // TODO code application logic here
    }
    
}
