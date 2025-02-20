/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos;

import java.util.*;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author wilmer
 */
public class Ciclos {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        boolean continuar = true;
        while (continuar){
        System.out.println("\n");
        System.out.println("Ingrese la opcion deseada: \n 0)Salir\n 1)Numeros naturales ascendentes\n 2)Numeros Naturales descendentes\n 3)Tabla de Multipicar\n 4)Tabla Multiplicar Inversa\n"
                + "5)Alfabeto ascendente\n 6)Alfabeto Descendente\n  7)Numeros pares hasta el 100\n 8)Numeros Impares hasta el 100\n 9)Suma de numeros naturales\n 10)Suma de numeros Pares\n"
                + "11)Suma de numeros Impares\n 12)Imprimir los valores ASCII\n 13)Encontrar Factorial\n 14)Numero elevado la potencia de otro\n 15)Invertir Digitos\n");
        
        int opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                //Numero naturales ascendente
        int naturales = 1;
        
        System.out.println("Indica hasta donde quieres llegar");
        
        int llegar = leer.nextInt();
        
        for (int i=0; i<llegar;i++){
            System.out.print(naturales+i + " ");
        }break;
        
            case 2:
                //numeros Naturales reverso
        System.out.println("\n");
        System.out.println("Indica desde donde quieres iniciar la cuenta regresiva");
        int naturever = leer.nextInt();
        
        for (int i =naturever; i>=1; i--){
            System.out.print(i + " ");
        } break;
        
            case 3:
               //Tabla de multiplicar
        System.out.println("\n");
        System.out.println("Ingrese el numero de la tabla de multiplicar");
        int tabla = leer.nextInt();
        
        for (int i=1; i<=10;i++){
            System.out.println(tabla + " x " +  i + " = " + tabla * i);
        } break;
        
        
            case 4:
        //Tabla de multiplicar inversa
                System.out.println("Ingresa el numero de la tabla de multiplicar inversa");
                int tablaInv = leer.nextInt();
                for (int i= 10; i>=1; i--){
                    System.out.println(tablaInv + " x " +  i + " = " + tablaInv * i);
                    
                }break;
                
            case 5:
                //ALfabeto Ascendente
                System.out.println("Alfabeto ascendente: ");
                for (char letra = 'A'; letra<='Z'; letra++){
                    System.out.print(letra + " ");
                    
                }break;
                
            case 6:
                //Alfabeto Descendente
                System.out.println("Alfabeto Descendente:");
                for (char alfa = 'Z'; alfa>='A'; alfa--){
                    System.out.print(alfa + " ");
                }break;
                
            case 7:
                //Numeros pares hasta el 100
                System.out.println("Numeros Pares hasta el 100");
                for (int i = 2; i<=100; i= i +2){
                    System.out.print(i + " ");
                }break;
                
            case 8:
                //Numeros Impares hasta el 100
                System.out.println("Numeros Impares hasta el 100");
                for (int i = 1; i<100; i = i+2){
                    System.out.print(i + " ");
                }break;
            case 9:
                //Suma Numeros naturales
                System.out.println("Ingrese el numero hasta donde quiere sumar los numeros naturales");
                
                int sumarNatu = leer.nextInt();
                
                int suma = 0;
                for (int i=0; i<=sumarNatu; i++){
                    suma += i;
                    
                    
                }
                System.out.print("la suma de los numeros naturales de: " + sumarNatu + " es " + suma);
                break;
                
            case 10:
                //Suma de numeros pares
                System.out.println("Ingrese el numero hasta donde quiere sumar los numeros pares");
                int numPar = leer.nextInt();
                int sumaPar = 0;
                for (int i = 2; i<= numPar; i = i + 2){
                    sumaPar += i;
                }
                System.out.print("la suma de los numeros naturales de: " + numPar + " es " + sumaPar);
                break;
                
            case 11:
                //Suma Numeros Impares
                System.out.println("Ingrese el numero hasta donde quiere sumar los numeros Impares");
                int numImpar = leer.nextInt();
                int sumImpar = 0;
                for (int i = 1; i<=numImpar; i = i +2){
                    sumImpar += i;
                }
                System.out.print("la suma de los numeros naturales de: " + numImpar + " es " + sumImpar);
                break;
                
            case 12:
                //Valores ASCII 
                System.out.println("Valores ASCII");
                for (int i=0; i <= 255; i++){
                    System.out.println("Codigo: " + i + " Caracter: " + (char)i);
                }break;
                
            case 13:
                //Factorial de un numero
                System.out.println("Ingrese el numero para encontrar el Factorial");
                int fact = leer.nextInt();
                int a = 1;
                for (int i = 1; i<=fact; i++){
                    
                    a *= i; 
                    
                    
                    
                }
                System.out.println("El factorial de " + fact + " es: " + a);
                break;
                
            case 14:
                //Numero elevado a la potencia de otro
                System.out.println("Ingrese el primer numero que quiere calcular");
                int num1 = leer.nextInt();
                System.out.println("Ingrese la potencia del numero");
                int pot = leer.nextInt();
                double res = 1;
                /*double res = Math.pow(num1, pot);*/
                for (int i=0; i< pot; i++){
                    res *= num1;
                }
                
                System.out.println("El numero " + num1 + " elevado a la potencia " + pot + " = " + res);
                break;
                
                
        
            case 0:
                System.out.println("Saliendo del programa");
                continuar = false;
                break;
        
        
        }
                
        }
        
        
        
        
        
        
    }
    
}


 

