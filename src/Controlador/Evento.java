/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author nanohp
 */
public class Evento {

    TipoEvento tipoEvento;
    Object info;

    public Evento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Evento(TipoEvento tipoEvento, Object info) {
        this.tipoEvento = tipoEvento;
        this.info = info;
    }

    public Object getInfo() {
        return info;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }
}
