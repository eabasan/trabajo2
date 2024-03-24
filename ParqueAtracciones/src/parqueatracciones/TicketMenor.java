/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueatracciones;

/**
 *
 * @author Mettre
 */
public class TicketMenor implements Ticket {
    public void entrarAtraccion(Atraccion atraccion) {
        System.out.println("Acceso para niño a la atracción: " + atraccion.getNombre());
        // Lógica específica para el acceso de un niño a la atracción
    }
}
