
package parqueatracciones;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mettre
 */
public class Atraccion implements Sujeto {
    private String nombre;
    private EstadoAtraccion estado;
    private List<Observador> observadores;

    public Atraccion(String nombre) {
        this.nombre = nombre;
        this.estado = new AtraccionAbierta();
        this.observadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }


    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
     public EstadoAtraccion getEstado() {
        return estado;
    }

    public void cambiarEstado(EstadoAtraccion nuevoEstado) {
        this.estado = nuevoEstado;
        notificarObservadores();
    }
}
