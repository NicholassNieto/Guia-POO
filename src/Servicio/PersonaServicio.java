/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author nniet
 */
public class PersonaServicio {
    public Persona caractPersona(){
        Persona p1 = new Persona();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        p1.setApellido(leer.next());
        System.out.println("Ingrese su DNI");
        p1.setDni(leer.nextInt());
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Día");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Año");
        int anio = leer.nextInt();
        System.out.println("Ingrese su estatura");
        p1.setEstatura(leer.nextDouble());
        System.out.println("Informacion recolectada ");
        System.out.println("Nombre: "+ p1.getNombre());
        System.out.println("Apellido: "+p1.getApellido());
        System.out.println("DNI: "+p1.getDni());
        System.out.println("Fecha de nacimiento: "+ dia + "-" + mes + "-" + anio);
        System.out.println("Estatura ingresada: "+p1.getEstatura());
        System.out.println("Muchas gracias");
        return p1;
    }
    
}
