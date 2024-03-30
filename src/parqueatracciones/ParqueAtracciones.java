
package parqueatracciones;


public class ParqueAtracciones {

   
    public static void main(String[] args) {
      // Crear atracciones
        Atraccion montanaRusa = new Atraccion("Montaña Rusa");
        Atraccion noria = new Atraccion("Noria");

        // Crear visitantes
        Visitante juan = new Visitante("Juan", TipoTicket.ADULTO, 18);
        Visitante maria = new Visitante("Maria", TipoTicket.NIÑO, 12);
        Visitante pedro = new Visitante("Pedro", TipoTicket.ADULTO, 25);

        // Registrar visitantes como observadores de las atracciones
        montanaRusa.registrarObservador(juan);
        montanaRusa.registrarObservador(pedro);
        noria.registrarObservador(maria);

        // Cambiar estado de las atracciones
        montanaRusa.cambiarEstado(new AtraccionAbierta());
        noria.cambiarEstado(new AtraccionCerrada());

        // Visitantes intentan entrar a las atracciones
        juan.entrarAtraccion();
        maria.entrarAtraccion();
        pedro.entrarAtraccion();
    }
    
}
