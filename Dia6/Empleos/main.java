/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleos;


import java.util.*;
public class main {
    public static void main(String[] args) {
        
        EmpleadoFijo ef1 = new EmpleadoFijo( "Wilmer", 1000);
        
        EmpleadoHoras eh1 = new EmpleadoHoras("Alexander", 30, 50,0);
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        
       /* ef1.calcularBonificacion();
        
        eh1.calcularBonificacion();*/
        
        listaEmpleados.add(ef1);
        listaEmpleados.add(eh1);
        
        
        
        for (Empleado i : listaEmpleados){
            i.calcularBonificacion();
        }
    }
}
