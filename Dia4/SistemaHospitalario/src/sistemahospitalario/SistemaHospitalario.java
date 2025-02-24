/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemahospitalario;

import java.time.*;
import java.util.*;

public class SistemaHospitalario {

    /**
     * @param args the command line arguments
     */
    
    // Buscar un paciente por nombre
    
    
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Cargo> listaCargo = new ArrayList<>();

        Cargo cargoDoctor = new Cargo(1, "Carlos", "Andrés", "Gómez", "Pérez","1023456789", "Calle 10, Bogotá","Doctor", 5000000);
        Cargo cargoEnfermero = new Cargo(2, "María", "Fernanda", "López", "García",  "1034567890","Avenida 15, Medellín","Enfermero", 3500000);
        Cargo cargoAdministrador = new Cargo(3, "Pedro", "José", "Martínez", "Díaz",  "1045678901","Carrera 7, Cali","Administrador", 4500000);
               
        listaCargo.add(cargoDoctor);
        listaCargo.add(cargoEnfermero);
        listaCargo.add(cargoAdministrador);
        
        
        
        
Persona persona1 = new Persona(4, "Blanca", "Ines", "Moya", "Olaya", "52823985", "Cucuta" );

ArrayList<Persona> listaPersonas = new ArrayList<>();
listaPersonas.add(persona1);

Paciente paciente1 = new Paciente(1, "Juan", "Sebastián", "Martínez", "Díaz", "987654321", "Avenida 5, Cali", LocalDate.of(1990, 6, 15), LocalDate.of(2024, 2, 20));
Paciente paciente2 = new Paciente(2, "Ana", "Gabriela", "Suárez", "Fernández", "123456789", "Calle 12, Barranquilla", LocalDate.of(1985, 9, 22), LocalDate.of(2023, 10, 5));
Paciente paciente3 = new Paciente(3, "Wilmer", "Alexander", "Rojas", "Fuentes", "1034310528", "Cucuta", LocalDate.of(1985, 5, 10), LocalDate.of(2025, 2, 10));

        
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        listaPacientes.add(paciente1);
        listaPacientes.add(paciente2);
        listaPacientes.add(paciente3);
        
        
ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        //Empleados
        Empleado empleado1 = new Empleado(1, "Carlos", "Andrés", "Gómez", "Pérez","1023456789", "Calle 10, Bogotá", cargoDoctor);
        Empleado empleado2 = new Empleado(2, "María", "Fernanda", "López", "García",  "1034567890","Avenida 15, Medellín",cargoEnfermero);
        Empleado empleado3 = new Empleado(3, "Pedro", "José", "Martínez", "Díaz",  "1045678901","Carrera 7, Cali", cargoAdministrador);

        
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        
        
        

        
        
        
        
        
        
        boolean regresar = true;
        while (regresar) { 
        System.out.println("Ingrese la opcion de su preferencia\n 1)Ver Pacientes\n 2)Ver Empleados\n 3)Ver Cargos\n 4)Agregar Empleado\n 0)Salir");
        int opc = leer.nextInt();
        
            
           switch (opc){
               
               case 1:
                    System.out.println("Ingrese el ID del paciente a verificar");
                    leer.nextLine();
        
                    String busca = leer.nextLine();
                
                    boolean encontrado = false;
                    for (Paciente i : listaPacientes){
                        if (i.getCedula().equals(busca)){
                            System.out.println(i + "\n");
                            encontrado = true;
                            break;

                        }
                    }
                    if (!encontrado){
                        System.out.println("No encontrado");
                    } break;
        
        
               case 2:
                   System.out.println("Lista de empleados:");
        for (Empleado emp : listaEmpleados) {
            System.out.println(emp);
        } break;
        
               case 3:
                   System.out.println("Seleccione el cargo");
                   //int cargoInt = leer.nextInt();
                   //Cargo cargoSeleccion = buscarCargoPorId(listaCargo, cargoInt);
        
                   //System.out.println(cargoSeleccion);
                   System.out.println(listaCargo);
                   break;
                   
                   
               case 4:
                   System.out.println(listaPersonas);
                   System.out.println("Ingrese el Id de la persona a ingresar en el cargo");
                   leer.nextLine();
                   String buscar = leer.nextLine();
                   
                   Persona personaSeleccionada = null;
                    for (Persona p : listaPersonas) {
                        if (p.getCedula().equals(buscar)) {
                            personaSeleccionada = p;
                            break;
                        }
                    }
                    
                    if (personaSeleccionada != null){
                        
                        System.out.println("Seleccione el cargo\n1)Doctor\n2)Enfermero\n3)Administrador");
                   int cargoNuevo = leer.nextInt();
                   Cargo cargoSelec = buscarCargoPorId(listaCargo, cargoNuevo);
        
                   System.out.println(cargoSelec);
                   
                   Empleado nuevoEmpleado = new Empleado(personaSeleccionada.getId(), personaSeleccionada.getPrimerNombre(), 
        personaSeleccionada.getSegundoNombre(), personaSeleccionada.getPrimerApellido(), 
        personaSeleccionada.getSegundoApellido(), personaSeleccionada.getCedula(), 
        personaSeleccionada.getDireccion(), cargoSelec);
                   
                   listaEmpleados.add(nuevoEmpleado);
                   
                   
                        System.out.println("Empleado Asignado: " + nuevoEmpleado);
                        
                    }break;
                           
                   
                   
                   
                           
                   
                   
                   
                  
        
        
        
        
        
               case 0: 
                   System.out.println("Cerrando Programa");
                   regresar = false;
                   break;
            
        }
           }
        leer.close();
        
        
    
        
        
        
        
        
               
           } 
    public static Cargo buscarCargoPorId(ArrayList<Cargo> listaCargos, int id) {
        for (Cargo cargo : listaCargos) {
            if (cargo.getId() == id) {
                return cargo;
            }
        }
        return null; // Si no se encuentra el cargo
    }
    
        
    }

    
    
    
     

