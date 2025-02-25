/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

import java.util.*;
/**
 *
 * @author wilmer
 */
public class main2 {
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado(1,"Wilmer", 100);
       /* e1.setId(1);
        e1.setNombre("Wilmer");
        e1.setSalario(100);*/
        Empleado e2 = new Empleado(2, "Alexander", 300);
        Empleado e3 = new Empleado(3, "Pedro", 500);
        
        
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        
        
        System.out.println(listaEmpleados + "\n" +"\n");
        
       
    }

public static Empleado mostrarInformacion(ArrayList<Empleado> listaEmpleados, int idEmp){
    for (Empleado empleado : listaEmpleados){
        if (empleado.getId() == idEmp){
        return empleado;
    }
        
    }
return null;
}
        
}
    

