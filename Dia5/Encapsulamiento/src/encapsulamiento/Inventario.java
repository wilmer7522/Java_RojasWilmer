/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

import java.util.*;

public class Inventario {
    public static void main(String[] args) {
        Producto p1 = new Producto("01", "Celular", 20, 500);
        Producto p2 = new Producto("02", "Tablet", 10, 800);
        Producto p3 = new Producto("03", "Laptop", 5, 1000);
        Producto p4 = new Producto("04", "Audifonos", 20, 100);
        
        
        ArrayList<Producto> listaProductos =  new ArrayList<>();
        
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        
        System.out.println(listaProductos);
        
        
        
        p1.actualizarStock(-10);
       
        
    }
    
}
