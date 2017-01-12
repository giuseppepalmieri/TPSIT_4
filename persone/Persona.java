package persone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Studente
 */
public class Persona {

    private String nome;

    public Persona(String s) {
        this.nome = s;
    }
    public void come_ti_chiami(){
    System.out.println(this.nome);
    }
    
    public void saluta() {
        System.out.println("Ciao a tutti!");

    }
}
