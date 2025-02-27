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
public class PartidosPlayOff extends Partidos{
    
    private LocalDate fechaPartido;
    private boolean finalizado;

    public PartidosPlayOff() {
    }

    public PartidosPlayOff(String EquipoLocal, String EquipoVisitante, int cestasLocal, int cestasVisitante) {
        super(EquipoLocal, EquipoVisitante, cestasLocal, cestasVisitante);
    }

    public PartidosPlayOff(LocalDate fechaPartido, boolean finalizado) {
        this.fechaPartido = fechaPartido;
        this.finalizado = finalizado;
    }

    public PartidosPlayOff(LocalDate fechaPartido, boolean finalizado, String EquipoLocal, String EquipoVisitante, int cestasLocal, int cestasVisitante) {
        super(EquipoLocal, EquipoVisitante, cestasLocal, cestasVisitante);
        this.fechaPartido = fechaPartido;
        this.finalizado = getCestasLocal() != getCestasVisitante();
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
    
    public void finalizarPartido(){
        if (getCestasLocal() != getCestasVisitante() ){
            finalizado = true;
        }else{
            finalizado =false;
        }
    }

    @Override
    public void informacionPartido() {
        System.out.println("");
    }
    
    
    
    
}
