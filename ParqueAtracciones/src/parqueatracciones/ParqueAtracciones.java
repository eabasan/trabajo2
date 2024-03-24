
package parqueatracciones;


public class ParqueAtracciones {

   
    public static void main(String[] args) {
        TicketFactory fabricaTickets = new TicketFactory();

        // Crear diferentes tipos de tickets
        Ticket ticketAdulto = fabricaTickets.crearTicket(TipoTicket.ADULTO);
        Ticket ticketNiño = fabricaTickets.crearTicket(TipoTicket.NIÑO);
        Ticket ticketFastPass = fabricaTickets.crearTicket(TipoTicket.FAST_PASS);

        // Crear una atracción para probar
        Atraccion atraccion = new Atraccion("Montaña Rusa");

        // Simular el acceso a la atracción con cada tipo de ticket
        System.out.println("Simulación de acceso a la atracción:");

        System.out.println("- Ticket de Adulto:");
        ticketAdulto.entrarAtraccion(atraccion);

        System.out.println("- Ticket de Niño:");
        ticketNiño.entrarAtraccion(atraccion);

        System.out.println("- Ticket FastPass:");
        ticketFastPass.entrarAtraccion(atraccion);

        // Patrón Observador: Crear una atracción y suscriptores (visitantes)
        Atraccion montañaRusa = new Atraccion("Montaña Rusa");
        Visitante visitante1 = new Visitante("Alice");
        Visitante visitante2 = new Visitante("Bob");

        // Suscribir los visitantes a la atracción
        montañaRusa.registrarObservador(visitante1);
        montañaRusa.registrarObservador(visitante2);

        // Cambiar el estado de la atracción y notificar a los suscriptores
        montañaRusa.setState(EstadoAtraccion.ABIERTA);

        // Patrón Estrategia: Establecer diferentes estrategias de acceso para los visitantes
        visitante1.setEstrategiaAcceso(ticketAdulto);
        visitante2.setEstrategiaAcceso(ticketFastPass);

        // Probar el acceso de los visitantes a la atracción
        System.out.println("\nAcceso a la atracción después del cambio de estrategia:");
        montañaRusa.entrarAtraccion(visitante1);
        montañaRusa.entrarAtraccion(visitante2);

        // Patrón de Estado: Cambiar el estado de la atracción y probar el comportamiento
        montañaRusa.setState(EstadoAtraccion.CERRADA);
        System.out.println("\nAcceso a la atracción después de cerrar:");
        montañaRusa.entrarAtraccion(visitante1);
        montañaRusa.entrarAtraccion(visitante2);
    }
    }
    
}
