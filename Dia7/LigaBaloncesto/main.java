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
public class main {
    public static void main(String[] args) {
        
        LocalDate fechaActual = LocalDate.now();
        
        PartidosLiga pl1 = new PartidosLiga(fechaActual,  "Toros", "Los Angeles", 1,0 );
        
        
        pl1.informacionPartido();
        
        
        
        
        
        
    }
    
    
}
