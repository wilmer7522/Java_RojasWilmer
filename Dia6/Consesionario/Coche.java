/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consesionario;

/**
 *
 * @author wilmer
 */
public class Coche extends Vehiculos{
    
    private int numPuertas;
    private String tipo;
    private String motor;
    
    public Coche(String marca){
        super(marca);
    }
    
    

    public Coche() {}

    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    public Coche(int numPuertas, String tipo, String motor) {
        this.numPuertas = numPuertas;
        this.tipo = tipo;
        this.motor = motor;
    }

    public Coche(int numPuertas, String tipo, String motor, String marca, String modelo) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
        this.tipo = tipo;
        this.motor = motor;
    }

    @Override
    public void tieneBaul() {
        System.out.println("El Coche " + getMarca() + " tiene baul");
    }

   

    
    
    
    
    
    
    
    
    
}
