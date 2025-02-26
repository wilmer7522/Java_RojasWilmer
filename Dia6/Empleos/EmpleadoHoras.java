/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleos;

/**
 *
 * @author wilmer
 */
public class EmpleadoHoras extends Empleado{
    
    private int horasTrabajadas;
    private double salarioHoras;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String nombre, double salario) {
        super(nombre, salario);
    }

    public EmpleadoHoras(int horasTrabajadas, double salrioHoras) {
        this.horasTrabajadas = horasTrabajadas;
        this.salarioHoras = salarioHoras;
    }

    public EmpleadoHoras(String nombre,int horasTrabajadas, double salarioHoras,  double salario) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioHoras = salarioHoras;
    }

    @Override
    public void calcularBonificacion() {
        
        double salarioTotal = horasTrabajadas * salarioHoras;
        setSalario(salarioTotal);
        System.out.println(getNombre()+ " " + getSalario()+ " " + (getSalario() * 10/100));
    }
    
    

    
    
    
    
    
}
