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
public class AtraccionAbierta implements EstadoAtraccion{
    public String manejar(Visitante visitante) {
        // Lógica para manejar la atracción abierta
        return "Puedes entrar a la atracción";
    }
}
