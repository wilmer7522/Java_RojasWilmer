/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author wilmer
 */
public class Empleado {
    private int idEmp;
    private String nombreEmp;
    private double salarioEmp;

    public Empleado() {}

    public Empleado(int idEmp, String nombreEmp, double salarioEmp) {
        this.idEmp = idEmp;
        this.nombreEmp = nombreEmp;
        this.salarioEmp = salarioEmp;
    }

   
    
    public int getId(){
        return idEmp;
    }
    
    public String getNombre(){
        return nombreEmp;
    }
    
    public double getSalario(){
        return salarioEmp;
    }
    
    public void setId(int idEmp){
       
        this.idEmp = idEmp;
       
        
    }
    
    
    public void setNombre(String nombreEmp){
        this.nombreEmp = nombreEmp;
    }
    
    public void setSalario(double salarioEmp){
        if (salarioEmp > 0){
        this.salarioEmp = salarioEmp;
        }else{
            System.out.println("El salario no puede ser negativo");
        }
    }

    @Override
    public String toString() {
        return "Empleado\n" + "Id: " + idEmp + "\nNombre " + nombreEmp + "\nSalario " + salarioEmp+ "";
    }

  
        
    }
    
    
    
    

