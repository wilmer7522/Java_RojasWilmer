/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LigaBaloncesto;

import java.util.*;
import java.time.*;


public class Partidos {
    private String EquipoLocal;
    private String EquipoVisitante;
    private int cestasLocal;
    private int cestasVisitante;
   

    public Partidos() {
    }

    public Partidos(String EquipoLocal, String EquipoVisitante, int cestasLocal, int cestasVisitante) {
        this.EquipoLocal = EquipoLocal;
        this.EquipoVisitante = EquipoVisitante;
        this.cestasLocal = cestasLocal;
        this.cestasVisitante = cestasVisitante;
    }

    public String getEquipoLocal() {
        return EquipoLocal;
    }

    public void setEquipoLocal(String EquipoLocal) {
        this.EquipoLocal = EquipoLocal;
    }

    public String getEquipoVisitante() {
        return EquipoVisitante;
    }

    public void setEquipoVisitante(String EquipoVisitante) {
        this.EquipoVisitante = EquipoVisitante;
    }

    public int getCestasLocal() {
        return cestasLocal;
    }

    public void setCestasLocal(int cestasLocal) {
        this.cestasLocal = cestasLocal;
    }

    public int getCestasVisitante() {
        return cestasVisitante;
    }

    public void setCestasVisitante(int cestasVisitante) {
        this.cestasVisitante = cestasVisitante;
    }
    
    

    
    
    public void informacionPartido(){
        System.out.println("La informacion del partido");
    }
    
    
    public void finalizarPartido(){
        if (getCestasLocal() != getCestasVisitante()){
            System.out.println("Partido finalizado");
        }else{
            System.out.println("El partido no puede finalizar en empate. Debe continuar hasta que haya un ganador.");
        }
    }

    
}
