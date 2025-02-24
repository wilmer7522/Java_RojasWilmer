/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemahospitalario;

/**
 *
 * @author wilmer
 */
public class Empleado extends Persona{
    
    private Cargo cargo;//llama la clase cargo

    public Empleado(int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,String cedula, String direccion, Cargo cargo) {
        super(id, primerNombre, segundoNombre, primerApellido, segundoApellido,cedula, direccion);
        this.cargo = cargo;
        
        
    }
    
    public Cargo getCargo(){
        return cargo;
    }

    @Override
    public String toString() {
        return super.toString()  + cargo;
    }
    
    

   
    
    
}
