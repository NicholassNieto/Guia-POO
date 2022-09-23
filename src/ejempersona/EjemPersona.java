/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejempersona;

import Entidades.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author nniet
 */
public class EjemPersona {
    
    public static void main(String[] args) {
        PersonaServicio vs = new PersonaServicio();
        Persona p1 = vs.caractPersona();
        
    }
    
}
