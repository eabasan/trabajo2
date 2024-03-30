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
public class Visitante implements Observador{
     private String nombre;
    private Ticket ticket;
    private Atraccion atraccionActual;

    public Visitante(String nombre) {
        this.nombre = nombre;
        this.ticket = ticket;
    }

    public void setAtraccionActual(Atraccion atraccionActual) {
        this.atraccionActual = atraccionActual;
    }

    public void entrarAtraccion() {
        String mensaje = atraccionActual.getEstado().manejar(this);
        System.out.println(nombre + ": " + mensaje);
    }

    @Override
    public void actualizar() {
        // Lógica para manejar la actualización del estado de la atracción
        entrarAtraccion();
    }
}
