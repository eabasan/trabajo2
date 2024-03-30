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
public class EstrategiaAccesoFastPass {
    public void accederAtraccion(Visitante visitante, Atraccion atraccion) {
        // Implementación del acceso prioritario (FastPass)
        System.out.println(visitante.getNombre() + " accede a la atracción " + atraccion.getNombre() + " (FastPass)");
    }
}
