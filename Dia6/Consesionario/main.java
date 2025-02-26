/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consesionario;

/**
 *
 * @author wilmer
 */
public class main {
    
    public static void main(String[] args) {
        Coche c1 = new Coche(4,"camioneta", "1300","suzuki","gand Vitara" );
        Motocicleta m1 = new Motocicleta(" Doble Prposito ", 200, " AKT ", " TT DS ");
        
        c1.tieneBaul();
        m1.mostrarDetalles();
        
        
    }
}
