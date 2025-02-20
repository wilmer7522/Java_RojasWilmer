/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validparentheses;

import java.util.*;
/**
 *
 * @author wilmer
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        ArrayList<Character>  lista = new ArrayList<>();
        for (int i=0; i < s.length();i++){
            char a = s.charAt(i);
            if ( a== '(' || a== '{' || a== '['){
                lista.add(a);
            }else{
                if (lista.isEmpty()) return false;
                char signoObtenido = lista.remove(lista.size()-1);
                if ((a == ')' && signoObtenido != '(')||
                (a == '}' && signoObtenido != '{') ||
                (a == ']' && signoObtenido != '[')){
                    return false;
                }
            }
        }
        return lista.isEmpty();
    }
}
