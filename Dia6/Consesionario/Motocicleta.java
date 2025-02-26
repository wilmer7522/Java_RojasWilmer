/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consesionario;

/**
 *
 * @author wilmer
 */
public class Motocicleta extends Vehiculos{
    
    private String estilo;
    private String cilindraje;

    public Motocicleta() {
    }

    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    public Motocicleta(String estilo, String cilindraje) {
        this.estilo = estilo;
        this.cilindraje = cilindraje;
    }

    public Motocicleta(String estilo, String cilindraje, String marca, String modelo) {
        super(marca, modelo);
        this.estilo = estilo;
        this.cilindraje = cilindraje;
    }
    
    
  

    
    
    
    
    
}
