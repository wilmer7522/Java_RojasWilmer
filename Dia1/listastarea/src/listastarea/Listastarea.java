/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listastarea;

import java.util.*;

/**
 *
 * @author wilmer
 */
public class Listastarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ArrayList<Integer> L = new ArrayList<>();
        
        Scanner leer =  new Scanner(System.in);
        
        int n = leer.nextInt();
    
        
        for (int i=0; i< n;i++){
            int val = leer.nextInt();
            
            L.add(val);
              
       }
        
        int Q = leer.nextInt();
        for (int i=0; i<Q;i++){
            leer.nextLine();
            String camb = leer.nextLine();
            
            switch (camb){
                case "Insert":
                    int line = leer.nextInt();
                    int num = leer.nextInt();
            
            
            L.add(line,num);
            break;
            
                case "Delete":
                    
            int del = leer.nextInt();
            L.remove(del);
            break;
            default:
                continue;
            
            }
        
         
            
        }
        for (int i=0; i<L.size();i++){
        System.out.print(L.get(i)+ " ");
        }
        
        leer.close();
    }
}