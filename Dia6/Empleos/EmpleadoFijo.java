/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleos;

/**
 *
 * @author wilmer
 */
public class EmpleadoFijo extends Empleado{
    
    private double bonificacion;

    public EmpleadoFijo() {}

    public EmpleadoFijo(String nombre, double salario) {
        super(nombre, salario);
    }

    public EmpleadoFijo(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public EmpleadoFijo(double bonificacion, String nombre, double salario) {
        super(nombre, salario);
        this.bonificacion = bonificacion;
    }
    
    

    @Override
    public void calcularBonificacion() {
        System.out.println(getNombre()+ " " + getSalario()+ " " + " " + (getSalario() * 20 / 100));
    }
    
    
    
    
    
    
}
