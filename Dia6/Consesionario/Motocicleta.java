/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consesionario;

/**
 *
 * @author wilmer
 */
public class Motocicleta extends Vehiculos {

    private String estilo;
    private int cilindraje;


    public Motocicleta() {
    }

    public Motocicleta(String marca) {
        super(marca); // Llama al constructor de la clase padre
    }

    public Motocicleta(String marca, String modelo) {
        super(marca, modelo); // Llama al constructor de la clase padre
    }

    public Motocicleta(String estilo, int cilindraje) {
        this.estilo = estilo;
        this.cilindraje = cilindraje;
    }

    public Motocicleta(String estilo, int cilindraje, String marca, String modelo) {
        super(marca, modelo); // Llama al constructor de la clase padre
        this.estilo = estilo;
        this.cilindraje = cilindraje;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(getMarca() + getModelo() + cilindraje + estilo);
                }         
   
    
}
