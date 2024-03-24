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
public class TicketFactory {
    public Ticket crearTicket(int tipo) {
        switch (tipo) {
            case TipoTicket.ADULTO:
                return new TicketAdulto();
            case TipoTicket.NIÑO:
                return new TicketMenor();
            case TipoTicket.FAST_PASS:
                return new TicketFastPass();
            default:
                throw new IllegalArgumentException("Tipo de ticket no válido: " + tipo);
        }
    }
}
