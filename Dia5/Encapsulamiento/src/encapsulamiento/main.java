/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author wilmer
 */
public class main {
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Wilmer");
        p1.setEdad(40);
        
        
        System.out.println(p1.getNombre() + " " + p1.getEdad());
        
        
        CuentaBancaria c1 = new CuentaBancaria("werfssf",10000000);
        
        System.out.println(c1.getSaldo());
        
        c1.depositar(250000);
        System.out.println(c1.getSaldo());
        
        
        c1.retirar(180000);
        System.out.println(c1.getSaldo());
        
        CuentaAhorro ca1 = new CuentaAhorro(c1.getNumeroCuenta(), c1.getSaldo(),5);
        
        
        ca1.aplicarInteres();
    }
    
    
}
