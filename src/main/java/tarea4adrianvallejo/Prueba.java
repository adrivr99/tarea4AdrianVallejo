/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4adrianvallejo;

/**
 *
 * @author Enrique
 */
public class Prueba {
    public static void main(String[] args) {
        tarea4 miNumero = new tarea4(15, 20, 35);
        tarea4 miNumero1 = new tarea4(20, 03, 1999);
        tarea4 miNumero2 = new tarea4();
        
        System.out.println("Los valores de miNumero son: " + miNumero.getNumero1() + " " + miNumero.getNumero2() + " " + miNumero.getNumero3());
        System.out.println("");
        
        miNumero1.toString();
        System.out.println("");
        
        System.out.println(miNumero2);
    }
}
