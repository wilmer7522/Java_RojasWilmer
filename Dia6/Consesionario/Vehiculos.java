/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consesionario;

/**
 *
 * @author wilmer
 */
public class Vehiculos {
     private String marca;
     private String modelo;

    public Vehiculos() {
    }
    
 
   public Vehiculos(String marca){
        this.marca = marca;
    }

    public Vehiculos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void tieneBaul(){
        System.out.println("Tiene baul");
    }
    
    public void mostrarDetalles(){
        System.out.println(marca + modelo );
    }
    
}
