/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LigaBaloncesto;

import java.time.LocalDate;

/**
 *
 * @author wilmer
 */
public class PartidosLiga extends Partidos{
    
     private LocalDate fechaPartido;
    private boolean finalizado;

    public PartidosLiga() {
    }

    public PartidosLiga(String EquipoLocal, String EquipoVisitante, int cestasLocal, int cestasVisitante) {
        super(EquipoLocal, EquipoVisitante, cestasLocal, cestasVisitante);
    }

    public PartidosLiga(LocalDate fechaPartido, boolean finalizado) {
        this.fechaPartido = fechaPartido;
        this.finalizado = finalizado;
    }

    public PartidosLiga(LocalDate fechaPartido,  String EquipoLocal, String EquipoVisitante, int cestasLocal, int cestasVisitante) {
        super(EquipoLocal, EquipoVisitante, cestasLocal, cestasVisitante);
        this.fechaPartido = fechaPartido;
        this.finalizado = finalizado;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        
        this.finalizado = finalizado;
    }
    
    
    
    @Override
    public void finalizarPartido(){
        if (getCestasLocal() != getCestasVisitante()){
            System.out.println("Partido finalizado");
        }else{
            System.out.println("El partido no puede finalizar en empate. Debe continuar hasta que haya un ganador.");
        }
    }

    @Override
    public void informacionPartido() {
        System.out.println(getEquipoLocal() + " = "  + getCestasLocal() + " Vs " + getEquipoVisitante() + " = "  + getCestasVisitante() + "\nFinalizado " + finalizado);
    }

   
    
    
    
}
