/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemahospitalario;

import java.util.ArrayList;

public class Cargo extends Persona{
    private int id;
    private String nombreCargo;
    
    private double sueldoBase;

    
    public Cargo(int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,String cedula, String direccion, String nombreCargo, double sueldoBase) {
        super(id, primerNombre, segundoNombre, primerApellido, segundoApellido,cedula, direccion);
        
      this.id = id;
        this.nombreCargo = nombreCargo;
   
        this.sueldoBase = sueldoBase;
    }

    

    public int getId() {
        return id;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    

    public double getSueldoBase() { // Obtener el sueldo base del cargo
        return sueldoBase;
    }
    
    

    @Override
    public String toString() {
    
    
        return "Cargo: " + nombreCargo + "\nSueldo: " + sueldoBase + "\n";
    }
}

