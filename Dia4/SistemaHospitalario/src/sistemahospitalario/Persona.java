/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemahospitalario;

/**
 *
 * @author wilmer
 */
public class Persona {
    private int id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String direccion;
    
    public Persona (){
        
    }
    
    
    public Persona(int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String cedula, String direccion ){
       this.id = id;
       this.primerNombre = primerNombre;
       this.segundoNombre = segundoNombre;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.cedula = cedula;
       this.direccion = direccion;
    }
    
     // Getters
    public int getId() {
        return id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }
    
    public String getCedula(){
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return    "ID: " + id + "\n" + "Nombre: " + primerNombre + " " + segundoNombre + " " +  primerApellido+ " " +  segundoApellido+ "\n" + "Cedula: "+ cedula  + "\nDireccion " + direccion+ "\n" ;
    }
    
    
    
}
