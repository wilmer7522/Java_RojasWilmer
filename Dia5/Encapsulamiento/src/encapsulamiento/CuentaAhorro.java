/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author wilmer
 */
public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;

    public CuentaAhorro() {}

    public CuentaAhorro(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public CuentaAhorro( String numeroCuenta, double saldo, double tasaInteres) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres(){
        return tasaInteres;
    }
    
    public void setTasaInteres(double tasaInteres){
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        if (tasaInteres > 0) {
            double nuevoSaldo = getSaldo() + (getSaldo() * tasaInteres / 100);
        setSaldo(nuevoSaldo);
            System.out.println("Interés aplicado. Nuevo saldo: " + getSaldo());
        } else {
            System.out.println("La tasa de interés debe ser mayor a 0.");
        }
    }
    
    @Override
    public String toString() {
        return "CuentaAhorro{" + "tasaInteres=" + tasaInteres + '}';
    }

    

    
    
    
    
    
    
    
}
