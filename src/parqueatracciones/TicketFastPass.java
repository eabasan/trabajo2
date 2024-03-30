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
public class TicketFastPass implements Ticket{
     public void entrarAtraccion(Atraccion atraccion, Visitante visitante) {
        System.out.println("Acceso FastPass a la atracción: " + atraccion.getNombre());
    }
}
