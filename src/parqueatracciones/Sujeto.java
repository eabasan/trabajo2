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
public interface Sujeto {
    void registrarObservador(Observador observador);
    void eliminarObservador(Observador observador);
    void notificarObservadores();
}
