/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rettangolo;
 import java.util.Scanner;
/**
 *
 * @author Studente
 */
public class Rettangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserisci la base...");
    int lato = input.nextInt();
    System.out.println("Inerisci l'altezza...");
    int altezza = input.nextInt();
    int area = lato*altezza;
    System.out.println("Area="+area);
    }
    
}
