/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangolo;

import java.util.Scanner;

/**
 *
 * @author Studente
 */
public class AreaPerimetroTriangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, lato1, lato2, altezza, perimetro;
        float area;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Inserisci la base...");
            base = input.nextInt();
        } while (base <= 0);
        do {
            System.out.println("Inserisci il primo lato...");
            lato1 = input.nextInt();
        } while (lato1 <= 0);
        do {
            System.out.println("Inserisci il secondo lato...");
            lato2 = input.nextInt();
        } while (lato2 <= 0);
        do {
            System.out.println("Inserisci l'altezza...");
            altezza = input.nextInt();
        } while (altezza <= 0);
        perimetro=base + lato1+lato2;
        area=(base*altezza)/2;
        System.out.println("Il perimetro è: "+perimetro);
        System.out.println("L'area è: "+area);
        // TODO code application logic here
    }

}
