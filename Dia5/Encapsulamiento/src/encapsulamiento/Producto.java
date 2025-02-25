/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author wilmer
 */
public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto() {}

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCantidad(int cantidad){
        if (cantidad > 0){
        this.cantidad = cantidad;
           
        }else{
            System.out.println("La cantidad no puede ser negativa");
        }
    }
    
    public void setPrecio(double precio){
        if (precio >0 ){
        this.precio = precio;
        }else{
            System.out.println("El precio debe ser Mayor a cero");
        }
        
        
    }
    
    public void actualizarStock(int cantidad2){
        
        if (cantidad2 > 0){
            cantidad = cantidad + cantidad2;
            System.out.println("Se agregaron " + cantidad2 + " unidades. Cantidad disponible: " + cantidad);
            
        }else if (cantidad2 < 0){
            if(cantidad + cantidad2 < 0){
                System.out.println("intente retirar un monto menor");
            }else {
                cantidad = cantidad + cantidad2;
                System.out.println("Se retiraron " + (-cantidad2) + " unidades. Cantidad disponible: " + cantidad);
            }
                
                    
            }else{
                System.out.println("Debes ingresar una cantidad diferente a 0");
            }
        }

    @Override
    public String toString() {
        return "Productos\n" + "Codigo: " + codigo + "\nNombre " + nombre + "\nCantidad " + cantidad + "\nPrecio " + precio;
    }
    
    
    
    
    
}
