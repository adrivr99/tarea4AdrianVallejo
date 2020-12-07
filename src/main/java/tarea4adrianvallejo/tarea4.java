/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4adrianvallejo;

/**
 *
 * @author adriv
 */
public class tarea4 {
    int numero1;
    int numero2;
    int numero3;

    public tarea4() {
    }

    public tarea4(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    @Override
    public String toString() {
        return "tarea4{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", numero3=" + numero3 + '}';
    }
    
    
}
