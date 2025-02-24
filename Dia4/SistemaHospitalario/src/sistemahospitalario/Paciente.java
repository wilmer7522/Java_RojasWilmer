/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemahospitalario;

import java.time.LocalDate;

public class Paciente extends Persona{
   
    
    private LocalDate fechaNac;
    private LocalDate fechaIngreso;

    public Paciente(int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String cedula, String direccion, LocalDate fechaNac, LocalDate fechaIngreso) {
        super(id, primerNombre, segundoNombre, primerApellido, segundoApellido, cedula, direccion);
        this.fechaNac = fechaNac;
        this.fechaIngreso = fechaIngreso;
    }

    

    

    
    
    // Getters
    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    // Setters
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Paciente:\n" + super.toString()  + "Fecha de Nacimiento: " + fechaNac + "\nFecha de Ingreso: " + fechaIngreso;
    }

    
    
    
    
    
    
    
    
}

    
    
    
            





